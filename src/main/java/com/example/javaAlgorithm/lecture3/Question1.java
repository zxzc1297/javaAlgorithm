package com.example.javaAlgorithm.lecture3;
import java.util.*;

/**
 * 1. 두 배열 합치기
 * 설명
 *
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 *
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 *
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 *
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 * 예시 출력 1
 *
 * 1 2 3 3 5 6 7 9
 */
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++)
            arr.add(sc.nextInt());

        int m = sc.nextInt();

        for(int j=0; j<m; j++)
            arr.add(sc.nextInt());

        Collections.sort(arr);

        for(int k=0; k<arr.size(); k++)
            System.out.print(arr.get(k) + " ");

        sc.close();
    }


    /**
     * 강사 풀이
     * 투 포인터 알고리즘
     */
    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];

        for(int j=0; j<m; j++)
            b[j] = sc.nextInt();

        ArrayList<Integer> answer = new ArrayList<>();

        int p1=0, p2=0;

        while(p1<n && p2<m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        for(int k=0; k<answer.size(); k++)
            System.out.print(answer.get(k) + " ");
    }
}
