import java.util.Scanner;

class MinersFoodRecommendationService2 {
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
		


		if (pricePoint < 10 ) {

				if (isInterestedInBoba == true)
					System.out.print(" Boba Mi Amor ");
				else 
					System.out.print(" Starbucks ");
			}
		else {

				if ( isAddictedToRolls == true)
					System.out.print(" Texas Roadhouse ");
				else {
					
					if (isFullMeal == true)
						System.out.print(" Chick-fil-A ");
					else {
						System.out.print(" Starbucks ");
					}

				}

			} 

        
		}
		
	}


