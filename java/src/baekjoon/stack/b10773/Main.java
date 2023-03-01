package baekjoon.stack.b10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                st.pop();
            } else {
                st.push(n);
            }
        }
        int sum = 0;

        for (int o : st) {
            sum += o;
        }

        System.out.println(sum);
    }
}
