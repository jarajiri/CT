import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < my_string.length(); i++) {
            set.add(my_string.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}