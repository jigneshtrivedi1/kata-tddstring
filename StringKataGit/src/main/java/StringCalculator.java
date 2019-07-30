
public class StringCalculator {
	
	public int addString(String input) {
		int sum = 0;
		if(input == null || input.isEmpty()) {
			return sum;
		}
		else{
			
			StringBuilder regEx = new StringBuilder("\\n|,");
			if(!input.substring(0, 1).matches("[0-9]")){
				regEx.append("|").append(input.substring(0, 1));
				String[] tempInput = input.split("\\n");
				input = tempInput[1];
			}
			
			String[] numbers = input.split(regEx.toString());
			for(int i=0; i<numbers.length;i++) {
				sum += Integer.parseInt(numbers[i]);
			}
		}
		return sum;
	}

}
