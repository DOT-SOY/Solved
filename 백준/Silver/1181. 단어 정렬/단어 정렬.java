import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int repeatNum = Integer.parseInt(br.readLine());

    	// 정렬을 위한 트리셋
    	TreeSet<String> ts = new TreeSet<>(new Comparator<>() {
    		// Comparator 오버라이드로 정렬 기준 추가
			@Override
			public int compare(String o1, String o2) { 
		        if (o1.length() != o2.length()) {
		        	// 길이 우선 비교: 음수 또는 양수로 반환해준다
		            return o1.length() - o2.length(); 
		        }
		        return o1.compareTo(o2); // 사전순 비교 해주는 compareTo 메서드
		    }
		});

    	for (int i = 0; i < repeatNum; i++) {
    	    ts.add(br.readLine());
    	}
    	
    	for(String i : ts) {
    	    System.out.print(i + "\n");}
    }
}