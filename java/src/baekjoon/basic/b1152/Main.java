package baekjoon.basic.b1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine().strip();

        if (sentence.equals("")) {
            System.out.printf("%d", 0);
        }
        else{
            String[] s = sentence.split(" ");
            System.out.printf("%d", s.length);
        }
    }
}
