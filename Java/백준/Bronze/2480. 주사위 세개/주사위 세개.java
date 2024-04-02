
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dice = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int count = 0;
        int same = 0;

        for (int i = 0; i < dice.length - 1; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i] == dice[j]) {
                    same = dice[i];
                    count++;
                }
            }
        }
//        System.out.println("same = " + same);
//        System.out.println("count = " + count);
        int max = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] > max) max = dice[i];
        }
//        System.out.println("max = " + max);

        int reward = 0;
        switch (count) {
            case 0:
                reward = max * 100;
                break;
            case 1:
                reward = 1000 + same * 100;
                break;
            default:
                reward = 10000 + same * 1000;
                break;
        }
//        System.out.println("reward = " + reward);
        System.out.println(reward);
    }
}
