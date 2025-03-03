
class Solution {
    public int[] solution(int[] numlist, int n) {
        int N = numlist.length;

        for (int i = 1; i < N; i++) {
            int key = numlist[i];
            int keyDist = Math.abs(key - n);
            int j = i - 1;

            // 정렬된 부분에서 삽입 위치 찾기
            while (j >= 0) {
                int prevDist = Math.abs(numlist[j] - n);

                if (prevDist < keyDist ||
                    (prevDist == keyDist && numlist[j] >= key)) {
                    break; // 정렬 조건을 만족하면 종료
                }

                numlist[j + 1] = numlist[j]; // 한 칸 뒤로 이동
                j--;
            }

            numlist[j + 1] = key; // 적절한 위치에 삽입
        }
        return numlist;
    }
}