package com.giadinh.Nhan2SoModule;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class OutUI extends JPanel {
    private final JLabel lblResult = new JLabel("Kết quả: —");


    public OutUI() {

        setLayout(new BorderLayout(8,8));
        setBorder(new CompoundBorder(new EmptyBorder(12,12,12,12),
                new TitledBorder("Output — Kết quả & Lịch sử")));

        lblResult.setFont(lblResult.getFont().deriveFont(Font.BOLD, 16f));
        add(lblResult, BorderLayout.NORTH);


    }

    public void setResult(String result) {
        lblResult.setText("Kết quả: " + result);
    }


    public void clearResult() {
        lblResult.setText("Kết quả: —");
    }
}
