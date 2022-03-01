package level1.소수만들기;

public class Solution {
	
	public int solution(int[] nums) {
        int answer = 0;

		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					int total = nums[i] + nums[j] + nums[k];
					if(isPrime(total)) {
						answer++;
					}

					System.out.println(total);
				}
			}
		}
		System.out.println(answer);
        return answer;
    }
	public boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
			
		}
		
		return true;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		Solution s = new Solution();
		s.solution(nums);
	}
}
