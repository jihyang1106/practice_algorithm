import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] attendance = new boolean[31];

        for(int i=0; i<28; i++) {
            attendance[Integer.parseInt(br.readLine())] = true;
        }
        int i=0;
        for (Boolean num: attendance) {
            if(num == false) if(i != 0) System.out.println(i);
            i++;
        }
    }
}