public class MainSchool{
	public static void main(String[] args) {

		String[] departments={"Computer Science", "Engineering", null};
		String[] newDepartments= new String[3];
		

		School sch1 = new School("University of Texas at El Paso", 23397, 9744.00, 1119);
		
		School sch2 = new School("University of Texas at Austin", 51991, 11752.00, 3000);
		
		School sch3 = new School("Univeristy of California at Irvin", 36000, 13775.00, 19378);
		
		School sch4 = new School("Texas State Univeristy", 38808, 11135.00, 1200);

		School sch5 = new School("Yale University", 14776, 59950.00, 5259);

		School[] schools= {sch1, sch2, sch3, sch4, sch5};

		for(int i=0;i<schools.length;i++){
			schools[i].printInfo(newDepartments, departments);
			System.out.println();
		}

		System.out.println();

		System.out.println("Sorry! Tuition just went up 2000 dollars at every univeristy in the world. Here is the updated info: ");
		System.out.println();
		for(int i=0;i<schools.length;i++){
			double newTuition = schools[i].getTuition()+2000;
			schools[i].setTuition(newTuition);
			schools[i].printInfo(newDepartments, departments);
			System.out.println();
		}

		System.out.println();
		System.out.println("Total number of students at all given schools: " + totalStudents(schools, 0));
	}

	//RECURSIVE METHOD:
    public static int totalStudents(School[] arr, int i) {
        if (i==arr.length) {
            return 0;
        }
        return arr[i].getNumStudents() + totalStudents(arr, i+1);
    }


}
