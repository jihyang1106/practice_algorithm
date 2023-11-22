import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] subjectArr =  br.readLine().split(" ");
        long sum = 0;
        long max = 0;

        for(String subject : subjectArr) {
            int subjectValue = Integer.parseInt(subject);
            max = Math.max(max, subjectValue);
            sum += subjectValue;
        }
        System.out.println(sum*100.0/max/N);
    }
}
