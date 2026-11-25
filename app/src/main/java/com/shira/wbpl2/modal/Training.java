package com.shira.wbpl2.modal;

public class Training {
    private String date;


    private String time;

    private String location;

    private String equipment;

    private String goal;
    private boolean isAchieve;

    private Coach coach;



    public Training(String date, String time, String location, String equipment, String goal, boolean isAchieve, Coach coach) {
        this.date = date;
        this.time = time;
        this.location = location;
        this.equipment = equipment;
        this.goal = goal;
        this.isAchieve = isAchieve;
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Training() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
    public boolean isAchieve() {
        return isAchieve;
    }


    public void setAchieve(boolean achieve) {
        isAchieve = achieve;
    }

    @Override
    public String toString() {
        return "Training{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", equipment='" + equipment + '\'' +
                ", goal='" + goal + '\'' +
                ", isAchieve=" + isAchieve +
                ", coach=" + coach +
                '}';
    }
}

