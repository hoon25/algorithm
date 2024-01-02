package weekly_study.w01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 우선순위 큐로 풀음
 * Commit Offset
 * <p>
 * offset 값으로 이루어진 배열이 주어집니다. offset은 0 이상의 정수이며 중복은 없습니다.
 * 이 배열의 값들은 index-0부터 차례로 처리되며, 각 offset이 주어질때마다 우리는 해당 offset과 함께 현재까지 받은 offset들중 최대한 높은 offset을 commit하려고합니다.
 * <p>
 * Commit을 하기 위해서는 0부터 해당 offset까지의 값들이 모두 있어야 합니다.
 * 즉, offset 2를 commit하기 위해서는 0, 1, 2를 모두 가지고있어야합니다.
 * 만약 해당 offset을 받은 시점에 추가로 commit 할 수 없으면 -1을 리턴합니다.
 * <p>
 * Offset들로 이루어진 배열이 주어지고 차례로 처리했을 때, 각각의 시점에서 commit할 수 있는 가장 높은 offset(처리할 수 없다면 -1)을 담은 배열을 리턴하세요.
 * <p>
 * 예제 1:
 * 입력: [2, 0, 1]
 * 출력: [-1, 0, 2]
 * 설명:
 * 2: 2를 commit 하기 위해서 0과 1이 필요한데 아직 없으므로 -1을 리턴합니다
 * 0: 현재까지 [0, 2]의 offset을 받았으며 처리할 수 있는 가장 큰 offset은 0입니다
 * 1: 이제 1의 offset이 생겼으므로 현재까지 [0, 1, 2]의 offset을 받았으며, 이 때 처리할 수 있는 가장 높은 offset은 2입니다
 * <p>
 * 예제 2:
 * 입력: [0, 1, 2]
 * 출력: [0, 1, 2]
 * <p>
 * 예제 3:
 * 입력: [2, 1, 0, 5, 4]
 * 출력: [-1, -1, 2, -1, -1]
 * <p>
 * 예제 4:
 * 입력: [2, 1, 0, 5, 4, 3]
 * 출력: [-1, -1, 2, -1, -1, 5]
 * <p>
 * 예제 5:
 * 입력: [2, 1, 0, 5, 4, 3, 9, 7, 6, 8]
 * 출력: [-1, -1, 2, -1, -1, 5, -1, -1, 7, 9]
 * <p>
 * 예제 6:
 * 입력: [3, 0, 2, 4, 1, 7, 6, 5, 9]
 * 출력: [-1, 0, -1, -1, 4, -1, -1, 7, -1]
 * <p>
 * 구현할 method:
 * public int[] commitOffsets(int[] offsets) {
 * // implementation
 * }
 */


public class Main01 {
    public static int[] commitOffsets(int[] offsets) {
        int maxOffset = -1;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> answers = new ArrayList<>();

        for (int offset : offsets) {
            minHeap.add(offset);
            Integer min = minHeap.peek();
            if (maxOffset + 1 != min) {
                answers.add(-1);
                continue;
            }
            while (maxOffset + 1 == min) {
                minHeap.poll();
                min = minHeap.peek();
                maxOffset++;
                if (min == null) {
                    break;
                }
            }
            answers.add(maxOffset);
        }
        int[] array = answers.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        commitOffsets(new int[]{0, 1, 2});
        commitOffsets(new int[]{2, 1, 0, 5, 4});
        commitOffsets(new int[]{2, 1, 0, 5, 4, 3});
    }

}
