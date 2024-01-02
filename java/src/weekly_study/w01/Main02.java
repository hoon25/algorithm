package weekly_study.w01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * BFS로 풀음
 * Service Load Factor
 * <p>
 * 당신은 여러 서비스들로 이루어진 어플리케이션을 만들고 있습니다. 이 서비스들중 하나는 유저들로부터 요청을 받는 시작점이 되며, 해당 요청은 다시 각각 의존관계에 있는 다른 서비스들로 요청을 보냅니다.
 * <p>
 * 서비스들간의 관계를 나타내는 아래 형태의 DAG(Directed Acyclic Graph)가 주어졌을 때, 각 서비스들의 부하율(load factor)을 구하세요. 각 서비스의 부하율은 시작점에서 1 unit의 부하를 받았을때 최종적으로 받게되는 부하의 합을 나타냅니다. 이 부하율은 해당 서비스가 의존관계로부터 받은 모든 부하의 합입니다.
 * 위 예제에서 A가 시작지점이고 1의 부하를 받을 경우, B는 1의 부하를, C는 2의부하를, D 또한 2의 부하를 받게됩니다. (A:1, B:1, C:2, D:2)
 * A는 시작점으로 1의 부하를 받음
 * B는 A로부터 부하를 받으므로 1의 부하를 받음
 * C는 A와 B로부터 각 1씩 부하를 받으므로 2의 부하를 받음
 * D는 C로부터 부하를 받으므로 C가 가진 2의 부하를 그대로 받음
 * <p>
 * <p>
 * 입력은 아래와 같습니다:
 * service_list: 문자열로 구성된 배열이 주어지며 service_name=dependency1,dependency2와 같은 형태로 주어집니다. 만약 서비스로 존재하지 않는 dependency가 있다면 무시합니다.
 * entrypoint: 부하의 시작점에 해당하는 서비스명을 나타냅니다.
 * 출력은 각 서비스별로 배열상에 [service_name*load_factor] 형태로 나타나며 서비스 이름으로 정렬하여 리턴합니다.
 */
public class Main02 {
    public static String[] getLoadFactors(String[] service_list, String entrypoint) {
        Map<String, String[]> serviceMap = new HashMap<>();
        Map<String, Integer> answerMap = new HashMap<>();
        // hashmap 키 설정 하고, 그에 맞는 값 넣어주기
        for (String service : service_list) {
            String[] headAndNexts = service.split("=");
            if (headAndNexts.length == 2) {
                serviceMap.put(headAndNexts[0], headAndNexts[1].split(","));
            } else {
                serviceMap.put(headAndNexts[0], new String[]{});
            }
            answerMap.put(headAndNexts[0], 0);
        }

        Queue<String> queue = new LinkedList<>(List.of(entrypoint));
        while (!queue.isEmpty()) {
            String head = queue.poll();
            if (serviceMap.containsKey(head)) {
                answerMap.put(head, answerMap.get(head) + 1);
                String[] tails = serviceMap.get(head);
                queue.addAll(List.of(tails));
            }
        }

        String[] answers = new TreeMap<>(answerMap).entrySet().stream()
                .map(entry -> entry.getKey() + "*" + entry.getValue())
                .toList()
                .toArray(new String[0]);
        System.out.println(Arrays.toString(answers));
        return answers;
    }

    public static void main(String[] args) {
        getLoadFactors(new String[]{"logging=", "user=logging", "orders=user,foobar", "recommendations=user,orders", "dashboard=user,orders,recommendations"}, "dashboard");
        // [“dashboard*1”, “logging*4”, “orders*2”, “recommendations*1”, “user*4”]

        getLoadFactors(new String[]{"D=", "C=D", "B=C", "A=B,C"}, "A");
        // [“A*1”, “B*1”, “C*2”, “D*2”]
    }
}
