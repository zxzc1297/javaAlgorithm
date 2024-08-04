package com.example.javaalgorithm.lecture4;
import java.util.*;
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character,Integer> candidates = new HashMap<>();
        String votes = sc.next();

        char ans = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            candidates.put(votes.charAt(i), candidates.getOrDefault(votes.charAt(i),0) + 1);
        }

        for(Map.Entry<Character,Integer> map : candidates.entrySet()){
            char key = map.getKey();
            int val = map.getValue();

            if(cnt < val){
                ans = key;
                cnt = val;
            }

        }

        System.out.print(ans);
        sc.close();
    }
}
