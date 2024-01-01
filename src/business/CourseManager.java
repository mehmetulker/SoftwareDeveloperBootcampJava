package business;

import Loggers.LoggerDao;
import dataAccess.CourseDao;
import entities.Education;

public class CourseManager {

	private CourseDao courseDao;
	private LoggerDao[] loggers;

	public CourseManager(CourseDao courseDao,LoggerDao[] loggers) {

		this.courseDao = courseDao;
		this.loggers=loggers;
	}

	public void add(Education education) throws Exception {
			
			if(education.getCoursePrice() <0 ) {
				
				System.out.println("Kurs fiyat� 0 veya k���k olamaz");
				
           throw new Exception("Kurs fiyat� 0 veya k���k olamaz");
				
			}else{
				
				courseDao.add(education);
				
				System.out.println(education);
				
				for (LoggerDao loggerDao : loggers) {
					
					loggerDao.add(education);
					
				}
				
			}
		}

	
	


}
