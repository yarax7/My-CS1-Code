public class MainSchool{
	public static void main(String[] args) {
		String [] departments ={"Computer Science","Civil Engineering","Psychology"};
		School sch1 = new School("University of Texas at El Paso", 23397, 9744.00, 1119, departments);
		School sch2 = new School("University of Texas at Austin", 51991, 11752.00, 3000, departments);
		School sch3 = new School("Univeristy of California, Irvin", 36000, 13775.00, 19378, departments);
		School sch4 = new School("Texas State Univeristy", 38808, 11135.00, 1200, departments);
		School sch5 = new School("Yale University", 14776, 59950.00, 5259, departments);

		School[] schools= {sch1, sch2, sch3, sch4, sch5};

		for(int i=0;i<schools.length;i++){
			schools[i].printInfo();
			System.out.println();
		}

		System.out.println();

		// System.out.println(findIvyLeague(schools, 0));
		System.out.println("Sorry! Tuition just went up 2000 dollars. Here is the updated info: ");
		System.out.println();
		for(int i=0;i<schools.length;i++){
			double newTuition = schools[i].getTuition()+2000;
			schools[i].setTuition(newTuition);
			schools[i].printInfo();
			System.out.println();
		}
	}


	

	public static String findIvyLeague(School[] arr, int x){
			double maxTuition=0;
			String ivyLeague=" ";
			if(x==arr.length){
				return ivyLeague;
			}
			if(arr[x].getTuition()>maxTuition){
				maxTuition=arr[x].getTuition();
				ivyLeague=arr[x].getSchool();
			}
			return findIvyLeague(arr, x++);
		} 
}