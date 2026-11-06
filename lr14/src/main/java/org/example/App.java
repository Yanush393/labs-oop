package org.example;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            task1();
            task2();
            task3();
            task4();
            task5();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void task1() throws IOException {
        System.out.println("=== Задание 1 ===");
        File file = new File("app.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("Любимое приложение: Visual Studio Code\nВерсия: 1.85\nПлатформа: Windows\n");
        }

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Можно читать: " + file.canRead());
        System.out.println("Можно писать: " + file.canWrite());

        System.out.println("Содержимое файла:");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        System.out.println();
    }

    static void task2() throws IOException {
        System.out.println("=== Задание 2 ===");
        Scanner scanner = new Scanner(System.in);
        File file = new File("f.txt");

        System.out.println("Введите 10 целых чисел:");
        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                fw.write(num + "\n");
            }
        }

        System.out.println("Числа из файла:");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.print(num + " ");
                if (num % 10 == 0 && num % 5 != 0) {
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, кратных 10 и не кратных 5: " + count);
        System.out.println();
    }

    static void task3() throws IOException {
        System.out.println("=== Задание 3 ===");
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        try (FileWriter fw = new FileWriter(f)) {
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(200) - 100;
                numbers.add(num);
                fw.write(num + "\n");
            }
        }

        try (FileWriter fwG = new FileWriter(g);
             FileWriter fwH = new FileWriter(h)) {
            for (int num : numbers) {
                if (num % 12 == 0 && num % 4 != 0) {
                    fwG.write(num + "\n");
                } else {
                    fwH.write(num + "\n");
                }
            }
        }
        System.out.println("Файлы g.txt и h.txt созданы.");
        System.out.println();
    }

    static void task4() throws IOException {
        System.out.println("=== Задание 4 ===");
        Scanner scanner = new Scanner(System.in);
        File file = new File("temp.txt");

        System.out.println("Введите 15 вещественных значений температуры процессора:");
        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < 15; i++) {
                double temp = scanner.nextDouble();
                fw.write(temp + "\n");
            }
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line.trim());
                count++;
            }
        }
        System.out.println("Средняя температура процессора: " + (sum / count));
        System.out.println();
    }

    static void task5() throws IOException {
        System.out.println("=== Задание 5 ===");
        File file = new File("f.txt");
        Random random = new Random();

        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < 10; i++) {
                fw.write((random.nextInt(200) - 50) + "\n");
            }
        }

        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                if (num > 80) {
                    count++;
                }
            }
        }
        System.out.println("Количество чисел, больших 80: " + count);
        System.out.println();
    }
}