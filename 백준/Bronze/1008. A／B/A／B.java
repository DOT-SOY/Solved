import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = reader.readLine().split(" ");
		double num1 = Double.parseDouble(nums[0]);
		double num2 = Double.parseDouble(nums[1]);
		System.out.println(num1 / num2);

	}

}
