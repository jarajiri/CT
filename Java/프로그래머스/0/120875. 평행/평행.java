class Solution {
    public static int solution(int[][] dots) {
        if(isParallel(0,1,2,3,dots)) return 1;
        if(isParallel(0,2,1,3,dots)) return 1;
        if(isParallel(1,2,0,3,dots)) return 1;
        return 0;
    }

    public static boolean isParallel(int a, int b, int c, int d, int[][] dots) {
        int x = (dots[a][0] - dots[b][0]) * (dots[c][1] - dots[d][1]);
        int y = (dots[a][1] - dots[b][1]) * (dots[c][0] - dots[d][0]);
        return x == y;
    }
}