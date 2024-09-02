import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many dollars are you willing to spend? (type a positive integer): ");
		int pricePoint = scanner.nextInt();

		System.out.print("I would be interested in trying boba! (type true or false): ");
		boolean isInterestedInBoba = scanner.nextBoolean();

		System.out.print("I am addicted to warm rolls with cinnamon butter (type true or false): ");
		boolean isAddictedToRolls = scanner.nextBoolean();
		
		System.out.print("I am looking for a full meal as opposed to a pick-me-up snack (type true or false): ");
		boolean isFullMeal = scanner.nextBoolean();

		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// NOTE - this is the starter code for the Challenge
		// question. Use the MinersFoodRecommendationService.java
		// file for the required portion.
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		// TODO: Replace the /*FIXME*/ below with your code.
		// Do not modify or add anything else.
		if (/*FIXME*/) {
			System.out.println("Boba Mi Amor");
		} else if (/*FIXME*/) {
			System.out.println("Starbucks");
		} else if (/*FIXME*/) {
			System.out.println("Texas Roadhouse");
		} else {
			System.out.println("Chick-fil-A");
		}
	}
}
