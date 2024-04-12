import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    // 백준 1874 스택 수열
    // https://www.acmicpc.net/problem/1874
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];

        int idx = 0; //스택배열 인덱스
        int start = 0; //오름차순 유지를 위한 변수
        //8
        //4,3,6,8,7,5,2,1
        while(N -- > 0){
            int value = Integer.parseInt(br.readLine());

            if(value>start){
                for (int i = start+1; i <= value; i++) {
                    stack[idx]=i;
                    idx++;
                    sb.append("+\n");
                }
                start = value;
            }
            //stack 가장 위의 값이 다음 value가 아닌 경우
            //즉 수열을 만들 수 없는 경우
            else if(stack[idx-1]!=value){
                System.out.println("NO");
                return;
            }
            idx--;
            sb.append("-\n");
        }
        System.out.println(sb);

    }
}
