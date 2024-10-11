import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        String[] split = my_string.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if(!split[i].isEmpty())
                list.add(split[i]);
        }
        return list.toArray(new String[0]);
    }
}