package com.shira.wbpl2.modal;

public class Player extends User {


    private int age;

    private int number;

    String teamid;

    private String position;


    public Player(String id, String firstname, String lastname, String email, String password, String phone, String role, int age, int number, String position) {
        super(id, firstname, lastname, email, password, phone, role);
        this.age = age;
        this.number = number;
        this.position = position;
    }

    public Player(int age, int number, String position) {
        this.age = age;
        this.number = number;
        this.position = position;
    }

    public Player() {

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                ", number=" + number +
                ", position='" + position + '\'' +
                '}';
    }
}
