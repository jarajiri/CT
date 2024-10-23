import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < k; i++) {
            x.append(".");
            y.append("x");
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                list.add(picture[i].replaceAll("[.]",x.toString()).replaceAll("[x]",y.toString()));
            }
        }
        return list.toArray(new String[0]);
    }
}