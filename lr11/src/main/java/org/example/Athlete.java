package org.example;

public class Athlete {
    private String name;
    private String team;
    private int number;

    public Athlete(String name, String team, int number) {
        this.name = name;
        this.team = team;
        this.number = number;
    }

    public String getName() { return name; }
    public String getTeam() { return team; }
    public int getNumber() { return number; }

    public String train() {
        return "Тренируюсь";
    }

    public String train(int hours) {
        return "Тренируюсь " + hours + " часов";
    }

    public String train(String exercise) {
        return "Тренирую " + exercise;
    }

    public String getPosition() {
        return "Неизвестная позиция";
    }

    public String getPosition(int x){

        return "Неизвестная позиция" + x;
    }


    @Override
    public String toString() {
        return "Athlete{name='" + name + "', team='" + team + "', number=" + number + "}";
    }
}
