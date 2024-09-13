import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int lastIdx = num_list.length-1;
        if(num_list[lastIdx] > num_list[lastIdx-1]){
            answer[num_list.length] = num_list[lastIdx] - num_list[lastIdx-1];            
        }else{
            answer[num_list.length] = num_list[lastIdx] * 2;
        }
        return answer;
    }
}