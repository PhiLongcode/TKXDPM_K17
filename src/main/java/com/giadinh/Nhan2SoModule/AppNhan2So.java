package com.giadinh.Nhan2SoModule;

import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppNhan2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        InputInterface inputI = new InputWrapperImpl(sc);
        OutputInterface outI = new OutputWrapperImpl(out);


        Nhan2So nhan2So = new Nhan2So(inputI, outI);
        nhan2So.nhan2so();


    }
}