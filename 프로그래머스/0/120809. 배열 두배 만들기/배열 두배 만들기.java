class Solution {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
        	numbers[i] = numbers[i]*2;
        	System.out.println(i+"번째 "+numbers[i]);
        }
        int[] answer = {};
        answer = numbers;
        return answer;
    }
}
