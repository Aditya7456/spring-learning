package org.aditya;

public class Alien {
    private int age;
    Laptop laptop;
    public Alien(){
        System.out.println("alien called");
    }
    public Alien(int age, Laptop laptop){
        this.age = age;
        this.laptop = laptop;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        System.out.println("Coding");
        laptop.compile();
    }
}
