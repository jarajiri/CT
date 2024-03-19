import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subject = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[subject];

        for (int i = 0; i < subject; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int n : score) {
            if(n>max) max=n;
        }
        double[] newScore = new double[subject];
        for(int i=0;i<subject;i++){
            newScore[i] = (double)score[i]/max*100;
        }
        double sum=0, avg=0;
        for(double n :newScore){
            sum+=n;
        }
        avg = sum/subject;
        System.out.println(avg);
    }
}
