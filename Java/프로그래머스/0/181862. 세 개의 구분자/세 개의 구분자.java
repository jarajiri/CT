import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        char[] charArray = myStr.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == 'a' || charArray[i] == 'b' || charArray[i]=='c'){
                charArray[i] = ' ';
            }
        }
        String[] split = String.valueOf(charArray).trim().split("\\s+");
        if(split[0].isEmpty()) split[0] = "EMPTY";
        return split;
    }
}