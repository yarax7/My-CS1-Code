class BurgerShop {
	public static void main(String[] args) {
		double propane = 1.0;
		if (propane > 0) {
		    propane = propane - 0.9;
		    System.out.println(propane);
		}
		if (propane == 0.1) {
		    System.out.println("Burnt to a crisp!");
		} else {
		    System.out.println("Sorry, propane malfunction.");
		}
	}
}
