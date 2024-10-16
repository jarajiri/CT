import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        for (int i = 0; i < rank.length; i++) {
            if (!attendance[i]) {
                rank[i] = rank.length + 1;
            }
        }
        int[] copyRank = Arrays.copyOf(rank, rank.length);
        Arrays.sort(rank);
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < copyRank.length; i++) {
            if(rank[0]==copyRank[i]) a = i;
            if(rank[1]==copyRank[i]) b = i;
            if(rank[2]==copyRank[i]) c = i;
        }
        return a*10000+b*100+c;        
    }
}