package level1.없는숫자더하기;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void testSolution() {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = 45;
		for(int i = 0; i < numbers.length; i++) {
			answer -= numbers[i];
        }
		
		assertEquals(14, answer);

	}

}
