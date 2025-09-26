package com.telusko;

public class Alien {
    private int age;
    private laptop l2;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Alien(){
        System.out.println("Object of alien created");
    }
    public Alien(int age , laptop l){
        this.age = age;
        this.l2 = l;
    }
    public void Code(){
        System.out.println("Coding");
        l2.compile();
    }

    public laptop getL2() {
        return l2;
    }

    public void setL2(laptop l2) {
        this.l2 = l2;
    }
}
