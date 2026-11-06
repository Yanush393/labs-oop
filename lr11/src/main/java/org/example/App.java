package org.example;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println("=== Перегрузка методов (статический полиморфизм) ===");
        Athlete baseAthlete = new Athlete("Иван", "Сборная", 10);
        System.out.println(baseAthlete.train());
        System.out.println(baseAthlete.train(3));
        System.out.println(baseAthlete.train("бег"));

        Forward forward = new Forward("Пётр", "Динамо", 9, 25);
        System.out.println(forward.train());
        System.out.println(forward.train(2));
        System.out.println(forward.train("дриблинг"));
        System.out.println(forward.train(2, 8));
        System.out.println(forward.train("удары", 50));

        Goalkeeper goalkeeper = new Goalkeeper("Сергей", "Зенит", 1, 120);
        System.out.println(goalkeeper.train());
        System.out.println(goalkeeper.train(4));
        System.out.println(goalkeeper.train("прыжки"));
        System.out.println(goalkeeper.train(0.95));

        System.out.println("\n=== Переопределение методов (динамический полиморфизм) ===");
        Athlete athlete1 = baseAthlete;
        Athlete athlete2 = forward;
        Athlete athlete3 = goalkeeper;

        System.out.println(athlete1 + " -> " + athlete1.getPosition());
        System.out.println(athlete2 + " -> " + athlete2.getPosition());
        System.out.println(athlete3 + " -> " + athlete3.getPosition());

        System.out.println("\n=== Сравнение статического и динамического полиморфизма ===");
        Athlete polymorphic = forward;
        System.out.println("Вызов getPosition() (переопределение): " + polymorphic.getPosition());
        System.out.println("Вызов train(int) (перегрузка): " + polymorphic.train(2));
        System.out.println("Вызов train(String) (перегрузка): " + polymorphic.train("бег"));

        System.out.println("\n=== instanceof и приведение типов ===");
        if (athlete1 instanceof Forward) {
            Forward f = (Forward) athlete1;
            System.out.println("Нападающий " + f.getName() + ", голов: " + f.getGoals());
        } else if (athlete1 instanceof Goalkeeper) {
            Goalkeeper g = (Goalkeeper) athlete1;
            System.out.println("Вратарь " + g.getName() + ", сейвов: " + g.getSaves());
        } else {
            System.out.println("Базовый спортсмен: " + athlete1.getName());
        }

        if (athlete2 instanceof Forward) {
            Forward f = (Forward) athlete2;
            System.out.println("Нападающий " + f.getName() + ", голов: " + f.getGoals());
        } else if (athlete2 instanceof Goalkeeper) {
            Goalkeeper g = (Goalkeeper) athlete2;
            System.out.println("Вратарь " + g.getName() + ", сейвов: " + g.getSaves());
        } else {
            System.out.println("Базовый спортсмен: " + athlete2.getName());
        }

        if (athlete3 instanceof Forward) {
            Forward f = (Forward) athlete3;
            System.out.println("Нападающий " + f.getName() + ", голов: " + f.getGoals());
        } else if (athlete3 instanceof Goalkeeper) {
            Goalkeeper g = (Goalkeeper) athlete3;
            System.out.println("Вратарь " + g.getName() + ", сейвов: " + g.getSaves());
        } else {
            System.out.println("Базовый спортсмен: " + athlete3.getName());
        }
    }
}





