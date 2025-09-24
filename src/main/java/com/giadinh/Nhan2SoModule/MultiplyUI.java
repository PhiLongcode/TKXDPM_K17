/*
package com.giadinh.Nhan2SoModule;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MultiplyUI extends JFrame {
    private final InputUI inputPanel = new InputUI();
    private final OutUI outputPanel = new OutUI();

    public MultiplyUI() {
        super("Máy nhân 2 số (tách lớp)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 320);
        setLocationRelativeTo(null);

        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, inputPanel, outputPanel);
        split.setResizeWeight(0.35);
        split.setOneTouchExpandable(true);
        add(split, BorderLayout.CENTER);

        // Nối sự kiện
        inputPanel.onMultiply(e -> doMultiply());
        inputPanel.onClear(e -> {
            inputPanel.clear();
            outputPanel.clearResult();
        });

        setVisible(true);
    }

    private void doMultiply() {
        String aText = inputPanel.getA();
        String bText = inputPanel.getB();

        if (aText.isEmpty() || bText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập cả Số A và Số B.", "Lỗi nhập liệu", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            BigDecimal a = new BigDecimal(aText);
            BigDecimal b = new BigDecimal(bText);
            BigDecimal result = a.multiply(b).stripTrailingZeros();
            String resStr = result.toPlainString();

            outputPanel.setResult(resStr);

            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            outputPanel.addHistory(String.format("[%s] %s × %s = %s", time, a.toPlainString(), b.toPlainString(), resStr));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Số nhập không hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MultiplyUI::new);
    }
}
*/
