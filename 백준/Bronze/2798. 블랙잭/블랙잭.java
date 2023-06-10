import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int card[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(card, M));
    }

    public static int solution(int[] card, int M) {
        int answer = 0;

        // 3개를 고르기 때문에 첫 번째 카드는 N-2 까지만
        for(int i=0;i<card.length-2;i++) {
            // 첫 번째 카드가 M보다 크면 탐색 xx
            if(card[i] > M) continue;
            for(int j=i+1; j<card.length-1;j++) { // 두 번째 카드는 N-1 까지만
                // 첫 번째 카드 + 두 번째 카드 > M 탐색 xx
                if(card[i] + card[j] > M ) continue;
                for(int k=j+1; k<card.length;k++) { // 세 번째 카드는 두 번째 카드 다음부터 N까지 순회
                    int sum = card[i] + card[j] + card[k];
                    if(M == sum) return sum;
                    else if(answer < sum && sum < M) { // 세 카드의 합이 이전 합보다 크면서 M보다 작을 때 result 갱신
                        answer = sum;
                    }
                }
            }
        }
        return answer;
    }
}
