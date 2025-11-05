import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	List<Double> dList = new ArrayList<>();
    	
    	double N = sc.nextDouble();
    	double sum = 0; 

    	
    	for(int i = 0; i < N; i++) {
    		dList.add(sc.nextDouble());
    	}
    	
    	dList.sort(Comparator.naturalOrder());
    	
    	for(int i = 0; i < N; i++) {
    		sum += (dList.get(i) / dList.get(dList.size() - 1) * 100);
    	}
    	
    	System.out.println(sum / N);
    }
}
