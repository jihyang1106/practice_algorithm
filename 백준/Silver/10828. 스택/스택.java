import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandLength = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<commandLength;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            
            if(command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(command.equals("pop")) {
                sb = stack.isEmpty() ? sb.append(-1 + "\n") : sb.append(stack.pop() + "\n");
            }else if(command.equals("size")) {
                sb.append(stack.size() + "\n");
            }else if(command.equals("empty")) {
                sb = stack.isEmpty() ? sb.append(1 + "\n") : sb.append(0 + "\n");
            }else if(command.equals("top")) {
                sb = stack.isEmpty() ? sb.append(-1 + "\n") : sb.append(stack.peek() + "\n");
            }
        }
        System.out.println(sb.toString());
    }
}