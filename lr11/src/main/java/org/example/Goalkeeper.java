package org.example;

public class Goalkeeper extends Athlete {
    private int saves;

    public Goalkeeper(String name, String team, int number, int saves) {
        super(name, team, number);
        this.saves = saves;
    }

    public int getSaves() { return saves; }

    @Override
    public String getPosition() {
        return "Вратарь";
    }

    public String train(double reflexLevel) {
        return "Вратарь тренирует реакцию на уровне " + reflexLevel;
    }

    @Override
    public String toString() {
        return "Goalkeeper{name='" + getName() + "', team='" + getTeam() +
                "', number=" + getNumber() + ", saves=" + saves + "}";
    }
}
