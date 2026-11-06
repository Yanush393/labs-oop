package org.example;

public class App {
    public static void main(String[] args) {
        School school = null;

        try {
            school = new School("Гимназия №1", "ул. Ленина, 10", 500, 45, 4.5);
            System.out.println("Школа создана: " + school);
        } catch (InvalidSchoolDataException e) {
            System.out.println("Ошибка создания школы: " + e.getMessage());
        }

        try {
            new School("", "ул. Пушкина, 5", 100, 10, 3.0);
        } catch (InvalidSchoolDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        try {
            new School("Школа №2", "ул. Гоголя, 2", -10, 20, 3.0);
        } catch (InvalidSchoolDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        if (school != null) {
            System.out.println("\n Зачисление ");
            try {
                school.enrollStudent("Иванов Иван");
                school.enrollStudent("Петров Петр");
                school.enrollStudent("Иванов Иван");
            } catch (EnrollmentException e) {
                System.out.println("Ошибка зачисления: " + e.getMessage());
            }

            System.out.println("\n Отчисление ");
            try {
                school.expelStudent("Петров Петр");
                school.expelStudent("Сидоров Сидор");
            } catch (StudentNotFoundException e) {
                System.out.println("Ошибка отчисления: " + e.getMessage() + " (Ученик: " + e.getStudentName() + ")");
            }

            System.out.println("\nИтоговое состояние школы:");
            System.out.println(school);
        }
    }
}
