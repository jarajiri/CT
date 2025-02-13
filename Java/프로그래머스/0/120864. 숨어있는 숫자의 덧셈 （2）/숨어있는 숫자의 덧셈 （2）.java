class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    answer += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }        
        }

        if (sb.length() > 0) answer += Integer.parseInt(sb.toString());
        return answer;
    }
}