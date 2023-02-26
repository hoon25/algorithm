package baekjoon.basic.b4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < C; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            double sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double avg = sum / N;
            double count = 0;

            for (int j = 0; j < N; j++) {
                if (avg < arr[j]) {
                    count += 1;
                }
            }
            System.out.printf("%.3f%%\n", count / N * 100);
        }
    }
}
