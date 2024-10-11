
class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] - 'a' == 0) {
                charArray[i] = 'A';
            } else if (charArray[i] > 'B' && charArray[i] < 'Z') {
                charArray[i] = (char) (charArray[i] - 'A' + 'a');
            }
        }
        return String.valueOf(charArray);
    }
}