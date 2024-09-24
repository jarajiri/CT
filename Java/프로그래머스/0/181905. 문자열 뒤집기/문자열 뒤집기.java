class Solution {
    public String solution(String my_string, int s, int e) {
            StringBuilder sb = new StringBuilder(my_string);
            while(s < e){
                char tmp = sb.charAt(e);
                sb.setCharAt(e, sb.charAt(s));
                sb.setCharAt(s,tmp);
                s++;
                e--;
            }
            return sb.toString();
    }
}