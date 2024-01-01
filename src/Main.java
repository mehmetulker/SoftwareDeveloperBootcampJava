import Loggers.DataBaseLogger;
import Loggers.FileLogger;
import Loggers.LoggerDao;
import Loggers.MailLogger;
import business.CourseManager;
import dataAccess.HibernateDaoCourseDao;
import entities.Education;


public class Main {

	public static void main(String[] args) throws Exception {

		
		Education education= new Education();
		education.setId(1);
		education.setCourseName("Java 101");
		education.setCatagoriName("Programlama");
		education.setTeacherName("Engin Demirog");
		education.setCoursePrice(20);
		LoggerDao[] loggerDaos={new FileLogger(),new MailLogger(),new DataBaseLogger()};
		CourseManager courseManager=new CourseManager(new HibernateDaoCourseDao(),loggerDaos);		
		courseManager.add(education);

	}

}
