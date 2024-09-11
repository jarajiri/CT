class Solution {
    public int solution(int a, int b) {
        String ab = ""+a+b;        
        String ab2 = String.valueOf(2*a*b);
        return Math.max(Integer.parseInt(ab), Integer.parseInt(ab2));    
    }
}