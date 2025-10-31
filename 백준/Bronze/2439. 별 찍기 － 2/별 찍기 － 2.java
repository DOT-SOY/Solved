import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int star = Integer.parseInt(br.readLine()); // 줄 갯수 받기

    	for (int i = 1; i <= star; i++) {
    	    System.out.println(" ".repeat(star - i) + "*".repeat(i));
    	}
    }
}
