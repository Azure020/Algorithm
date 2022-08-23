package Baekjoon.Mathematics;

import java.util.Scanner;

public class aSumB1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1+num2);
    }
}

/*
 * 코드 1등? 의 사람의 코드 이해 및 설명
 * IOException 을 이용한 코드(입출력 예외 처리)
 * public class Main {
 *     public static void main(String[] args) throws IOException {
 *           //throws IOExeception 을 해주어야 컴파일 에러가 나지 않음.
 *           //기본적으로 ASCII 코드 값이 입력 됨.
 *         int a = System.in.read();
 *           //숫자 하나를 입력받아 그대로 출력하고자 할 때에 쓰는 코드
 *         System.in.read();
 *         int b = System.in.read();
 *         System.in.read();
 *         a=a-48;
 *           //아스키코드로 0은 48이기 때문에 48을 빼주어야 함.
 *         b=b-48;
 *         System.out.println(a+b)
 *     }
 * }
 */
