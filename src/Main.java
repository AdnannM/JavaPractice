import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("Ovo je string");
		
		// This is comment
		
		// MARK: - Variable
		int width = 30;
		int height = 4;
		
		width = 50;
		height = 2;	
		
		int area = width * height;
		System.out.println("Povrsina je: " + area);
		
		// MARK: - Cons
		final int voltage;
		voltage = 13;
		System.out.println("Voltage: " + voltage);
		
		// MARK: - Data Types
		int age = 27;
		String name = "Adnann";	
		char firstLetter = 'A';
		double wight = 60.0;
		
		
		// Big Numbers
		long numbers = 2_000_000_000_000L;
		float voltage1 = 13.8F;
		
		// Date
		Date todayDate = new Date();
		
		System.out.println("Ime: " + name + " Godine: " + age + " Prvo Slovo: " + firstLetter + " Tezina: " + wight);
		System.out.println("Veliki broj: " + numbers + " Volti: " + voltage1);
		System.out.println("Datum: " + todayDate);
		
		// MARK: - Data Type Conversions
		// - Automatic 
		int someInt = 10;
		float someFloat = someInt;
		System.out.println("Float: " + someFloat + " Integer: " + someInt);
		
		// - Manuel
		double someDouble = 3.14;
		int someIntFromDouble = (int) someDouble;
		System.out.println(someIntFromDouble);
		
		float someIntFromInt = (float) someIntFromDouble;
		System.out.println(someIntFromInt);
	}
}
