import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int testCase = Integer.parseInt(br.readLine());
    	Object[][] arr = new Object[testCase][2];
    	
    	for(int i = 0; i < testCase; i++) {
    		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
    		
    		arr[i][0] = Integer.parseInt(str.nextToken());
    		arr[i][1] = str.nextToken();
    	}
    	
    	Arrays.sort(arr, new Comparator<Object[]>() {
    	    @Override
    	    public int compare(Object[] o1, Object[] o2) {
    	        return (Integer)o1[0] - (Integer)o2[0];
    	    }
    	});
    	
    	// 향상된 for문으로 출력
        for (Object[] pair : arr) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}