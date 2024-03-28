import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 나머지 합
public class Main {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M;
    static int [] counts;

    //main
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        //sum(i,j)%M = 0
        //sum(1,j)%M - sum(1,i-1)%M=0
        //sum(1,j)%M = sum(1,i-1)%M

        counts = new int[M]; //나머지가 될 수 있는 수 = 배열의 인덱스
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum = (sum+num)%M;
            counts[sum]++; // 나머지에 해당하는 인덱스에 값 증가
        }

//        System.out.println(Arrays.toString(counts));
        
        long count = counts[0]; // 누적합 배열 자체에서 0으로 나누어 떨어지는 경우
        for (int j : counts) { // 구간 합에서 0으로 나누어 떨어지는 경우
            count += (long) j * (j - 1) / 2; // int형 범위를 벗어날 수도 있으므로 형변환
        }
        System.out.println(count);
    }
    

    // SAMPLE_START
    private static String input = "5 3\n"
                                + "1 2 3 1 2";
    // SAMPLE_END
}
