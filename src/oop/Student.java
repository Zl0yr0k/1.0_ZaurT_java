package oop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    Student (StringBuilder name, int course, int grade){
        setName(name);
        setCourse(course);
        setGrade(grade);
    }

    private StringBuilder name = new StringBuilder();
    private int course;
    private int grade;

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder name) {
        String regex = "^[A-Za-z]{3,}$";
        if (name.toString().matches(regex)){
            this.name = name;
        }else {
            System.out.println("Не верный формат имени");
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        //тут лучше проверить число сразу в if, но надо было попробовать другой метод
        String numberOfCourse = String.valueOf(course);
        Pattern pattern = Pattern.compile("^[1-4]$");
        Matcher matcher = pattern.matcher(numberOfCourse);
        if (matcher.matches()){
            this.course = course;
        } else {
            System.out.println("Не верный формат курса");
        }

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("ВВедено неверное значение Грэйда");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", course='" + course + '\'' +
                ", grade=" + grade +
                '}';
    }
}
