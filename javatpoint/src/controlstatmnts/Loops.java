package controlstatmnts;

public class Loops {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println("Sum of first 10 numbers ==== " + sum);

		String[] languageNames = { "C", "C++", "Java", "Python", "Javascript" };

		System.out.println("Printing the content of array elements");

		for (String languageName : languageNames) {
			System.out.println(languageName);
		}

		// *************************************************************************

		int i = 0;
		System.out.println("Printing the first even numbers upto 10 : ");
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		// ************************************************************************

		i = 0;
		System.out.println("Printing the first even numbers upto 10 using do while loop : ");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 10);

		// ************************************************************************

		a: for (int k = 0; k <= 10; k++) {
			b: for (int m = 0; m <= 15; m++) {
				c: for (int n = 0; n <= 20; n++) {
					System.out.println(n);
					if (n == 7) {
						break a;
					}
				}
			}

		}
	}
}
