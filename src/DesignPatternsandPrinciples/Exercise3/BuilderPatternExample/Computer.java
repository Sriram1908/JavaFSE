package DesignPatternsandPrinciples.Exercise3.BuilderPatternExample;


public class Computer {

    private String CPU;
    private int RAM;
    private int Storage;

    private Computer(Builder b)
    {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Storage = b.Storage;
    }
    static class Builder{
        private String CPU;
        private int RAM;
        private int Storage;

        public Builder setCPU(String cpu)
        {
            this.CPU = cpu;
            return this;
        }
        public Builder setRAM(int ram)
        {
            this.RAM = ram;
            return this;
        }
        public Builder setStorage(int storage)
        {
           this.Storage = storage;
           return this;
        }

        public Computer build(){

            return new Computer(this);
        }

    }
    public void details(){
        System.out.println("CPU :" + CPU);
        System.out.println("RAM :" + RAM);
        System.out.println("Storage" + Storage);
    }
}
