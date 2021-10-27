package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Model m1=new Model();
        Controller c=new Controller();
        View v=new View();
        m1.x=100;
        m1.y=2;

        double result=c.div(m1.x,m1.y);
        v.displeyDouble(result);
    }
}
