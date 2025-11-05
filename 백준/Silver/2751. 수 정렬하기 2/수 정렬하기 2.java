import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	List<Integer> intList = new ArrayList<>();
    	
    	int testCase = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < testCase; i++) {
    		intList.add(Integer.parseInt(br.readLine()));
    	}
    	
    	intList.sort(Comparator.naturalOrder());
    	
    	for(int temp: intList) {
    		bw.write(temp + "\n");
    	};
    	
    	bw.flush();
    	
    }
}