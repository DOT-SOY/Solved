import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{ 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] nums= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	int max = 0, num = 0;
    	
    	for(int i = 0; i < 9; i++) {
    		nums[i] = Integer.parseInt(br.readLine());
    		if(nums[i] > max) {
    			max = nums[i];
    			num = i + 1;
    		}
    	}
    	
    	System.out.println(max + "\n" + num);
    }
}