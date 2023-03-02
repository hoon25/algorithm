package baekjoon.queue.b11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int j = 0;
        while (queue.size() > 1){
            j++;
            if (j == K) {
                sb.append(queue.poll()).append(", ");
                j = 0;
            }
            else {
                queue.offer(queue.poll());
            }
        }

        sb.append(queue.poll()).append('>');
        System.out.println(sb);
        Object A = new Object();
    }
}
