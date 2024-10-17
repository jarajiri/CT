class Solution {
    public String solution(String n_str) {
        String[] split = n_str.split("");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("0")) {
                split[i] = "";
            }
            else{
                break;
            }
        }
        return String.join("", split);
    }
}