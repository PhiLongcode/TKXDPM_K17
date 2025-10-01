package com.giadinh.Nhan2SoModule;

import java.io.PrintWriter;

public class OutputWrapperImpl implements OutputInterface {
    PrintWriter out;
    public OutputWrapperImpl(PrintWriter output) {
        this.out = output;
    }
    @Override
    public void show(String s) {
        out.println(s);
        out.flush();
    }
}
