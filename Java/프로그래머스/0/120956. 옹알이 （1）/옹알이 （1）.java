class Solution {
    public int solution(String[] babbling){
        int N = babbling.length;
        int count = 0;
        for(int i = 0; i < N; i++){
            babbling[i] = babbling[i].replace("aya","-");
            babbling[i] = babbling[i].replace("ye","-");
            babbling[i] = babbling[i].replace("woo","-");
            babbling[i] = babbling[i].replace("ma","-");
            babbling[i] = babbling[i].replace("-","");
            
            if(babbling[i].isEmpty()) count++;            
        }
        return count;
    }
}