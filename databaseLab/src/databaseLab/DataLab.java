package databaseLab;

import java.util.Scanner;

public class DataLab {

	public static void main(String[] args) {
		String[] name = { "Jim Halpert", "Dwight Schrute", "Michael Scott", "Stanley Hudson", "Ryan the Temp" };
		String[] town = { "Orlando, Florida", "Clark Summit, Pennsylvania", "Allentown, Pennsylvania",
				"Scranton, Pennsylvania", "New York City, New York" };
		String[] food = { "lemons", "beets", "wings", "meatballs", "cereal" };
		int[] number = { 1, 2, 3, 4, 5 };
		int person = 0;
		boolean cont = true;
		String personString;
		System.out.println("Welcome to our Java class. Which student would you like to learn about?");
		while (cont == true) {
			System.out.println("Enter 1-5: ");
			Scanner scnr = new Scanner(System.in);
			int userInput = scnr.nextInt();
			switch (userInput) {
			case 1:
				personString = name[0];
				System.out.println("Person " + number[0] + "'s name is " + personString);
				System.out.println("Would you like to know more about " + name[0] + "?");
				System.out.println("Enter 'hometown' or 'food':");
				String secondInput = scnr.next();
				if (secondInput.charAt(0) == 'h' || secondInput.charAt(0) == 'H') {
					System.out.println(personString + "'s hometown is " + town[0]);
					System.out.println("Would you like to know more? (yes/no)");
					String thirdInput = scnr.next();
					if (thirdInput.charAt(0) == 'y' || thirdInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!.");
						System.exit(0);
					}
				} else if (secondInput.charAt(0) == 'f' || secondInput.charAt(0) == 'F') {
					System.out.println(personString + "'s favorite food is " + food[0]);
					System.out.println("Would you like to know more? (yes/no)");
					String fourthInput = scnr.next();
					if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!");
						System.exit(0);
					}

				} else {
					System.out.println("Sorry, I didn't get that.");
					break;
				}

			case 2:
				personString = name[1];
				System.out.println("Person " + number[1] + "'s name is " + personString);
				System.out.println("Would you like to know more about " + name[1] + "?");
				System.out.println("Enter 'hometown' or 'food':");
				String secondInput2 = scnr.next();
				if (secondInput2.charAt(0) == 'h' || secondInput2.charAt(0) == 'H') {
					System.out.println(personString + "'s hometown is " + town[1]);
					System.out.println("Would you like to know more? (yes/no)");
					String thirdInput = scnr.next();
					if (thirdInput.charAt(0) == 'y' || thirdInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!.");
						System.exit(0);
					}
				} else if (secondInput2.charAt(0) == 'f' || secondInput2.charAt(0) == 'F') {
					System.out.println(personString + "'s favorite food is " + food[1]);
					System.out.println("Would you like to know more? (yes/no)");
					String fourthInput = scnr.next();
					if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!");
						System.exit(0);
					}

				} else {
					System.out.println("Sorry, I didn't get that.");
					break;
				}

			case 3: 
				personString = name[2];
				System.out.println("Person " + number[2] + "'s name is " + personString);
				System.out.println("Would you like to know more about " + name[2] + "?");
				System.out.println("Enter 'hometown' or 'food':");
				String secondInput3 = scnr.next();
				if (secondInput3.charAt(0) == 'h' || secondInput3.charAt(0) == 'H') {
					System.out.println(personString + "'s hometown is " + town[2]);
					System.out.println("Would you like to know more? (yes/no)");
					String thirdInput = scnr.next();
					if (thirdInput.charAt(0) == 'y' || thirdInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!.");
						System.exit(0);
					}
				} else if (secondInput3.charAt(0) == 'f' || secondInput3.charAt(0) == 'F') {
					System.out.println(personString + "'s favorite food is " + food[2]);
					System.out.println("Would you like to know more? (yes/no)");
					String fourthInput = scnr.next();
					if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!");
						System.exit(0);
					}

				} else {
					System.out.println("Sorry, I didn't get that.");
					break;
				}
			case 4: 
				personString = name[3];
				System.out.println("Person " + number[3] + "'s name is " + personString);
				System.out.println("Would you like to know more about " + name[3] + "?");
				System.out.println("Enter 'hometown' or 'food':");
				String secondInput4 = scnr.next();
				if (secondInput4.charAt(0) == 'h' || secondInput4.charAt(0) == 'H') {
					System.out.println(personString + "'s hometown is " + town[3]);
					System.out.println("Would you like to know more? (yes/no)");
					String thirdInput = scnr.next();
					if (thirdInput.charAt(0) == 'y' || thirdInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!.");
						System.exit(0);
					}
				} else if (secondInput4.charAt(0) == 'f' || secondInput4.charAt(0) == 'F') {
					System.out.println(personString + "'s favorite food is " + food[3]);
					System.out.println("Would you like to know more? (yes/no)");
					String fourthInput = scnr.next();
					if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
						break;
					} else {
						System.out.println("Thanks!");
						System.exit(0);
					}

				} else {
					System.out.println("Sorry, I didn't get that.");
					break;
				}

			case 5: personString = name[4];
			System.out.println("Person " + number[4] + "'s name is " + personString);
			System.out.println("Would you like to know more about " + name[4] + "?");
			System.out.println("Enter 'hometown' or 'food':");
			String secondInput5 = scnr.next();
			if (secondInput5.charAt(0) == 'h' || secondInput5.charAt(0) == 'H') {
				System.out.println(personString + "'s hometown is " + town[4]);
				System.out.println("Would you like to know more? (yes/no)");
				String thirdInput = scnr.next();
				if (thirdInput.charAt(0) == 'y' || thirdInput.charAt(0) == 'Y') {
					break;
				} else {
					System.out.println("Thanks!.");
					System.exit(0);
				}
			} else if (secondInput5.charAt(0) == 'f' || secondInput5.charAt(0) == 'F') {
				System.out.println(personString + "'s favorite food is " + food[4]);
				System.out.println("Would you like to know more? (yes/no)");
				String fourthInput = scnr.next();
				if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
					break;
				} else {
					System.out.println("Thanks!");
					System.exit(0);
				}

			} else {
				System.out.println("Sorry, I didn't get that.");
				break;
			}
			default:
				System.out.println("Sorry I didn't get that. Please try again.");
				break;
			}
		}
	}

}
