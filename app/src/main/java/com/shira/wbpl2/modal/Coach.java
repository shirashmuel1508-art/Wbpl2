package com.shira.wbpl2.modal;

public class Coach extends User {


    String teamid;

    public Coach(String id, String firstname, String lastname, String email, String password, String phone, String role, String teamid) {
        super(id, firstname, lastname, email, password, phone, role);
        this.teamid = teamid;
    }

    public Coach(String teamid) {
        this.teamid = teamid;
    }

    public Coach() {
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "teamid='" + teamid + '\'' +
                '}';
    }
}
