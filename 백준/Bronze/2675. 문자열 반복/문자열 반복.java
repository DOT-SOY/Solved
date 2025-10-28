import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        
        
        for(int i = 0; i < testCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++) {
                    for(int k = 0; k < a; k++) {
                        System.out.print(str.charAt(j));
                    }
                }
            System.out.println();
        }
    }
}
