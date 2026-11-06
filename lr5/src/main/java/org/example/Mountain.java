package org.example;

public class Mountain {
    private String name;
    private double height;
    private String country;

    public Mountain(String name, double height, String country) {
        this.name = name;
        this.height = height;
        this.country = country;
    }

    public double getHeight() { return height; }

    @Override
    public String toString() {
        return name + " (" + height + " м, " + country + ")";
    }

    public static void main(String[] args) {
        Mountain[] mountains = {
                new Mountain("Эверест", 8848.86, "Непал/Китай"),
                new Mountain("К2", 8611, "Пакистан/Китай"),
                new Mountain("Канченджанга", 8586, "Непал/Индия"),
                new Mountain("Лхоцзе", 8516, "Непал/Китай"),
                new Mountain("Макалу", 8485, "Непал/Китай"),
                new Mountain("Чо-Ойю", 8188, "Непал/Китай")
        };

        Mountain highest = mountains[0];
        double sum = 0;
        for (Mountain m : mountains) {
            if (m.getHeight() > highest.getHeight()) highest = m;
            sum += m.getHeight();
        }

        System.out.println("Самая высокая гора: " + highest);
        System.out.println("Средняя высота: " + (sum / mountains.length));
    }
}