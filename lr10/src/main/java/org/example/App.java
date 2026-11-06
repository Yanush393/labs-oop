package org.example;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println(Driveable.info());
        System.out.println(Parkable.info());

        Sedan sedan1 = new Sedan("Toyota Camry", 120);
        Sedan sedan2 = new Sedan("Honda Accord", 110);
        Sedan sedan3 = new Sedan("Kia K5", 130);

        Suv suv1 = new Suv("Land Rover", 90);
        Suv suv2 = new Suv("Jeep Grand Cherokee", 100);

        Driveable[] driveables = { sedan1, sedan2, sedan3, suv1, suv2 };
        Parkable[] parkables = { sedan1, sedan2, sedan3, suv1, suv2 };

        System.out.println("\n=== Движение ===");
        for (Driveable d : driveables) {
            d.drive();
        }

        System.out.println("\n=== Выезд с парковки и движение ===");
        sedan1.leaveParking();
        sedan2.leaveParking();
        suv1.leaveParking();

        for (Driveable d : driveables) {
            d.drive();
            System.out.println("Текущая скорость: " + d.getSpeed());
        }

        System.out.println("\n=== Торможение и парковка ===");
        for (Driveable d : driveables) {
            d.brake();
        }

        for (Parkable p : parkables) {
            p.park();
            System.out.println("Припаркован: " + p.isParked());
        }

        System.out.println("\n=== Полиморфизм через интерфейсы ===");
        Driveable polymorphic = sedan3;
        polymorphic.drive();
        polymorphic.brake();
        System.out.println("Скорость после торможения: " + polymorphic.getSpeed());

        Parkable parkable = suv2;
        parkable.park();
        System.out.println("Внедорожник припаркован: " + parkable.isParked());

        System.out.println("\n=== Проверка типов и приведение ===");
        for (Driveable d : driveables) {
            if (d instanceof Sedan) {
                Sedan s = (Sedan) d;
                System.out.println("Седан марки " + s.getBrand());
            } else if (d instanceof Suv) {
                Suv s = (Suv) d;
                System.out.println("Внедорожник марки " + s.getBrand());
            }
        }

    }
}
