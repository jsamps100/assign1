package assignOne;

public class Problem1 {

	public static void main(String[] args) {
		String str = "-654544776";
		
		System.out.print(stringToInt(str));
		
	}

	
		public static int stringToInt(String str) {
			
		if (str.charAt(0) == '-'){
			
			int totalIntVal = 0;
			int currentInt;
			 
			for(int i=1;i<str.length();i++){
				currentInt = str.charAt(i) - '0';
				totalIntVal=(totalIntVal*10) + currentInt;
			}
			totalIntVal = (totalIntVal) -(totalIntVal*2);
			return totalIntVal;
	
		}else{
			
			int totalIntVal = 0;
			int currentInt = 0;
				 
			for(int i=0;i<str.length();i++){
				currentInt = str.charAt(i) - '0';
				totalIntVal=(totalIntVal*10) + currentInt;
			}
			return totalIntVal;
		}
	}
}


