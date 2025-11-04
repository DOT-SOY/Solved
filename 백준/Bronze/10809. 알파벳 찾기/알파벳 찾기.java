import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int[] arr = new int [26];
    	Arrays.fill(arr, -1);
    	
    	String str = sc.nextLine();

    	for(int i = 0; i < str.length(); i++) {
    		int index = str.charAt(i) - 'a';
    		if (arr[index] == -1) {
    		    arr[index] = i;  // 첫 등장 위치 저장
    		}
    	}
    	
    	for(int n : arr) {
    		System.out.print(n+" ");
    	}
    }
}