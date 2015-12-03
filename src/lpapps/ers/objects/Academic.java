package lpapps.ers.objects;

/**
 * 
 * @author Laurence Parker
 *
 */
public class Academic extends Employee{
	protected String department, roomNo;
	protected int grade, extension;	// extension 8=Lecturer, 9=Senior Lecturer, 10=Principle Lecturer
//	protected static boolean ext = false;
	
	/**
	 * null constructor
	 */
	public Academic() {
		super();
		department = "";
		roomNo = "";
		grade = 0;
		extension = 0;
	}
	
	/**
	 * defined constructor
	 */
	public Academic(String nme, char sex, Date dob, int id, Date start) {
		super(nme, sex, dob, id, start);
		department = "";
		roomNo = "";
		grade = 0;
		extension = 0;
	}
	
	/**
	 * clone constructor
	 */
	public Academic(Academic other) {
		super(other.name, other.gender.trim().charAt(0), 
				new Date(other.birthDate), other.id, other.dateStarted);
		department = other.department;
		roomNo = other.roomNo;
		grade = other.grade;
		extension = other.extension;		
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	/**
	 * make copy of Academic object
	 */
	public void copyAcademic(Academic other) {
		super.copy(other);
		department = other.department;
		roomNo = other.roomNo;
		extension = other.extension;
		grade = other.grade;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @return the roomNo
	 */
	public String getRoomNo() {
		return roomNo;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @return the extension
	 */
	public int getExtension() {
		return extension;
	}
	
	/**
	 * Override object toString(), display details of academic object
	 */
	public String toString() {
		return super.toString() + " Department:" + department + 
				" Room Number:" + roomNo + " Extension:" + extension + 
				" Grade:" + grade;
	}
	
	/**
	 * object equals check
	 */
	public boolean equals(Academic other) {
		return super.equalsEmployee(other) && department.equals(department)
				&& roomNo.equals(roomNo) && extension == other.extension
				&& grade == other.grade;
	}
}
