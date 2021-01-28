package dev.marcelo.java;

public class Snippy {
    private int age;

    public Snippy(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Snippy{" +
                "age=" + age +
                '}';
    }
}
