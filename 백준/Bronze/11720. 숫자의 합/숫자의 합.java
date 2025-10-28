import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int sum = 0;
        
        for(int i = 0; i < num; i++) {
        	sum += str.charAt(i) - '0';
        	// 유니코드 값 빼주기
        }
        System.out.print(sum);
    }
}
