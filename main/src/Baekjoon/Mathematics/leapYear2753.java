package Baekjoon.Mathematics;

//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leapYear2753 {
    public static void main(String[] args) throws IOException {
        /*
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

       if(num%4 == 0) {
           if(num % 400 == 0) {
               System.out.println("1");
           }
           else if(num % 100 == 0) {
               System.out.println("0");
           }
           else System.out.println("1");
       } else System.out.println("0");
    }
}
