
public class StringCalculator {
	
	public int addString(String input) {
		int sum = 0;
		if(input == null || input.isEmpty()) {
			return sum;
		}
		else{
			String[] numbers = input.split(",");
			for(int i=0; i<numbers.length;i++) {
				sum += Integer.parseInt(numbers[i]);
			}
		}
		return sum;
	}

}
