package com.company;

import java.util.Scanner;

public class RPNCalcProgram {
    Scanner scanner;
    RPNCalc rpnCalc;

    public RPNCalcProgram() {
        this.scanner = new Scanner(System.in);
        this.rpnCalc = new RPNCalc();
        System.out.println("Operations are: +, -, /, *, p, ~, |");
        System.out.println("Type in the first number:");
        this.run();
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void run() {
            double firstNumber = this.scanner.nextDouble();
            System.out.println(firstNumber);
            this.rpnCalc.push(firstNumber);
            System.out.println(rpnCalc.getNumbers());
            System.out.println("Type in second number:");
            double secondNumber = this.scanner.nextDouble();
            this.rpnCalc.push(secondNumber);
            System.out.println("Type in your operation:");
            char operation = this.scanner.next().charAt(0);
            this.rpnCalc.performOperation(operation);
            System.out.println(this.rpnCalc.pop());
    }
}
