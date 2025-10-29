class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        int a = getGCD(num, denom);
        
        int[] answer = {num/a, denom/a};
		return answer;
    }
    
    public static int getGCD(int num1, int num2) {
    	if(num1 % num2 == 0) {
    		return num2;
    	}
		return getGCD(num2, num1 % num2);
    }
}