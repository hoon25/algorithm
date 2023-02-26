package baekjoon.basic.b2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max_num = -1;
        int max_idx = -1;

        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            if (max_num < num) {
                max_idx = i;
                max_num = num;
            }
        }

        System.out.println(max_num);
        System.out.println(max_idx);
    }
}
