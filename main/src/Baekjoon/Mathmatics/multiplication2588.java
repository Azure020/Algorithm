package Baekjoon.Mathmatics;

import java.util.Scanner;

public class multiplication2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        for(int i = 2; i >= 0; i--) {
            System.out.println(a * (b.charAt(i) - '0'));
        }
//        System.out.println(a * (b.charAt(2) - '0'));
//        System.out.println(a * (b.charAt(1) - '0'));
//        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
