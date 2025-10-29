import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int year = Integer.parseInt(br.readLine());
    	System.out.println(IsLeapYear(year));
    	br.close();
    }
    
    static int IsLeapYear(int num) {
    	boolean isLeap = (num % 4 == 0 && num % 100 != 0) || num % 400 == 0;
    	return isLeap ? 1 : 0;
	}
}
