package Loggers;

import entities.Education;

public class FileLogger implements LoggerDao{
    @Override
    public void add(Education education) {
        System.out.println("File ile loglandý: "+education.getCourseName());
    }
}
