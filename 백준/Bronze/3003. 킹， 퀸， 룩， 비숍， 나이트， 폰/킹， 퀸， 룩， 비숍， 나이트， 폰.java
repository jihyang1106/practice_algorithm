import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    public static String solution(String input) {

        StringTokenizer st = new StringTokenizer(input);

        String answer =  Arrays.stream(new int[]{1,1,2,2,2,8})
                .mapToObj(j -> (j - Integer.parseInt(st.nextToken())) + " ")
                .collect(Collectors.joining());
        return answer;
    }
}
