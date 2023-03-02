package baekjoon.stack.b9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String PS = br.readLine();
            Stack<Character> st = new Stack<>();

            for (int j = 0; j < PS.length(); j++) {
                char word = PS.charAt(j);
                if (st.empty()) {
                    st.push(word);
                } else if (st.peek() == '(' && word == ')') {
                    st.pop();
                } else {
                    st.push(word);
                }
            }
            if (st.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
