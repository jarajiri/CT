class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i = 4; i <=n; i++){
            int d = 0;
            for(int j = 1; j <= i; j++){
                if(i % j  == 0) d++;
            }
            if(d >= 3) result++;            
        }
        return result;
    }
}