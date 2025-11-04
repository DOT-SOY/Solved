import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int num = 1000;
    	
    	boolean[] isPrime = new boolean[num + 1];
    	
    	for(int i = 2; i <= num; i++) {
    		isPrime[i] = true;
    	}
    	
    	// 에라토스테네스의 체
    	for(int i = 2; i * i <= num; i++) {
    		if(isPrime[i]) {
    			for(int j = i * i; j <= num; j += i) {
    				isPrime[j] = false;
    			}
    		}
    	}
    	
    	Scanner sc = new Scanner(System.in);
    	int testCase = sc.nextInt();
    	int amount = 0;
    	
    	for(int i = 0; i < testCase; i++) {
    		int number = sc.nextInt();
    		if(isPrime[number] == true) {
    			amount++;
    		}
    	}
    	
    	System.out.println(amount);
    }
}
