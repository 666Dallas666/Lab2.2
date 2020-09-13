package com.company;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя и возраст собаки: ");
        ПитомникСобак tester = new ПитомникСобак();
        System.out.println(tester.addDog());
        do {
            System.out.println("Выберите действие: \n 1. Добавить собаку в массив \n 2. Получить данные о собаке по номеру в массиве \n 3. Завершить работу программы");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            String swtch = reader2.readLine();
            int sw = Integer.parseInt(swtch);
            switch (sw) {
                case(1):
                    System.out.println("Введите имя и возраст собаки: ");
                    System.out.println(tester.addDog());
                    break;
                case(2):
                    System.out.println("Введите номер элемента массива(от 1 до 10): ");
                    String swtc = reader2.readLine();
                    int swt = Integer.parseInt(swtc);
                    swt--;
                    if(swt <= tester.counter) {
                        System.out.println(tester.массивсобак[swt].Tostring());
                        System.out.println(tester.массивсобак[swt].ToHumanAge());
                    }
                    else System.out.println("Элемент не найден");
                    break;
                case(3):
                    return;
                default:
                    System.out.println("Серьезно? Введите число от 1  до 3");
                    break;
            }
        }
            while (true);
    }
}