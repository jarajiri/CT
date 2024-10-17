class Solution {
    public String solution(String n_str) {
        String[] split = n_str.split("");
        boolean isLeft = true;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("0") && isLeft) {
                split[i] = "";
            }
            else if(!split[i].equals("0")){
                isLeft = false;
            }
        }
        return String.join("", split);
    }
}