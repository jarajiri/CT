class Solution {
    public int solution(String my_string) {
        String removed = my_string.replaceAll("[A-z]","");
        int sum = 0;
        for(int i=0; i<removed.length(); i++){
            sum += removed.charAt(i) - '0';
        }
        return sum;
    }
}