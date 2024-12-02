class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x=0, y=0, direction=0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        for(int i=1;i<=n*n;i++){
            answer[y][x]=i;
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if(nx<0||ny<0||nx>=n||ny>=n||answer[ny][nx]!=0){
                direction = (direction+1)%4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx; y = ny;             
        }
        return answer;
    }
}