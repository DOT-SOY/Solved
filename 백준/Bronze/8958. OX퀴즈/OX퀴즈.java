import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < num; i++) {
        	String str = sc.nextLine();
        	String[] strArr = str.split("");
        	
        	System.out.println(Score(strArr));
        }
        
    }
    
    public static int Score(String[] str) {
    	int score = 0;
    	int correct = 1;
    	for(int i = 0; i < str.length; i++) {
    		if(str[i].equals("O")) {
    			score += correct;
    			correct++;
    		}else {
    			correct = 1;
    		}
    	}
		return score;
    }
}