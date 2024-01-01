package Loggers;

import entities.Education;

public class MailLogger implements LoggerDao{
    @Override
    public void add(Education education) {
        System.out.println("Mail ile loglandý: "+education.getCourseName());
    }
}
