package com.myproject.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleOne {
    public static void main(String[ ] args) {

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите имя :");
            String s = reader.readLine();
            System.out.println("Привет " + s);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода");
        }
    }
}