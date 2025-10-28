import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	int sum = 0;
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while (true) {
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	int a = Integer.parseInt( st.nextToken() );
    	int b = Integer.parseInt( st.nextToken() );
    	sum = a + b;
    	if(sum != 0) {
    		System.out.println(a+b);
    	}else {
    		br.close();
    		return;
    	}
    	}
    }
}