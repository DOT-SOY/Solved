import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();	
    	int sum1 = 1, sum2 = 1;
    	
    	for(int i = num1; i > 1; i--) {
    		sum1 *= i;
    	}
    	
    	for(int i = num2; i > 1; i--) {
    		sum2 *= i;
    	}
    	
    	for(int i = (num1 - num2); i > 1; i--){
    		sum2 *= i;
    	}
    	
    	System.out.println(sum1/sum2);
    }
}