class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        String answer = "";
        for (String[] arr : db) {
            if (arr[0].equals(id) && arr[1].equals(pw)) {
                answer = "login";
                break;
            } else if (arr[0].equals(id)) {
                answer = "wrong pw";
                break;
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}