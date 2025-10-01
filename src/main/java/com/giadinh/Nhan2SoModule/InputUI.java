package com.giadinh.Nhan2SoModule;

import com.giadinh.Nhan2SoModule.DTO.InputDTO;

import javax.swing.*;
import java.awt.*;

public class InputUI extends JPanel implements InputInterface {
    private final JTextField txtA = new JTextField(20);
    private final JTextField txtB = new JTextField(20);

    public InputUI() {
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(6,6,6,6);
        g.anchor = GridBagConstraints.WEST;

        // Nhập số A
        g.gridx = 0; g.gridy = 0;
        add(new JLabel("Số A:"), g);
        g.gridx = 1;
        add(txtA, g);

        // Nhập số B
        g.gridx = 0; g.gridy = 1;
        add(new JLabel("Số B:"), g);
        g.gridx = 1;
        add(txtB, g);
    }

    // Xóa input
    public void clear() {
        txtA.setText("");
        txtB.setText("");
    }

    @Override
    public InputDTO getNumber() {
        try {
            int a = Integer.parseInt(txtA.getText().trim());
            int b = Integer.parseInt(txtB.getText().trim());
            return new InputDTO(a, b);
        } catch (NumberFormatException e) {
            // Nếu nhập sai thì coi như 0
            return new InputDTO(0, 0);
        }
    }
}
