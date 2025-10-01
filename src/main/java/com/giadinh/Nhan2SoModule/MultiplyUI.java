package com.giadinh.Nhan2SoModule;

import javax.swing.*;
import java.awt.*;

public class MultiplyUI extends JFrame {
    private final InputUI inputUI;
    private final OutUI output;
    private final JButton btnMultiply;
    private final JButton btnClear;

    public MultiplyUI() {
        super("Nhân 2 số");

        inputUI = new InputUI();   // chỉ cần 1 input panel thôi
        output = new OutUI();

        btnMultiply = new JButton("Nhân");
        btnClear = new JButton("Xóa");

        // Layout chính
        setLayout(new BorderLayout(80, 80));

        add(inputUI, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 8));
        controlPanel.add(btnMultiply);
        controlPanel.add(btnClear);
        add(controlPanel, BorderLayout.SOUTH);

        add(output, BorderLayout.NORTH);

        // Cấu hình frame
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }


    public InputUI getInputUI() {
        return inputUI;
    }

    public OutUI getOutput() {
        return output;
    }

    public JButton getBtnMultiply() {
        return btnMultiply;
    }

    public JButton getBtnClear() {
        return btnClear;
    }
}
