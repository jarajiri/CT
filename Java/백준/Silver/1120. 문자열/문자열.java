import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String strA = st.nextToken();
        String strB = st.nextToken();

        int diff = strA.length();

        for (int i = 0; i < strB.length() - strA.length() + 1; i++) {
            int v = 0;
            for (int j = 0; j < strA.length(); j++)
                if (strA.charAt(j) != strB.charAt(j+i)) {
                    v += 1;
                }
            if(diff>v) diff=v;
        }

        System.out.println(diff);

    }
}
