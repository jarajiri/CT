

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 백준 2164 카드2
// https://www.acmicpc.net/problem/2164
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
//        배열로 풀이하기
//        int[] qArray = new int[2 * N];
//        for (int i = 1; i <= N; i++) {
//            qArray[i] = i;
//        }
//        int prevIndex = 1;
//        int lastIndex = N;
//        while (N-- > 1) {
//            prevIndex++;
//            qArray[lastIndex + 1] = qArray[prevIndex];
//            lastIndex++;
//            prevIndex++;
//        }
//        System.out.println(qArray[prevIndex]);

//        linkedlist 사용하기
        Queue<Integer> qLinkedList= new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            qLinkedList.offer(i);
        }

        while(qLinkedList.size()>1){
            qLinkedList.poll();
            qLinkedList.offer(qLinkedList.poll());
        }
        System.out.println(qLinkedList.poll());
    }
}
