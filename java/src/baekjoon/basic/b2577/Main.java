package baekjoon.basic.b2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String multiple = Integer.valueOf(A * B * C).toString();
        int result[] = new int[10];
        for (int i = 0; i < multiple.length(); i++) {
            result[multiple.charAt(i)-'0']++;
        }
        for (int res : result) {
            System.out.printf("%d\n", res);
        }
    }
}
