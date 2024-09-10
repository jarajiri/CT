import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c >= 64 && c <= 90){// 대문자
                c += 32;
                System.out.print(c);
            }
            else{
                c -=32;
                System.out.print(c);
            }
        }
    }
}