package level1.k번째수;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
	
		int[] answer = new int[commands.length];
		for(int i = 0; i < commands.length; i++) {
			int start = commands[i][0];
			int end = commands[i][1];
			int target = commands[i][2];
			
			int[] temp = new int[end - start +1];
			int a = 0;
			for(int j = start-1; j < end; j++) {//배열 자른 값 복사 
				temp[a++] = array[j];
				//System.out.print(temp[a-1]);
			}
		//	System.out.println();
			sort(temp);
			answer[i] = sort(temp)[target-1];
			//System.out.print("정렬: ");
			for(int x = 0; x < temp.length; x++) {
			//	System.out.print(temp[x]);
			}
			//System.out.println();
			//System.out.println(answer[i]);
		}
	
        
        return answer;
    }
	public int[] sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				int temp = 0;
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}