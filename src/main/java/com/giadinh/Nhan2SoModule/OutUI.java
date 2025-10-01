package com.giadinh.Nhan2SoModule;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class OutUI extends JPanel implements OutputInterface{
    private final JLabel lblResult = new JLabel("Kết quả: —");


    public OutUI() {

        setLayout(new BorderLayout(8, 8));
        lblResult.setFont(lblResult.getFont().deriveFont(Font.BOLD, 16f));
        add(lblResult, BorderLayout.NORTH);
    }
    public void setResult(String result) {
        lblResult.setText("Kết quả: " + result);
    }



    @Override
    public void show(String s) {
         setResult(s);

    }
}
