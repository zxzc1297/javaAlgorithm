package com.example.javaalgorithm.lecture1;
import java.util.*;

/**
 * 5. 특정 문자 뒤집기
 * 설명
 *
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * a#b!GE*T@S
 * 예시 출력 1
 *
 * S#T!EG*b@a
 */
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int lt = 0;
        int rt = arr.length - 1;
        while(lt<rt){
            if(Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])){
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
                continue;
            }

            if(!Character.isAlphabetic(arr[lt])){
                lt++;
            }

            if(!Character.isAlphabetic(arr[rt])){
                rt--;
            }

        }
        System.out.println(String.valueOf(arr));
    }
}
