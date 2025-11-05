import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();	
    	System.out.println(getGCD(num1, num2) + "\n" + getLCM(num1, num2));    	
    }
    
    public static int getGCD(int num1, int num2) {
    	if(num1 % num2 == 0) {
    		return num2;
    	}
		return getGCD(num2, num1 % num2);
    }
    
    public static int getLCM(int num1, int num2) {
    	return num1 * num2 / getGCD(num1, num2);
    }
}