import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
    String[] split = myString.split("x");
    List<String> list = new ArrayList<>();
    for (String s : split) {
        if (!s.isEmpty()) {
            list.add(s);
        }
    }
    Collections.sort(list);
    return list.toArray(new String[0]);
    }
}