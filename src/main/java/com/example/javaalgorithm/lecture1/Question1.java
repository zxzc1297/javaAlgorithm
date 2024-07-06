package com.example.javaalgorithm.lecture1;

import java.util.Scanner;
/*
1. 문자 찾기
설명

한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


입력
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

문자열은 영어 알파벳으로만 구성되어 있습니다.


출력
첫 줄에 해당 문자의 개수를 출력한다.


예시 입력 1
Computercooler
c
예시 출력 1
2
 */
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        String character = sc.nextLine();
        character = character.toLowerCase();
        char target = sc.next().charAt(0);
        target = Character.toLowerCase(target);

        for(char c : character.toCharArray()){
            if(c == target)
                answer++;
        }
        System.out.println(answer);
        sc.close();
    }
}