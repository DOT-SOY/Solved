import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
    	// 입력
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	// 출력
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	// 저장
    	StringBuilder sb = new StringBuilder();
    	
    	int testCase = Integer.parseInt(br.readLine());
    	for(int i = 0; i < testCase; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		
    		
    		sb.append(a+b).append("\n");
    	}
    	
    	bw.write(sb.toString());
    	bw.flush();
    	bw.close();
    	br.close();
    }
}