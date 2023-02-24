package baekjoon.basic.b2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
//
//        int A = in.nextInt();
//        String B = in.next();
//
//        in.close();
//        System.out.println(A * (B.charAt(2) - '0'));
//        System.out.println(A * (B.charAt(1) - '0'));
//        System.out.println(A * (B.charAt(0) - '0'));
//        System.out.println(A * (Integer.parseInt(B)));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        char[] b = B.toCharArray();

        System.out.println(A * (b[2] - '0'));
        System.out.println(A * (b[1] - '0'));
        System.out.println(A * (b[0] - '0'));
        System.out.println(A * Integer.parseInt(B));
    }
}
