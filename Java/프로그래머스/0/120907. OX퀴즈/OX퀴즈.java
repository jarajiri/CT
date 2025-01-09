class Solution {
    public String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] susic = quiz[i].split(" ");
            int x = Integer.parseInt(susic[0]);
            int y = Integer.parseInt(susic[2]);
            int z = Integer.parseInt(susic[4]);
            if (susic[1].equals("+")) result[i] = x + y == z ? "O" : "X";
            else result[i] = x - y == z ? "O" : "X";            
        }
        return result;
    }
}