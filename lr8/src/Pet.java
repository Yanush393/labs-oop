public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void play() {
        System.out.println(name + " играет");
    }

    public void displayInfo() {
        System.out.println("Кличка: " + name + ", возраст: " + age + ", хозяин: " + owner);
    }
}


public class DogPet extends Pet {
    private String breed;

    public DogPet(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с мячом");
    }

    public void bark() {
        System.out.println(getName() + " говорит: Гав-гав!");
    }
}




public class CatPet extends Pet {
    private String color;

    public CatPet(String name, int age, String owner, String color) {
        super(name, age, owner);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с клубком");
    }

    public void meow() {
        System.out.println(getName() + " говорит: Мяу-мяу!");
    }
}

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