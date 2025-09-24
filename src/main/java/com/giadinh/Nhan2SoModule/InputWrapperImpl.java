package com.giadinh.Nhan2SoModule;

import java.util.Scanner;

public class InputWrapperImpl implements InputInterface {
    Scanner sc;

    public InputWrapperImpl(Scanner input) {
        this.sc = input;
    }
    @Override
    public int input() {
        return sc.nextInt();
    }
}
