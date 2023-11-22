import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        int max = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            int subjectValue = Integer.parseInt(token);
            max = Math.max(max, subjectValue);
            sum += subjectValue;
        }
        System.out.println(sum*100.0/max/N);
    }
}
