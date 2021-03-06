import java.util.*;

public class Main {
    /*
        백준 1463: https://www.acmicpc.net/problem/1463

        풀이:
        횟수의 최소값을 구하는 문제이므로 DP로 풀어야함을 짐작 할 수 있다.
        시간 제한이 0.15초 이므로 Momerization(Bottom-Up)으로 문제를 해결해야한다.
    */

	static Integer[] dp;
 
	static int recur(int N) {
 
		if (dp[N] == null) {
			// 6으로 나눠지는 경우 
			if (N % 6 == 0) {
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			// 3으로만 나눠지는 경우 
			else if (N % 3 == 0) {
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			// 2로만 나눠지는 경우 
			else if (N % 2 == 0) {
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				dp[N] = recur(N - 1) + 1;
			}
		}
		return dp[N];
	}
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
 
		System.out.print(recur(N));
 
	}
}