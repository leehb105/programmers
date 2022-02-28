package level1.완주하지못한선수;


import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class SolutionTeest {

	@Test
	void testSolution() {
		String answer = "";
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String name : participant) {
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		for(String name : completion) {
			map.put(name, map.get(name) -1);
		}
		for(String str : map.keySet()) {
			if(map.get(str) != 0) {
				answer = str;
			}
		}
		assertEquals(answer, "leo");
	}

}
