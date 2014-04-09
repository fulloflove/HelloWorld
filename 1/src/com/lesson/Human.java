package com.lesson;

public class Human {

    private final int minAge = 0;

    private final int maxAge = 0;

    private final int minNameLenght = 3;

    private String name;

    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        if (newName != null && newName.length() >= minNameLenght) {
        name = newName;
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge > minAge && newAge < maxAge) {
        age = newAge;
        } else {
            System.out.println("error!!");
        }
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
