import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[N];
        for(int i=0;i<N;i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(N, score));
    }

    public static Double solution(int N, int[] score) {
        Double answer = 0.0;
        int max = 0; // 최댓값
        int sum = 0; // 점수 평균
        for(int i=0;i<score.length;i++) {
            if (max < score[i]) max = score[i];
            sum += score[i];
        }
        answer = (double) sum;
        return answer*100/max/N;
    }
}
