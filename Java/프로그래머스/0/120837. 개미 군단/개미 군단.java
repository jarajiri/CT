class Solution {
    static int answer;

    public static int solution(int hp) {
        int remain = countJang(hp);
        int normal = countBong(remain);
        answer += normal;
        return answer;
    }

    private static int countBong(int remain) {
        answer += remain / 3;
        return remain % 3;
    }

    private static int countJang(int hp) {
        answer += hp / 5;
        return hp % 5;
    }

    public static void main(String[] args) {
        System.out.println("solution(23) = " + solution(999));
    }
}