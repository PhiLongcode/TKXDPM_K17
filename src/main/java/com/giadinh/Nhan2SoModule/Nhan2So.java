package com.giadinh.Nhan2SoModule;

public class Nhan2So {
    private final InputInterface input;
    private final OutputInterface output;
    public Nhan2So(InputInterface input, OutputInterface output) {
        this.input = input;
        this.output = output;
    }

    public void nhan2so() {
        output.output("Number 1:");
        int num1 = input.input();
        output.output("Number 2:");
        int num2 = input.input();
        int result = num1 * num2;
        output.output("Ket qua:" + String.valueOf(result));
    }

}
