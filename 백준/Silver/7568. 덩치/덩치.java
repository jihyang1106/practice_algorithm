import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
       return IntStream.range(0, N)
        .mapToObj(i -> {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) rank++;
            }
            return String.valueOf(rank);
        })
        .collect(Collectors.joining(" "));
    }
}
