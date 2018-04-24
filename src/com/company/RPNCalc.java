package com.company;


import java.util.Stack;

public class RPNCalc {
    private Stack<Double> numbers;

    public RPNCalc() {
        this.numbers = new Stack<>();
    }

    public Stack<Double> getNumbers() {
        return numbers;
    }


    public double push(double number) {
        this.numbers.push(number);
        return number;
    }

    public double pop() {
        if (this.numbers.empty()) {
            return Double.NaN;
        }
        else {
            double topNumber = this.numbers.pop();
            return topNumber;
        }
    }

    public double peek(int index) {
        int stackSize = this.getSize() - 1;
        if (index > stackSize || index < 0) {
            return Double.NaN;
        } else {
            double number = this.numbers.elementAt(stackSize - index);
            return number;
        }
    }

    public int getSize() {
        return getNumbers().size();
    }

    public void performOperation(char character) {
        if (character == '+') {
            double firstValue = this.numbers.pop();
            double secondValue = this.numbers.pop();
            double result = firstValue + secondValue;
            this.numbers.push(result);
        } else if (character == '-') {
            double firstValue = this.numbers.pop();
            double secondValue = this.numbers.pop();
            double result = firstValue - secondValue;
            this.numbers.push(result);
        } else if (character == '*') {
            double firstValue = this.numbers.pop();
            double secondValue = this.numbers.pop();
            double result = firstValue * secondValue;
            this.numbers.push(result);
        } else if (character == '/') {
            double firstValue = this.numbers.pop();
            double secondValue = this.numbers.pop();
            double result = firstValue / secondValue;
            this.numbers.push(result);
        } else if (character == '~') {
            double firstValue = this.numbers.pop();
            double secondValue = this.numbers.pop();
            this.numbers.push(firstValue);
            this.numbers.push(secondValue);
        } else if (character == 'p') {
            double pi = 3.14;
            this.numbers.push(pi);
        } else if (character == '|') {
            double firstValue = this.numbers.pop();
            double absolute = Math.abs(firstValue);
            this.numbers.push(absolute);
        } else {
            System.out.println("Error. Du må velge en korrekt operasjon.");
        }
    }
}