package ru.javalessons;

import java.util.Scanner;

class MyCalculator {
    public static void main(String[] args) {
        Integer x, y, res;
        String op;
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        op = in.next();
        y = in.nextInt();

        switch(op) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "*":
                res = x * y;
                break;
            case "/":
                res = x / y;
                break;
            default:
                System.out.println("Input correct operation");
                return;
        }
        System.out.printf("%d %s %d = %d", x, op, y, res);
    }
}
