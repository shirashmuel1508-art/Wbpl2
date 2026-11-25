package com.shira.wbpl2.modal;

public class Statistics {
    private Player player;

    private Game game;

    private int points;

    private int rebounds;

    private int assists;

    private int steals;

    private int turnovers;

    public Statistics(Player player, Game game, int points, int rebounds, int assists, int steals, int turnovers) {
        this.player = player;
        this.game = game;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
        this.steals = steals;
        this.turnovers = turnovers;
    }

    public Statistics() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getSteals() {
        return steals;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "player=" + player +
                ", game=" + game +
                ", points=" + points +
                ", rebounds=" + rebounds +
                ", assists=" + assists +
                ", steals=" + steals +
                ", turnovers=" + turnovers +
                '}';
    }
}
