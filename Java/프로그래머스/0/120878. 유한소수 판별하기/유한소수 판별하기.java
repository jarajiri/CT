class Solution {
public static int solution(int a, int b) {
        int gcd = getGCD(a, b);
        //기약 분수가 아니면 최대 공약수로 나눔
        if (gcd != 1) {
            b /= gcd;
        }
        //소인수 판별
        if(hasOnlyTwoAndFive(b)) return 1;
        return 2;
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }

    public static boolean hasOnlyTwoAndFive(int n) {
        while (n % 2 == 0) n /= 2; // 2로 나누기
        while (n % 5 == 0) n /= 5; // 5로 나누기
        return n == 1; // 남은 값이 1이면 2와 5만 존재
    }
}