import org.example.Psychologist;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Psychologist> psychologists = new ArrayList<>();
        psychologists.add(new Psychologist(1, "Иванов", "Клинический", 3, Arrays.asList(5, 4, 3, 4))); // avg 4.0
        psychologists.add(new Psychologist(2, "Петрова", "Детский", 4, Arrays.asList(5, 5, 4, 5)));   // avg 4.75
        psychologists.add(new Psychologist(3, "Сидоров", "Семейный", 2, Arrays.asList(2, 1, 3, 2)));   // avg 2.0
        psychologists.add(new Psychologist(4, "Кузнецова", "Когнитивный", 5, Arrays.asList(4, 4, 5, 4))); // avg 4.25
        psychologists.add(new Psychologist(5, "Смирнов", "Психотерапевт", 3, Arrays.asList(3, 3, 2, 4))); // avg 3.0
        psychologists.add(new Psychologist(6, "Алексеев", "Семейный", 3, Arrays.asList(4, 5, 4, 5)));  // avg 4.5

        System.out.println(" 1. Психологи со средним рейтингом > 3 ");
        for (Psychologist p : psychologists) {
            if (p.getAverageRating() > 3) {
                System.out.println(p.getName() + " | Средний: " + String.format("%.2f", p.getAverageRating()));
            }
        }

        System.out.println("\n 2. Повышение рейтинга (средний >= 4) ");
        for (Psychologist p : psychologists) {
            if (p.getAverageRating() >= 4) {
                p.setRating(p.getRating() + 1);
                System.out.println("Повышен рейтинг: " + p.getName() + " -> " + p.getRating());
            }
        }

        System.out.println("\n 3. Печать психологов с рейтингом 4 ");
        printPsychologists(psychologists, 4);

        System.out.println("\n 4. Сортировка по убыванию среднего рейтинга ");
        psychologists.sort((p1, p2) -> {
            int cmp = Double.compare(p2.getAverageRating(), p1.getAverageRating());
            if (cmp == 0) {
                return p1.getName().compareTo(p2.getName());
            }
            return cmp;
        });

        for (Psychologist p : psychologists) {
            System.out.println(p);
        }
    }

    public static void printPsychologists(List<Psychologist> psychologists, int rating) {
        for (Psychologist p : psychologists) {
            if (p.getRating() == rating) {
                System.out.println("ID: " + p.getId() + ", Имя: " + p.getName());
            }
        }
    }
}