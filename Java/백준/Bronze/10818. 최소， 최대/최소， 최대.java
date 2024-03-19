import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrNumber = new int[number];
        for (int i = 0; i < number; i++) {
            arrNumber[i] = Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < arrNumber.length; j++) {
            if (arrNumber[j] > max) {
                max = arrNumber[j];
            }
            if (arrNumber[j] < min) {
                min = arrNumber[j];
            }
        }

        System.out.print(min+" "+max);

    }
}

