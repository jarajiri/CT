class Solution {
    public int solution(String num_str) {
                int sum = 0;
        String[] split = num_str.split("");
        for (String s : split) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}