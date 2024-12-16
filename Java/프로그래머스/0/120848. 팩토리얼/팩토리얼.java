class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            int fact = factorial(i);
            if (fact > n) {
                answer = i-1;
                break;
            }
            else if(fact == n){
                answer = i;
                break;

            }
        }
        return answer;
    }

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}