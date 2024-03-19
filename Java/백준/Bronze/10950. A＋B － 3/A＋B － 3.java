import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0,t=0,value=0;
        t = Integer.parseInt(br.readLine());
        int[] answer= new int[t];
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            value= a+b;
            answer[i] = value;
        }

        for (int j : answer) {
            System.out.println(j);
        }

    }
}
