package Baekjoon.String;

import java.util.Scanner;

public class findAlphabet10809 {
    public static void main(String[] args) {
        // a - z 를 모두 출력 + 해당 문자의 위치 출력하기

        Scanner in = new Scanner(System.in);

        int[] alphabet = new int[26];

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        String s = in.nextLine();

        for(int i = 0; i < s.length(); i++) {
            if(alphabet[s.charAt(i)-'a'] == -1) {
                alphabet[s.charAt(i)-'a'] = i;
            }
        }

        for(int val : alphabet) {
            System.out.println(val + " ");
        }
    }
}
