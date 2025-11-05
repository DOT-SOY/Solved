import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		String str = sc.nextLine();
    		int length = str.length();
    		String answer = "";

    		if(str.equals("0")) {return;}
    		else if(length == 1) {System.out.println("yes");}
    		else {
	        	for(int i = 0; i < (length/2); i++) {
	        		answer = str.charAt(i) != (str.charAt(length -i -1)) ? "no" : "yes";
	        		if (answer == "no") {break;} 
	        	}
	        	System.out.println(answer);
    		}
    	}

    }
}