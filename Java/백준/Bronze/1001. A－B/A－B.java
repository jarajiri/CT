import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M;

    //main
    public static void main(String[] args) throws IOException {
        st=new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(st.nextToken())-Integer.parseInt(st.nextToken()));
    }

    // SAMPLE_START
    private static String input = "3 2";
    // SAMPLE_END
}
