


import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String firstName = input.nextLine();

		System.out.println("Hello " + firstName);

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("Hello " + firstName + " " + lastName);

		System.out.println("How old are you?");
		int age = input.nextInt();

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		input.nextLine();

		System.out.println("What's your favorite color?");
		String color = input.nextLine();

		System.out.println("What is the number of your birth month?");
		int month = input.nextInt();

		int retirementYears = 0;
		if (age % 2 == 0) {
			retirementYears = 50;
		} else {
			retirementYears = 70;
		}

		double bankBalance = 0;
		if (month >= 1 && month <= 4) {
			bankBalance = 100;
		} else if (month >= 5 && month <= 8) {
			bankBalance = 2000;
		} else if (month >= 9 && month <= 12) {
			bankBalance = 4000;
		} else {
			bankBalance = 0;
		}

		String vacation = "";
		if (siblings == 0) {
			vacation = "Ohio";
		} else if (siblings == 1) {
			vacation = "Miami";
		} else if (siblings == 2) {
			vacation = "Bahamas";
		} else if (siblings == 3) {
			vacation = "California";
		} else if (siblings > 3) {
			vacation = "Florida";
		} else {
			vacation = "Chicago";
		}

		String transportation = "";
		if (color.equals("red")) {
			transportation = "beetle";
		} else if (color.equals("yellow")) {
			transportation = "convertible";
		} else if (color.equals("orange")) {
			transportation = "truck";
		} else if (color.equals("blue")) {
			transportation = "mini van";
		} else if (color.equals("indigo")) {
			transportation = "jeep";
		} else if (color.equals("violet")) {
			transportation = "bus";
		} else {
			transportation = "plane";
		}
System.out.println (firstName + " " + lastName + " will retire in" + " " + retirementYears + " " + "with" + " " + bankBalance + " " + "in the bank" 
+ " " + "a vacation home in " + vacation + "," + " " + "and travel by "+ transportation + ".");
	}

}
