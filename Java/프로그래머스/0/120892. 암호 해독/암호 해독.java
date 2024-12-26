import java.util.*;

class Solution {
    public String solution(String cipher, int code) {
        String[] cipherArr = cipher.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = code-1; i < cipherArr.length; i+= code ){
            sb.append(cipherArr[i]);
        }
        return sb.toString();    
    }
}