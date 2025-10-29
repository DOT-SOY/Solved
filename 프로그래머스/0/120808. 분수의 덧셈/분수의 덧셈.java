class Solution {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num1 = (numer1 * denom2) + (numer2 * denom1); // 분자
        int num2 = denom1 * denom2; // 분모
        int small = num1, big = num2;
        
        
        // 유클리드 호제
        while(small != 0) {
            int a = small;
            small = big % small;
            big = a;
        }
        
        int[] answer = {num1/big, num2/big};
        return answer;
    }
}