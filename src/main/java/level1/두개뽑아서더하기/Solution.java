package level1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				int temp = i + j;
				//중복처리
				if(list.indexOf(temp) < 0) {
					list.add(temp);
				}
			}
		}
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
        return answer;
    }
    
  
}