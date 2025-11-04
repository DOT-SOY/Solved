import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        if(num > 89) {
        	System.out.println("A");
        }else if(num > 79 && num < 90) {
        	System.out.println("B");
        }else if(num > 69 && num < 80) {
        	System.out.println("C");
        }else if(num > 59 && num < 70) {
        	System.out.println("D");
        }else {
        	System.out.println("F");
        }
    }
}