    public static void main(String[] args) {
        Pet[] pets = new Pet[5];

        pets[0] = new DogPet("Бобик", 3, "Иван", "Лабрадор");
        pets[1] = new DogPet("Шарик", 5, "Пётр", "Овчарка");
        pets[2] = new DogPet("Рекс", 2, "Анна", "Бульдог");
        pets[3] = new CatPet("Мурка", 4, "Ольга", "Белый");
        pets[4] = new CatPet("Барсик", 1, "Сергей", "Рыжий");

        for (Pet pet : pets) {
            pet.displayInfo();
            pet.play();

            if (pet instanceof DogPet) {
                ((DogPet) pet).bark();
            } else if (pet instanceof CatPet) {
                ((CatPet) pet).meow();
            }

            System.out.println();
        }
    }
