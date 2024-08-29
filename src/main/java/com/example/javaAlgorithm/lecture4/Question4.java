package com.example.javaAlgorithm.lecture4;
import java.util.*;

/**
 * 4. 모든 아나그램 찾기
 * 설명
 *
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 *
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 *
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 *
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 *
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 *
 *
 * 예시 입력 1
 *
 * bacaAacba
 * abc
 * 예시 출력 1
 *
 * 3
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();

        Map<Character, Integer> matches = new HashMap<>();
        Map<Character, Integer> answers = new HashMap<>();

        int answer = 0;

        for (int i = 0; i < T.length; i++) {
            matches.put(T[i], matches.getOrDefault(T[i], 0) + 1);
        }

        for (int i = 0; i < T.length; i++) {
            answers.put(S[i], answers.getOrDefault(S[i], 0) + 1);
        }

        if (answers.equals(matches)) answer++;

        for (int i = T.length; i < S.length; i++) {
            answers.put(S[i], answers.getOrDefault(S[i], 0) + 1);
            answers.put(S[i - T.length], answers.getOrDefault(S[i - T.length], 0) - 1);

            if (answers.get(S[i - T.length]) < 1)
                answers.remove(S[i - T.length]);

            if(answers.equals(matches))
                answer++;
        }

        sc.close();
    }
}
