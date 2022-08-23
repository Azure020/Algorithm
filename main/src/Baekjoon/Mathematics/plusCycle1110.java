package Baekjoon.Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class plusCycle1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        int a = num;

        while(true) {
            int left = a / 10, right = a % 10;
            int sum = left + right;

            a = right * 10 + sum % 10;
            count++;

            if (a == num) break;
        }
        System.out.println(count);
    }
}
