import java.io.*;
import java.util.Arrays;

// 백준 10989
// https://www.acmicpc.net/problem/10989

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        // === Arrays.sort
        // int[] arr = new int[N];
        // for (int i = 0; i < N; i++) {
        //     arr[i] = Integer.parseInt(br.readLine());
        // }
        // br.close();
        // Arrays.sort(arr);
        // for (int i = 0; i < N; i++) {
        //     bw.write(arr[i] + "\n");
        // }
        // bw.flush();
        // bw.close();

        // === Counting sort
        // N = 6
        // input 1 3 2 3 6 5
        // answer 1 2 3 3 5 6
        // counting = {0,1,1,2,0,1,1,......}
        int[] counting = new int[10001];
        for (int i = 0; i < N; i++) {
            counting[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 0; i < 10001; i++) {
            if(counting[i]!=0){
                bw.write(i+"\n");
                counting[i]--;
                i--;
            }
        }
        bw.flush();
        bw.close();
    }

}
