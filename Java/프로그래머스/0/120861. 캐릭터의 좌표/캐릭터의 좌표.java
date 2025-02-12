class Solution {
    public static int[] solution(String[] keyinput, int[] board) {
        int width = board[0] / 2;  
        int height = board[1] / 2;
        int x = 0, y = 0;

        for (String d : keyinput) {
            if (d.equals("left") && x > -width) {
                x--;
            } else if (d.equals("right") && x < width) {
                x++;
            } else if (d.equals("down") && y > -height) {
                y--;
            } else if (d.equals("up") && y < height) {
                y++;
            }
        }
        return new int[]{x, y};
    }
}