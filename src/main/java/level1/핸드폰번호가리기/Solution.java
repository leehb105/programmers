package level1.핸드폰번호가리기;
class Solution {
    public String solution(String phone_number) {
		char[] temp = phone_number.toCharArray();
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = '*';
			if(i > temp.length-1-4) {
				temp[i] = phone_number.charAt(i);
			}
			System.out.println(temp[i]);
		}
        String answer = new String(temp);
        return answer;
    }
}