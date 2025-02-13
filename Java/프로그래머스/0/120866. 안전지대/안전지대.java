class Solution {
    public static int solution(int[][] board) {
        int answer = 0;
        int length = board.length;
        int[][] temp = new int[length + 2][length + 2];
        // 배열 복사
        for (int i = 1; i < length + 1; i++) {
            for (int j = 1; j < length + 1; j++) {
                temp[i][j] = board[i - 1][j - 1];
            }
        }
        // 위험지대 마킹
        for (int i = 1; i < temp.length - 1; i++) {
            for (int j = 1; j < temp.length - 1; j++) {
                if (temp[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (temp[k][l] != 1) temp[k][l] = 2;
                        }
                    }
                }
            }
        }
        // 카운트
        for (int i = 1; i < temp.length - 1; i++) {
            for (int j = 1; j < temp.length - 1; j++) {
                if (temp[i][j] == 0) answer++;
            }

        }
        return answer;
    }
}