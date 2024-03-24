// 프로그래머스 삼각 달팽이
// https://school.programmers.co.kr/learn/courses/30/lessons/68645
public class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int v=1;
        int x=0,y=0;

        while (true){
            // 아래로 이동하는 경우
            while(true) {
                triangle[y][x] = v++;
                // 배열의 길이를 넘어가거나 이미 값이 있는경우
                if (y + 1 == n || triangle[y + 1][x] != 0) break;
                y += 1;
            }
            // 아래로 이동후 오른쪽으로 이동시 예외 처리
            if(x+1 == n || triangle[y][x+1]!=0) break;
            // 오른쪽으로 이동
            x+=1;
            // 오른쪽으로 이동하는경우
            while(true){
                triangle[y][x] = v++;
                if(x+1 == n || triangle[y][x+1] !=0) break;
                x+=1;
            }
            if(triangle[y-1][x-1] !=0) break;
            x-=1;
            y-=1;
            // 왼쪽 위로 이동하는 경우
            while(true){
                triangle[y][x] = v++;
                    if(triangle[y-1][x-1]!=0) break;
                    x-=1;
                    y-=1;
            }
            if(y+1==n || triangle[y+1][x] !=0) break;
            y+=1;

        }
        int[] result = new int[v-1];

        int idx = 0;
        for (int i =0;i<n;i++){
            for (int j = 0; j <= i; j++) {
                result[idx++] = triangle[i][j];
            }
        }
        return result;
    }
}
