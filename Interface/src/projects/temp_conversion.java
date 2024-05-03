package projects;
import java.util.Scanner;

public class temp_conversion {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Fahrenheit to Celsius(1)or celsius to Fahrenheit(2)");
		int result=sc.nextInt();
		if(result==1) {
			System.out.println("You have choosen FAHRENHEIT to CELSIUS!");
			System.out.println("Enter Fahrenheit value:");
			double value=sc.nextDouble();
			double valueFinal=(value-32)*5/9;
			System.out.println("celsius is:");
			System.out.println(Math.round(valueFinal*10.0)/10.0);
			
		}else if(result==2) {
			System.out.println("You have choosen CELSIUS to FAHRENHEIT");
			System.out.println("Enter the celsius value:");
			double value2=sc.nextDouble();
			double finalresult=value2 * 1.8+32;
			System.out.println("FAHRENHEIT IS:");
			System.out.println(Math.round(finalresult*10.0)/10.0);
			
		}else {
			System.out.println("Not a valid Choice!");
		}
	}
}
