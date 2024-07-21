package com.example.javaalgorithm.lecture2;
import java.util.*;
public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int answer = length - 1;
        for(int i=2; i<=length; i++){
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    answer--;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    /**
     * 에라에라토스테네스 체
     */
    public static void isPrime(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int answer = 0;
        int[] isPrime = new int[length+1];
        for(int i=2; i<=Math.sqrt(length); i++){
            if(isPrime[i] == 0){
                for(int j=i*i; j<isPrime.length; j=j+i){
                    isPrime[j] = 1;
                }
            }
        }

        for(int i=2; i<=length; i++){
            if(isPrime[i] == 0) {
                answer++;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
