package dataAccess;

import entities.Education;

public class HibernateDaoCourseDao implements CourseDao {

	@Override
	public void add(Education education) {
		System.out.println("Hibernate veri tabanýna kayýt yapýldý. ");
		
	}

}
