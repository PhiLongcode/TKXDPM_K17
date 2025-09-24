package com.giadinh.Nhan2SoModule.Entity;

import com.giadinh.Nhan2SoModule.InputInterface;
import com.giadinh.Nhan2SoModule.OutputInterface;

public class Nhan2So {
   /* private final InputInterface input;
    private final OutputInterface output;
    public Nhan2So(InputInterface input, OutputInterface output) {
        this.input = input;
        this.output = output;
    }*/

    /*public void nhan2so() {
        output.output("Number 1:");
        int num1 = input.input();
        output.output("Number 2:");
        int num2 = input.input();
        int result = num1 * num2;
        output.output("Ket qua:" + String.valueOf(result));
    }*/

    private int num1;
    private int num2;

    public Nhan2So(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Nhan2So() {}

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int nhan2So(){
        return num1 + num2;
    }
    public int nhan2So(int num1, int num2){
        return num1 + num2;
    }
}
