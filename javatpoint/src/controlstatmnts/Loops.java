package controlstatmnts;

public class Loops {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("Sum of first 10 numbers ==== " + sum);
		
		String[] languageNames = {"C", "C++", "Java", "Python", "Javascript"};
		
		System.out.println("Printing the content of array elements");
		
		for (String languageName : languageNames) {
			System.out.println(languageName);
		}

	}
}
