package com.shira.wbpl2.modal;

public class Game {
    private String date;

    private String opponentTeam;

    private String location;

    private int ourScore;

    private int opponentScore;

    private boolean finished;

    public Game(String date, String opponentTeam, String location, int ourScore, int opponentScore, boolean finished) {
        this.date = date;
        this.opponentTeam = opponentTeam;
        this.location = location;
        this.ourScore = ourScore;
        this.opponentScore = opponentScore;
        this.finished = finished;
    }

    public Game() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOpponentTeam() {
        return opponentTeam;
    }

    public void setOpponentTeam(String opponentTeam) {
        this.opponentTeam = opponentTeam;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getOurScore() {
        return ourScore;
    }

    public void setOurScore(int ourScore) {
        this.ourScore = ourScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(int opponentScore) {
        this.opponentScore = opponentScore;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Game{" +
                "date='" + date + '\'' +
                ", opponent='" + opponentTeam + '\'' +
                ", location='" + location + '\'' +
                ", ourScore=" + ourScore +
                ", opponentScore=" + opponentScore +
                ", finished=" + finished +
                '}';
    }
}
