class Solution {
    public static int solution(int n) {
        int gcd = getGCD(n, 6);
        int ggg = n * 6 / gcd;
        return ggg / 6;
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;
        return getGCD(num2, num1 % num2);
    }
}