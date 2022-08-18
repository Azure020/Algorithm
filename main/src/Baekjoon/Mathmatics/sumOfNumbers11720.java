package Baekjoon.Mathmatics;

import java.io.IOException;
import java.util.Scanner;

public class sumOfNumbers11720 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
