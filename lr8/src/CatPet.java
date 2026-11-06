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