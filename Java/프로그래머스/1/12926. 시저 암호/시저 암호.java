import java.util.Arrays;

// 프로그래머스 시저암호
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Solution {
    public String solution(String s, int n){
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        String answer="";
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if (Character.isLowerCase(c)) { // 소문자인 경우
                sb.append((char)('a' + (c - 'a' + n) % 26));
            } else if (Character.isUpperCase(c)) { // 대문자인 경우
                sb.append((char)('A' + (c - 'A' + n) % 26));
            } else { // 알파벳이 아닌 경우 (공백 등)
                sb.append(c);
            }
        }
        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
}

