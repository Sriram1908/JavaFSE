package DesignPatternsandPrinciples.Exercise1.SingletonPatternExample;

import DesignPatternsandPrinciples.Exercise1.SingletonPatternExample.Logger;



public class TestClass {

    static void main() {

        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());

        //if each has same hash code then the diff variables points to teh same object
        }
}


// output

//149928006
//149928006