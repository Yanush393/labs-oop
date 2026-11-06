package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Tree tree1 = new Tree("Дуб", 15.5, "Лиственное", 8.0);
        Tree tree2 = new Tree("Сосна", 20.0, "Хвойное", 5.5);
        Tree tree3 = new Tree("Клён", 12.0, "Лиственное", 6.5);

        Flower flower1 = new Flower("Роза", 0.5, "Кустарник", "Красный");
        Flower flower2 = new Flower("Тюльпан", 0.3, "Травянистое", "Жёлтый");

        Plant[] plants = { tree1, tree2, tree3, flower1, flower2 };

        System.out.println("=== Информация о растениях ===");
        for (Plant p : plants) {
            p.displayInfo();
            System.out.println();
        }

        System.out.println("=== Полив ===");
        for (Plant p : plants) {
            p.water();
        }

        System.out.println("\n=== Требования к свету ===");
        for (Plant p : plants) {
            System.out.println(p.getName() + " -> " + p.getLightRequirements());
        }

        System.out.println("\n=== Проверка типов ===");
        for (Plant p : plants) {
            if (p instanceof Tree) {
                Tree t = (Tree) p;
                System.out.println("Дерево " + t.getName() + ", диаметр кроны: " + t.getCrownDiameter());
            } else if (p instanceof Flower) {
                Flower f = (Flower) p;
                System.out.println("Цветок " + f.getName() + ", цвет цветения: " + f.getBloomColor());
            }
        }
    }
}
