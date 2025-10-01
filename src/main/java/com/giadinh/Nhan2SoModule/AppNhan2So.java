package com.giadinh.Nhan2SoModule;

import com.giadinh.Nhan2SoModule.Control.Nhan2SoControl;
import com.giadinh.Nhan2SoModule.Entity.Nhan2So;

import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppNhan2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        //InputInterface inputI = new InputWrapperImpl(sc);
        OutputInterface outI = new OutputWrapperImpl(out);
        MultiplyUI ui = new MultiplyUI();
        ui.setVisible(true);


        Nhan2So nhan2So = new Nhan2So();

        //Nhan2SoControl nhan2SoControl = new Nhan2SoControl(inputI, outI, nhan2So);
        Nhan2SoControl nhan2SoControl = new Nhan2SoControl(ui.getInputUI(), ui.getOutput(),  nhan2So);
        ui.getBtnMultiply().addActionListener(e -> nhan2SoControl.execute());
        ui.getBtnClear().addActionListener(e -> ui.getInputUI().clear());



    }
}