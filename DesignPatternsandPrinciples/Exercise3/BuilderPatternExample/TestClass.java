package DesignPatternsandPrinciples.Exercise3.BuilderPatternExample;


public class TestClass {

    static void main() {

        Computer cb = new Computer.Builder()
                            .setCPU("i5")
                            .setRAM(8)
                            .setStorage(256).build();
        cb.details();


        Computer cb1 = new Computer.Builder()
                .setCPU("i7 multi core")
                .setRAM(24)
                .setStorage(512)
                .build();
        cb1.details();


    }
}

//output

//CPU :i5
//RAM :8
//Storage256
//CPU :i7 multi core
//RAM :24
//Storage512