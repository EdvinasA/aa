package com.company1;


public class Human {

    private String name;
    private String lastName;
    private int lungs;
    private int heart;
    private int stomach;


    private int eyes;
    private int legs;
    private int arms;
    private boolean hair;
    private int fingers;
    private boolean skin;
    private boolean muscles;

    public Human(String name, String lastName, int lungs, int heart, int stomach, int eyes, int legs, int arms, boolean hair, int fingers, boolean skin, boolean muscles) {
        this.name = name;
        this.lastName = lastName;
        this.lungs = lungs;
        this.heart = heart;
        this.stomach = stomach;
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
        this.hair = hair;
        this.fingers = fingers;
        this.skin = skin;
        this.muscles = muscles;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lungs=" + lungs +
                ", heart=" + heart +
                ", stomach=" + stomach +
                ", eyes=" + eyes +
                ", legs=" + legs +
                ", arms=" + arms +
                ", hair=" + hair +
                ", fingers=" + fingers +
                ", skin=" + skin +
                ", muscles=" + muscles +
                '}';
    }
}
