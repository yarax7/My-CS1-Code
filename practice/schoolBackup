//SCHOOL HW ASSIGNMENT BACKUPS:

public static String findMostStudents(School[] arr, int i){
		int max=0;
		String school=" ";
		if(i==arr.length){
			return school;
		} else if(arr[i].getNumStudents()>max){
			max=arr[i].getNumStudents();
			school=arr[i].getSchool();
		}
		return findMostStudents(arr, i+1);
	}

	public static String findIvyLeague(School[] arr, int x){
			double maxTuition=0;
			String ivyLeague=" ";
			if(x==arr.length-1){
				return ivyLeague;
			}
			if(arr[x].getTuition()>maxTuition){
				maxTuition=arr[x].getTuition();
				ivyLeague=arr[x].getSchool();
			}
			return findIvyLeague(arr, x+1);
		} 