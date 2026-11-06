package org.example;

public class Forward extends Athlete {
    private int goals;

    public Forward(String name, String team, int number, int goals) {
        super(name, team, number);
        this.goals = goals;
    }

    public int getGoals() { return goals; }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    public String train(int hours, int intensity) {
        return "Нападающий тренирует удары " + hours + " часов с интенсивностью " + intensity;
    }

    public String train(String exercise, int reps) {
        return "Нападающий тренирует " + exercise + " на " + reps + " повторений";
    }

    @Override
    public String toString() {
        return "Forward{name='" + getName() + "', team='" + getTeam() +
                "', number=" + getNumber() + ", goals=" + goals + "}";
    }
}

