import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 백준 1377
// https://www.acmicpc.net/problem/1377
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        A[] arrA = new A[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = new A(i, Integer.parseInt(br.readLine()));
        }

        // Comparator를 사용하여 value 기준으로 정렬
        Arrays.sort(arrA, new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        });

        int max = 0;
        for (int i = 0; i < N; i++) {
            if (max < arrA[i].getIdx() - i) {
                max = arrA[i].getIdx() - i;
            }
        }
        System.out.println(max + 1);
    }
}

class A {
    private int idx;
    private int value;

    public A(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }

    public int getIdx() {
        return idx;
    }

    public int getValue() {
        return value;
    }
}
