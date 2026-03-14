package oop;

import java.util.Arrays;

public class MainOOP {
    public static void main(String [] args) {
        StudentRecord sr = new StudentRecord(new StringBuilder("Valera"), "Math", 5);
        System.out.println(sr);

        System.out.println(sr.course());
        System.out.println(sr.name());
        StudentRecord newName = new StudentRecord( new StringBuilder("Rodion"), "Phisics", 8);
        newName.name().append("!!!!!");
        System.out.println(newName);

        System.out.println("___________________________________");
        Student st = new Student(new StringBuilder("Eva"), 4, 9);
        System.out.println(st);
        System.out.println(st.getCourse());
        System.out.println(st.getName());
        String change = st.getName().append("!!!!").toString();
        System.out.println(st.getName());
        System.out.println(change);
        st.setName(new StringBuilder("Ro"));
        st.setName(new StringBuilder("123445"));
        st.setCourse(5);
        st.setCourse(0);
        st.setGrade(-1);
        st.setGrade(11);
        System.out.println(st);
        st.setName(new StringBuilder("Rodion"));
        System.out.println(st);
    }
}
