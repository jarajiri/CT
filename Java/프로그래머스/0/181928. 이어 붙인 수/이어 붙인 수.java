class Solution {
    public int solution(int[] num_list) {
                StringBuilder concatOdd = new StringBuilder();
        StringBuilder concatEven = new StringBuilder();

        for (int i : num_list) {
            if(i % 2 == 0){
                concatEven.append(i);
            }
            else {
                concatOdd.append(i);
            }
        }
        return Integer.parseInt(concatOdd.toString()) + Integer.parseInt(concatEven.toString());
    }
}