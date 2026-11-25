import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	Scanner sc = new Scanner(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	int testCase = sc.nextInt();

    	for(int i = 0; i < testCase; i++) {    		
    		int a = sc.nextInt();
    		int b = sc.nextInt();

    		sb.append(a+b).append("\n");
    	}
    	
    	bw.write(sb.toString());
    	bw.close();
    	sc.close();
    }
}