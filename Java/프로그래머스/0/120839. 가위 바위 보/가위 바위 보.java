class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        String[] split = rsp.split("");
        for (String s : split) {
            if(s.equals("0")){
                sb.append("5");
            } else if (s.equals("2")) {
                sb.append("0");
            } else{
                sb.append("2");
            }
        }
        return sb.toString();
    }
}