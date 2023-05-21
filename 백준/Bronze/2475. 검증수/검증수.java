
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    public static int solution(String input) {
        StringTokenizer st = new StringTokenizer(input);

        int sum = 0; // 합
        int pow = 0; // 제곱 변수
        while(st.hasMoreTokens()) {
            pow = Integer.parseInt(st.nextToken());
            sum += pow*pow;
        }

        return sum%10;
    }
}
