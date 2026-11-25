package com.shira.wbpl2.modal;

import java.util.ArrayList;

public class Team {


    String id ;
    private String teamName;

    private Coach coach;

    private ArrayList<Player> players;

    public Team(String id, String teamName, Coach coach, ArrayList<Player> players) {
        this.id = id;
        this.teamName = teamName;
        this.coach = coach;
        this.players = players;
    }

    public Team() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", teamName='" + teamName + '\'' +
                ", coach=" + coach +
                ", players=" + players +
                '}';
    }
}
