import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int goal = 0;
    	sc.nextLine();
    	
    	String numList = sc.nextLine();
    	String[] arr = numList.split(" ");

    	for(int i = 0; i < N-2; i++) {
    		for(int j = i + 1; j < N-1; j++) {
    			for(int k = j + 1; k < N; k++) {
    				int num = Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[k]);
    				if(num <= M && num > goal) {
    					goal = num;
    				}
    			}
    		}
    	}
    	
    	System.out.println(goal);
    }
}