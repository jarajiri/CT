class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
//        알파벳이 대문자로 변환되어야 하는지 소문자로 변환되어야 하는지 나타내는 toUpper 변수선언
        boolean toUpper = true;
        for(char c : s.toCharArray()){
            if(!Character.isAlphabetic(c)){
                sb.append(c);
                // 공백다음의 문자는 무조건 대문자
                toUpper = true;
            } else {
                if(toUpper){
                    sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(Character.toLowerCase(c));
                }
                toUpper=!toUpper;
            }
        }

        return sb.toString();
    }
}