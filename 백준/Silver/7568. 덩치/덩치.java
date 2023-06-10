import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] size = new int [N][2];

        StringTokenizer st;
        for(int i=0;i<N;i++) {
           st = new StringTokenizer(br.readLine());
           size[i][0] = Integer.parseInt(st.nextToken());
           size[i][1] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(size, N));
    }

    public static String solution(int[][] size, int N) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            int rank = 1;
            for(int j=0;j<N;j++) {
                if(i == j) continue;  // 같은 사람 비교 xx
                // i 번째 사람과 j번째 사람을 비교해 i가 j보다 덩치가 작을 때 rank ++
                if(size[i][0] < size[j][0] && size[i][1] < size[j][1]) rank++;
            }
            sb.append(rank).append(" ");
        }
        return sb.toString();
    }
}