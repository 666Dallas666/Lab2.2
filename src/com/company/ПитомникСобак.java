package com.company;
import java.io.*;
public class ПитомникСобак {
    public Dog[] массивсобак = new Dog[10];
    int counter = 0;
    public String addDog() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age = reader.readLine();
        int age1 = Integer.parseInt(age);
        if(counter <= 9) {
            массивсобак[counter] = new Dog(name, age1);
            counter++;
            return "Объект добавлен";
        }
        else return "Массив заполнен";
    }
}