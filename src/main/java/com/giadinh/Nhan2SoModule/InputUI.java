package com.giadinh.Nhan2SoModule;

import javax.swing.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InputUI extends JPanel implements InputInterface{
    private final JTextField txtA = new JTextField(12);
    private final JTextField txtB = new JTextField(12);
    private final JButton btnMultiply = new JButton("Nhân");
    private final JButton btnClear = new JButton("Xóa");

    public InputUI() {
        setLayout(new GridBagLayout());
        setBorder(new CompoundBorder(new EmptyBorder(12,12,12,12),
                new TitledBorder("Input — Nhập 2 số")));

        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(6,6,6,6);
        g.anchor = GridBagConstraints.WEST;

        g.gridx = 0; g.gridy = 0;
        add(new JLabel("Số A:"), g);
        g.gridx = 1;
        add(txtA, g);

        g.gridx = 0; g.gridy = 1;
        add(new JLabel("Số B:"), g);
        g.gridx = 1;
        add(txtB, g);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        btnPanel.add(btnMultiply);
        btnPanel.add(btnClear);

        g.gridx = 0; g.gridy = 2; g.gridwidth = 2;
        add(btnPanel, g);
    }



    // Xóa input
    public void clear() {
        txtA.setText("");
        txtB.setText("");
    }

    // Đăng ký action cho nút
    public void onMultiply(ActionListener listener) {
        btnMultiply.addActionListener(listener);
    }

    public void onClear(ActionListener listener) {
        btnClear.addActionListener(listener);
    }

    @Override
    public int getNumber() {
        try {
            return Integer.parseInt(txtA.getText().trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

