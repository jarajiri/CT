
class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < numlist.length; j++) {
                int leftDistance = Math.abs(numlist[minIdx] - n);
                int rightDistance = Math.abs(numlist[j] - n);
                if (leftDistance > rightDistance || 
                    leftDistance == rightDistance && numlist[minIdx] < numlist[j]) {
                    minIdx = j;
                }
            }

            if (i != minIdx) {
                int temp = numlist[i];
                numlist[i] = numlist[minIdx];
                numlist[minIdx] = temp;
            }
        }
        return numlist;
    }
}