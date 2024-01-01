package Loggers;

import entities.Education;

public class DataBaseLogger implements LoggerDao{
    @Override
    public void add(Education education) {
        System.out.println("Database ile loglandý: "+education.getCourseName());
    }
}
