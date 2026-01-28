package org.example;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }

    public int add(String a,String b){
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA+numB;
    }

    public double min(double a,double b){
        return a-b;
    }

    public double min(String a,String b){
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA+numB;
    }

    public double mul(double a,double b){
        return a*b;
    }

    public double div(double a,double b){
        return a/b;
    }
}
