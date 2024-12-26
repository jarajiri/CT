import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLowerCase(arr[i].charAt(0))) arr[i] = arr[i].toUpperCase();
            else arr[i] = arr[i].toLowerCase();
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}