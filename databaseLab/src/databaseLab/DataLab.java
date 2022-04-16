package databaseLab;

import java.util.Scanner;

public class DataLab {

	public static void main(String[] args) {
		String[] name = { "Jim Halpert", "Dwight Schrute", "Michael Scott", "Stanley Hudson", "Ryan the Temp" };
		String[] town = { "Scranton, Pennsylvania", "Honesdale, Pennsylvania", "Clark Summit, Pennsylvania",
				"Scranton, Pennsylvania", "New York City, New York" };
		String[] food = { "softshell crab", "beets", "mint chocolate chip ice cream", "meatballs", "cereal" };
		int[] number = { 1, 2, 3, 4, 5 };
		boolean cont = true;
		String personString;
		System.out.println("Welcome to our Java class. Which student would you like to learn about?");
		while (cont == true) {
			try {
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
						} else if (thirdInput.charAt(0) == 'n' || thirdInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
						}
					} else if (secondInput.charAt(0) == 'f' || secondInput.charAt(0) == 'F') {
						System.out.println(personString + "'s favorite food is " + food[0]);
						System.out.println("Would you like to know more? (yes/no)");
						String fourthInput = scnr.next();
						if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
							break;
						} else if (fourthInput.charAt(0) == 'n' || fourthInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
						}

					} else {
						System.out.println("Sorry, I didn't get that. Please try again.");
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
						} else if (thirdInput.charAt(0) == 'n' || thirdInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}
					} else if (secondInput2.charAt(0) == 'f' || secondInput2.charAt(0) == 'F') {
						System.out.println(personString + "'s favorite food is " + food[1]);
						System.out.println("Would you like to know more? (yes/no)");
						String fourthInput = scnr.next();
						if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
							break;
						} else if (fourthInput.charAt(0) == 'n' || fourthInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}

					} else {
						System.out.println("Sorry, I didn't get that. Please try again.");
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
						} else if (thirdInput.charAt(0) == 'n' || thirdInput.charAt(0) == 'N') {
							System.out.println("Thanks!.");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}
					} else if (secondInput3.charAt(0) == 'f' || secondInput3.charAt(0) == 'F') {
						System.out.println(personString + "'s favorite food is " + food[2]);
						System.out.println("Would you like to know more? (yes/no)");
						String fourthInput = scnr.next();
						if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
							break;
						} else if (secondInput3.charAt(0) == 'n' || secondInput3.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}

					} else {
						System.out.println("Sorry, I didn't get that. Please try again.");
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
						} else if (thirdInput.charAt(0) == 'n' || thirdInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}
					} else if (secondInput4.charAt(0) == 'f' || secondInput4.charAt(0) == 'F') {
						System.out.println(personString + "'s favorite food is " + food[3]);
						System.out.println("Would you like to know more? (yes/no)");
						String fourthInput = scnr.next();
						if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
							break;
						} else if (fourthInput.charAt(0) == 'n' || fourthInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}

					} else {
						System.out.println("Sorry, I didn't get that. Please try again.");
						break;
					}

				case 5:
					personString = name[4];
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
						} else if (thirdInput.charAt(0) == 'n' || thirdInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Please try again.");
							break;
						}

					} else if (secondInput5.charAt(0) == 'f' || secondInput5.charAt(0) == 'F') {
						System.out.println(personString + "'s favorite food is " + food[4]);
						System.out.println("Would you like to know more? (yes/no)");
						String fourthInput = scnr.next();
						if (fourthInput.charAt(0) == 'y' || fourthInput.charAt(0) == 'Y') {
							break;
						} else if (fourthInput.charAt(0) == 'n' || fourthInput.charAt(0) == 'N') {
							System.out.println("Thanks!");
							System.exit(0);
						} else {
							System.out.println("Sorry, I didn't get that. Let's start over and try again.");
							break;
						}

					} else {
						System.out.println("Sorry, I didn't get that. Let's start over and try again.");
						break;
					}
				default:
					System.out.println("That student does not exist. Please try again.");
					break;
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println("I'm sorry, the input was out of bounds. Please try again.");
			} catch (Exception e) {
				System.out.println("I'm sorry, the input was invalid. Please try again.");
			}
		}
	}

}
