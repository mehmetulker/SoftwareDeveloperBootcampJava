package entities;

public class Education {

	private int id;
	private String courseName;
	private String teacherName;
	private String catagoriName;
	private int coursePrice;

	public Education() {
		this.id = id;
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.catagoriName = catagoriName;
		this.coursePrice = coursePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCatagoriName() {
		return catagoriName;
	}

	public void setCatagoriName(String catagoriName) {
		this.catagoriName = catagoriName;
	}

	public int getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}

	@Override
	public String toString() {

		String info = "Kurs adý=" + courseName + ", Eðitmen=" + teacherName + ",  Katagori adý=" + catagoriName
				+ ", Kurs Fiyatý=" + coursePrice;

		return info;
	}

}
