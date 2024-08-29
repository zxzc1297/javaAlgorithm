package com.example.javaAlgorithm.lecture6;
import java.util.*;

/**
 * 2. 버블 정렬
 * 설명
 *
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 *
 * 정렬하는 방법은 버블정렬입니다.
 *
 *
 * 입력
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 *
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 *
 *
 * 출력
 * 오름차순으로 정렬된 수열을 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * 6
 * 13 5 11 7 23 15
 * 예시 출력 1
 *
 * 5 7 11 13 15 23
 */
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; i++){
            int tmp = arr[i];

            int j = i-1;
            while(j >= 0 && tmp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tmp;
        }

        for(int a : arr)
            System.out.print(a + " ");

        sc.close();
    }
}
