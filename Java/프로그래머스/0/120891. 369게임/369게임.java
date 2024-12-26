

class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = order + "";
        String[] num = strOrder.split("");
        for(int i = 0; i < num.length; i++){
            if(num[i].equals("3") || num[i].equals("6") || num[i].equals("9")){
                answer++;
            }      
        }
        return answer;
    }
}