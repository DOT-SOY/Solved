import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int star = Integer.parseInt(br.readLine()); // 줄 갯수 받기
    	int a = 1;

    	while(star != 0) {
        	for(int i = star -1; i > 0; i--) {
        		System.out.print(" ");
        	}
        	for(int j = 1; j <= a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        	a++;
        	star--;
    	}
    }
}
