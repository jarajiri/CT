class Solution {
    public int solution(String my_string) {
        String[] split = my_string.split(" ");
        int answer = 0;
        boolean flag = true;
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("+")){
                flag = true;
            }
            else if(split[i].equals("-")){
                flag = false;
            }
            else{
                if (flag) answer += Integer.parseInt(split[i]);
                else answer -= Integer.parseInt(split[i]);
            }
        }
        return answer;
    }
}