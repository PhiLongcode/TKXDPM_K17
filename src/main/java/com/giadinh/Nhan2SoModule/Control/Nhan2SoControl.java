package com.giadinh.Nhan2SoModule.Control;

import com.giadinh.Nhan2SoModule.Entity.Nhan2So;
import com.giadinh.Nhan2SoModule.InputInterface;
import com.giadinh.Nhan2SoModule.OutputInterface;

public class Nhan2SoControl {
    private  InputInterface input;
    private  OutputInterface output;
    private Nhan2So nhan2so;

    public Nhan2SoControl(InputInterface input, OutputInterface output, Nhan2So nhan2so) {
        this.input = input;
        this.output = output;
        this.nhan2so = nhan2so;
    }

    public void execute(){
        output.output("Number 1:");
        int num1 = input.getNumber();
        output.output("Number 2:");
        int num2 = input.getNumber();
        int result = nhan2so.nhan2So(num1, num2);
        output.output("Ket qua:" + String.valueOf(result));
    }


}
