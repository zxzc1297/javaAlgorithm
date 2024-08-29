package com.example.javaAlgorithm.lecture5;
import java.util.*;

/**
 * 2. 괄호문자제거
 * 설명
 *
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 *
 * 출력
 * 남은 문자만 출력한다.
 *
 *
 * 예시 입력 1
 *
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 * 예시 출력 1
 *
 * EFLM
 */
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ')'){
                stack.push(s.charAt(i));
            } else {
                while(stack.peek() != '('){
                    stack.pop();
                }
                // '(' 빼주기
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            //스택은 역순으로 나오니 앞에 인서트
            sb.insert(0, stack.pop());
        }

        System.out.print(sb.toString());
        sc.close();
    }
}
