import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        br.close();
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i)-'0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer i : arr) {
            sb.append(i);
        }
        System.out.println(sb);

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str = br.readLine();
        // br.close();
        //
        // // 문자열을 char 배열로 변환하고 각 문자를 Integer로 변환 후 정렬
        // String result = Arrays.stream(str.split(""))
        //         .map(Integer::parseInt)
        //         .sorted(Collections.reverseOrder())
        //         .map(String::valueOf)
        //         .reduce("", String::concat);
        //
        // System.out.println(result);
    }
}
