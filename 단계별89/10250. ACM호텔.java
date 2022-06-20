import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken());// 호텔 층
			st.nextToken();// 방 수
			int N = Integer.parseInt(st.nextToken());// 몇 번째 손님

			if(N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
			}
			else {
				sb.append(((N % H) * 100) + (N / H) + 1).append('\n');
			}
		}
		System.out.println(sb);
	}
}