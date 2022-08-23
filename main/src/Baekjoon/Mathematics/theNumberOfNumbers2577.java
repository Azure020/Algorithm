package Baekjoon.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class theNumberOfNumbers2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int[] count = new int[10];
        String num = String.valueOf(a*b*c);
        for(int i = 0; i < num.length(); i++) {
            count[num.charAt(i) - '0']++;
        }
        for(int v : count) {
            System.out.println(v);
        }

    }
}
