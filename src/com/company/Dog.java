package com.company;
public class Dog {
    String кличка;
    int возраст;
    Dog(String name, int age){
        кличка = name;
        возраст = age;
    }
    public void setName(String name){
        name = кличка;
    }
    public void setAge(int age){
        age = возраст;
    }
    public String ToHumanAge(){
        int HAge = возраст*7;
        return "Возраст в человеческих годах: " + HAge;
    }
    public String Tostring(){
        String string = "Кличка: " + кличка + ", " + "возраст: " + возраст;
        return string;
    }
}