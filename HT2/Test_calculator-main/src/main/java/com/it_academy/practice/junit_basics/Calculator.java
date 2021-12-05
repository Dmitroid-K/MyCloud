package com.it_academy.practice.junit_basics;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float calculate(char operation) {
        switch(operation) {
            default: {
                return 0;
            }
            case '-': {
                return a - b;
            }
            case '+': {
                return a + b;
            }
            case '/': {
                return a / b;
            }
            case '*': {
                return a * b;
            }
        }
    }
    public float calculateAdvanced(char operation) {
        switch(operation) {
            default: {
                return 0;
            }
            case '^': {
                return (float) Math.pow(a,b);
            }
            case 'r': {
                if (b==0) return 1;
                return (float) Math.pow(a,(float)1/b);
            }
        }
    }
    public static float calculateMultipleArguments(String... values){
        float result;

        if (values.length == 0) return 0;
        if (values.length==1) return Float.parseFloat(values[0]);

        result=new Calculator(Integer.parseInt(values[0]),Integer.parseInt(values[2])).calculate(values[1].charAt(0));
        for (int i = 3; i < values.length; i+=2){
            result=new Calculator(Math.round(result),Integer.parseInt(values[i+1])).calculate(values[i].charAt(0));

        }
        return result;

    }

}
