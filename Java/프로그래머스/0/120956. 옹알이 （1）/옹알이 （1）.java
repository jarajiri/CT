import java.util.*;

class Solution {
    public int solution(String[] babbling){
        String[] can = {"aya", "ye", "woo", "ma"};
        int[] counts = new int[babbling.length];
        for (int i = 0; i < babbling.length; i++) {
            int count = 0;
            String replace = "";
            for (int j = 0; j < 4; j++) {
                if (babbling[i].contains(can[j])) {
                    babbling[i] = babbling[i].replace(can[j], " ");
                    count++;
                }
            }
            if (babbling[i].isBlank()) {
                counts[i] = count;
            }
        }
        return (int) Arrays.stream(counts).filter(i->i>0).count();
    }
}