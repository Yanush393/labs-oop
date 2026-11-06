public class Animal {
    String species;
    int age;
    double weight;

    static int totalAnimals = 0;
    static double totalWeight = 0;

    public Animal(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        totalAnimals++;
        totalWeight += weight;
    }

    public static double getAverageWeight() {
        if (totalAnimals == 0) return 0;
        return totalWeight / totalAnimals;
    }


}

public static void main(String[] args) {
    Animal a1 = new Animal("Лев", 5, 190.5);
    Animal a2 = new Animal("Тигр", 4, 220.3);
    Animal a3 = new Animal("Медведь", 7, 350.0);
    Animal a4 = new Animal("Волк", 3, 45.7);
    Animal a5 = new Animal("Лиса", 2, 8.2);

    System.out.printf("Средний вес: %.2f кг%n", Animal.getAverageWeight());
}