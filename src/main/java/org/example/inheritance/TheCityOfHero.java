package org.example.inheritance;

public abstract class TheCityOfHero {
    protected String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TheCityOfHero(String city) {
        this.city = city;
    }

    public TheCityOfHero() {
    }

    public String toString() {
        return this.city;
    }
    protected void printCity(){
        System.out.println("FIRST CLASS " + city);
    }


}
