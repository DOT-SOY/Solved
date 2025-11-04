import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	String str0 = sc.nextLine();
    	String[] arr0 = str0.split(" ");
    	
    	int numN = Integer.parseInt(arr0[0]) ;
    	int numX = Integer.parseInt(arr0[1]) ;
    	
    	String str = sc.nextLine();
    	String[] arr = str.split(" ");
    	
    	for(int i = 0; i < numN; i++) {
    		if(Integer.parseInt(arr[i])  < numX) {
    			System.out.print(arr[i] + " ");
    		}
    	}
    	
    	
    }
}