

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //외부 함수에서 사용하기 위해서 전역으로 설정
    static int[] currArr;
    static int[] checkArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;

        checkArr = new int[4];
        currArr = new int[4];
        // 입력문자열 배열
        char[] input = new char[S];
        // 비밀번호 만족 조건을 카운트하는 변수
        checkSecret = 0;

        // 입력값을 char 배열로 변환
        input = br.readLine().toCharArray();
        // 비밀번호 조건 입력받기
        st = new StringTokenizer(br.readLine());
        // 비밀번호 체크 배열에 값 할당
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            //예외 처리
            // 비밀번호 조건이 0일 경우 checkSecret 값을 증가
            if (checkArr[i] == 0) checkSecret++;

        }
        for (int i = 0; i < P; i++) {
            // 부분문자열 처음 받을때 셋팅
            // 로직이 복잡하므로 Add 함수를 따로 선언
            Add(input[i]);
        }

        if (checkSecret == 4) Result++;
        // C,C,T,G,G,A,T,T,G
        // 0,1,2,3,4,5,6,7,8
        //슬라이딩 윈도우
        //한칸 이동했기 때문에 i는 p부터 시작
        for (int i = P; i < S; i++) { //i=8인 경우 한번만 동작
            int j = i - P; // i==오른쪽 포인터, j=왼쪽 포인터
            Add(input[i]);
            Remove(input[j]);
            if (checkSecret == 4) Result++;
        }
        System.out.println(Result);
        br.close();
    }
    private static void Remove(char c) {
        // 슬라이딩 윈도우에서 요소를 삭제하는 메서드
        switch (c) {
            case 'A':
                if (currArr[0] == checkArr[0]) {
                    // 윈도우가 한칸 이동 했으므로 감소시켜야함
                    checkSecret--;
                }
                currArr[0]--;
                break;
            case 'C':
                if (currArr[1] == checkArr[1]) {
                    checkSecret--;
                }
                currArr[1]--;
                break;
            case 'G':
                if (currArr[2] == checkArr[2]) {
                    checkSecret--;
                }
                currArr[2]--;
                break;
            case 'T':
                if (currArr[3] == checkArr[3]) {
                    checkSecret--;
                }
                currArr[3]--;
                break;
        }
    }

    //입력받은 문자열을 현재 비밀번호 검사 배열(currArr[])에 추가하는 메서드
    private static void Add(char c) {
        switch (c) {
            case 'A':
                currArr[0]++;
                if (currArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                currArr[1]++;
                if (currArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                currArr[2]++;
                if (currArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                currArr[3]++;
                if (currArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }
}
