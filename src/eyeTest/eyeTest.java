package eyeTest;
import java.util.Scanner;
public class eyeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number between 1 - 6: ");
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNextInt()) {
			int number = scanner.nextInt();
			eyeNumber(number);
		}else {
			System.out.print("Invalid Input, (Enter an Integers between 1 - 6 )");
			
		}
		

	}
	 static  void eyeNumber(int number) {
		 
		 int [] arrayNumbers = {1,2,3,4,5,6};
	
		 for(int i = 0; i < arrayNumbers.length; i++) {
			 if(arrayNumbers[i] == number && number == 6) {
				 System.out.println("Perfect");
				 break;
			 }else if(arrayNumbers[i] == number && number >= 3 ) {
				 System.out.println("Not bad");
				 break;
			 }else if(arrayNumbers[i] == number && number < 3) {
				 System.out.println("Go to a doctor");
				 break;
			 }
		 }
		 

		
	}

}
