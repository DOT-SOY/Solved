import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	int sum = 0;
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < 5; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		sum += num*num;
    	}
    	
    	System.out.println(sum % 10);
    	br.close();
    }
}