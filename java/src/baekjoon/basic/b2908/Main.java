package baekjoon.basic.b2908;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        /* 원시
        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            sbA.append(A.charAt(i));
            sbB.append(B.charAt(i));
        }

        int a = Integer.parseInt(sbA.toString());
        int b = Integer.parseInt(sbB.toString());

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        */

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(Math.max(A, B));

    }
}
