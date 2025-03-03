

class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                int leftDistance = Math.abs(numlist[i] - n);
                int rightDistance = Math.abs(numlist[j] - n);
                if (leftDistance > rightDistance) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                } else if (leftDistance == rightDistance) {
                    if (numlist[i] < numlist[j]) {
                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
            }
        }
        return numlist;     
    }
}