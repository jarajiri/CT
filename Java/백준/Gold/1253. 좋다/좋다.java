

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int GOOD = 0;
        for (int i = 0; i < N; i++) {
            int goodNumber = arr[i];
            int left = 0;
            int right = N - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == goodNumber) {
                    if (i == left) {
                        left++;
                    } else if (right == i) {
                        right--;
                    } else {
                        GOOD++;
                        break;
                    }
                } else if (sum > goodNumber) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        System.out.println(GOOD);
    }
}
