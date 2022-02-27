package level1.자릿수더하기;

public class Solution {
    public static int solution(int n)
    {
    	int answer = 0;	
    		
    	while(n != 0) {
    		answer += n % 10;
    		n = n / 10;
    	}

        return answer;
    }
    public static void main(String[] args) {
		System.out.println(solution(123));
    	
	}
}