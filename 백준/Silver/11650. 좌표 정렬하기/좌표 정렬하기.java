import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());
        Integer[][] arr = new Integer[testCase][2];

        for(int i = 0; i < testCase; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");

            arr[i][0] = Integer.parseInt(str.nextToken());
            arr[i][1] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(arr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if(o1[0].equals(o2[0])) {
                    return o1[1] - o2[1];
                }else{
                    return o1[0] - o2[0];
                }
            }
        });

        // 향상된 for문으로 출력
        for (Object[] temp : arr) {
            sb.append(temp[0]).append(" ").append(temp[1]).append("\n");
        }

        System.out.println(sb);
    }
}