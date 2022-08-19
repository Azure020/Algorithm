package Baekjoon.Mathmatics;

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class aDivisionB1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        System.out.println(a/b);
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double num1 = sc.nextDouble();
//        double num2 = sc.nextDouble();
//
//        System.out.println(num1/num2);
//    }
