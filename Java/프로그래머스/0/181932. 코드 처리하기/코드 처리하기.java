class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        for (int idx = 0; idx < code.length(); idx++) {
            char c = code.charAt(idx);
            if( mode == 0 ){
                if(c != '1' && idx % 2 == 0){
                    ret.append(code.charAt(idx));
                }else if(c == '1'){
                    mode = 1;
                }
            }else{
                if(c != '1' && idx % 2 == 1){
                    ret.append(code.charAt(idx));
                }else if(c == '1'){
                    mode = 0;
                }
            }
        }
        return ret.toString().isEmpty() ? "EMPTY" : ret.toString();
    }
}