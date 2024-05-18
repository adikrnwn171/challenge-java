package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan angka a: ");
    int a = scanner.nextInt();

    System.out.print("Masukkan angka b: ");
    int b = scanner.nextInt();

    System.out.print("Masukkan operasi (+, -, *, /: ");
    Character operator = scanner.next().charAt(0);

    int result = 0;

    if (operator == '+') {
        result = CalculatorJava.add(a,b);
    } else if (operator == '-') {
        result = CalculatorJava.min(a,b);
    } else if (operator == '*') {
        result = CalculatorJava.multiply(a,b);
    } else if (operator == '/') {
        result = CalculatorJava.divided(a,b);
    }

    System.out.println("Hasil: "+result);
    }
}
