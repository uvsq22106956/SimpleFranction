package com.company;

public class Fraction {
    public int num;
    public int denum;

    public Fraction(int num, int denum){
        this.num = num;
        this.denum = denum;
    }

    @Override
    public String toString() {
        return "Fraction : "+ num + "/" + denum;
    }
}
