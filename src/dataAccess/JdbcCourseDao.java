package dataAccess;

import entities.Education;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Education education) {
		System.out.println("Jdbcc ile  veri taban�na kay�t yap�ld�. ");
		
	}

}
