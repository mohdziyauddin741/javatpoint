package controlstatmnts;

public class Student {

	public static void main(String[] args) {
		String city = "Delhi";

		if (city == "Meerut") {
			System.out.println("city is meerut");
		}

		else if(city == "Noida") {
			System.out.println("city is noida");
		}

		else if (city == "Agra") {
			System.out.println("city is agra");
		}

		else
			System.out.println(city);

		// ***********************************************************************

		String addressingaa = "Delhi, India";

		if(addressingaa.endsWith("India")) {
			if (addressingaa.contains("Meerut")) {
				System.out.println("Your city is Meerut");

			} else if (addressingaa.contains("Noida") ){
				System.out.println("Your city is Noida");
			}
				else System.out.println(addressingaa.split(",")[0]);
			}

			else {
				System.out.println("Your not living in India");
			}
		}

	}
