
public class Watermelon {
	public static String solution(int n) {
		String answer = "";
		String su = "��";
		String bak = "��";

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer += su;
			} else {
				answer += bak;
			}

		}
		return answer;
	}

	public static void main(String[] args) {
		int i = 3;
		int j = 4;
		System.out.println(solution(i));
		System.out.println(solution(j));

	}

}