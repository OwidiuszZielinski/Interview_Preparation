package org.example.inheritance;

public class Hero extends Person {

    String behaviour = "Strong";

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    String power;

    public Hero(String name, int age, String power, String city){
        super(name,age,city);
        this.power = power;
    }

    public Hero getInstance(){
        return this;
    }

    //Metody są przysłaniane wyswiatana jest metoda o tej samej nazwie z klasy rodzica
    public String toString() {

        return super.toString() + behaviour;
    }
}
