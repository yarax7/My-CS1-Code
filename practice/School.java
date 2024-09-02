public class School {

	private String school;
	private int numStudents;
	private double tuition;
	private int numFaculty;
	private String[] departments;

	public School(){

	}

	public School(String schoolIn, int numStudentsIn, double tuitionIn, int facultyIn){
		this.school=schoolIn;
		this.numStudents=numStudentsIn;
		this.tuition=tuitionIn;
		this.numFaculty=facultyIn;

	}

	public void setSchool(String schoolIn){
		this.school=schoolIn;
	}

	public void setNumStudents(int numStudentsIn){
		this.numStudents=numStudentsIn;
	}

	public void setTuition(double tuitionIn){
		this.tuition=tuitionIn;
	}

	public void setNumFaculty(int numFacultyIn){
		this.numFaculty=numFacultyIn;
	}

	public void setDepartments(String[] departmentsIn){
		this.departments=departmentsIn;
	}

	public String getSchool(){
		return this.school;
	}

	public int getNumStudents(){
		return this.numStudents;
	}

	public double getTuition(){
		return this.tuition;
	}

	public int getNumFaculty(){
		return this.numFaculty;
	}

	public String[] getDepartment(){
		return this.departments;
	}

	public void printInfo(String[] arr, String[] oldArr){
		System.out.println("School: "+ getSchool());
		System.out.println("Number of students: "+ getNumStudents());
		System.out.println("Price of (in-state) tuition: "+getTuition());
		System.out.println("Total number of faculty: "+getNumFaculty());
		System.out.print("Departments: ");
		arr = newDepartment(oldArr, "Psychology");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}

	public String[] newDepartment(String[] oldArray, String departmentAdd){
		String[] newArray= new String[3];
		for(int i=0;i<newArray.length;i++){
			if(oldArray[i]==null){
				newArray[i]=departmentAdd;
			} else {
				newArray[i]=oldArray[i];
			}
		}
		return newArray;
	}
	
}

