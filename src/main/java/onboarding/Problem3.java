package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        return answer;
    }

    private static int clapnumber(int n) {
        int m;
        int countmultiple = 0;
        do {
            m = n % 10;
            if (m % 3 == 0) {
                countmultiple++;
            }
            n /= 10;
        } while (n != 0);
        return countmultiple;
    }
}
