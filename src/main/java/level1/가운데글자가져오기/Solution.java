package level1.가운데글자가져오기;

public class Solution {
	
    public String solution(String s)
    {
        char[] c = s.toCharArray();
        int midNum = c.length / 2;
        String answer = "";
        if (c.length % 2 == 1)
        {
        	answer = String.valueOf(c[midNum]);
        }
        else
        {
        	answer = String.valueOf(c[midNum-1]) + String.valueOf(c[midNum]);
        }
        return answer;
        
    }

}