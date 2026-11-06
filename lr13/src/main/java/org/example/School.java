package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String address;
    private int students;
    private int teachers;
    private double rating;
    private List<String> studentList;

    public School(String name, String address, int students, int teachers, double rating)
            throws InvalidSchoolDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidSchoolDataException("Название школы не может быть пустым");
        }
        if (students < 0) {
            throw new InvalidSchoolDataException("Количество студентов не может быть отрицательным");
        }
        if (teachers < 0) {
            throw new InvalidSchoolDataException("Количество учителей не может быть отрицательным");
        }
        if (rating < 0 || rating > 5) {
            throw new InvalidSchoolDataException("Рейтинг должен быть от 0 до 5");
        }
        this.name = name;
        this.address = address;
        this.students = students;
        this.teachers = teachers;
        this.rating = rating;
        this.studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(String studentName) throws EnrollmentException {
        if (studentName == null || studentName.trim().isEmpty()) {
            throw new EnrollmentException("Имя ученика не может быть пустым");
        }
        if (studentList.contains(studentName)) {
            throw new EnrollmentException("Ученик " + studentName + " уже зачислен");
        }
        studentList.add(studentName);
        students++;
        System.out.println("Ученик " + studentName + " зачислен в " + name);
    }

    public void expelStudent(String studentName) throws StudentNotFoundException {
        if (!studentList.remove(studentName)) {
            throw new StudentNotFoundException("Ученик не найден: " + studentName, studentName);
        }
        students--;
        System.out.println("Ученик " + studentName + " отчислен из " + name);
    }

    @Override
    public String toString() {
        return "School{name='" + name + "', address='" + address + "', students=" + students +
                ", teachers=" + teachers + ", rating=" + rating + "}";
    }
}
