import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] attendance = new boolean[31];

        IntStream.range(0, 28).forEach(i -> {
            try {
                attendance[Integer.parseInt(br.readLine())] = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        IntStream.range(1, 31).filter(i -> !attendance[i])
                .forEach(System.out::println);
    }
}