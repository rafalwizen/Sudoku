/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import javax.swing.*;

/**
 *
 * @author Rafał
 */
public class Dialog extends JDialog {

    private JLabel[] labels;
    GroupLayout layout;
    private Field now_clicked;
    private WinLogic win;

    public Dialog() {
        initComponents();
    }

    public void initComponents() {
        labels = new JLabel[10];
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(172, 240));
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - 172) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - 240) / 2);
        createFields();
        layout = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);
        addFields();
        addMouseListeners();
        win = new WinLogic();
    }

    public void createFields() {
        for (int i = 0; i < 10; i++) {
            labels[i] = new JLabel();
            labels[i].setIcon(new ImageIcon(getClass().getResource("/GUI/photos/" + i + ".jpg")));

        }
    }

    public void addFields() {
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labels[1])
                                        .addComponent(labels[4])
                                        .addComponent(labels[7])
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labels[2])
                                        .addComponent(labels[5])
                                        .addComponent(labels[8])
                                        .addComponent(labels[0])
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labels[3])
                                        .addComponent(labels[6])
                                        .addComponent(labels[9])
                        )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labels[1])
                                        .addComponent(labels[2])
                                        .addComponent(labels[3])
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labels[4])
                                        .addComponent(labels[5])
                                        .addComponent(labels[6])
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(labels[7])
                                        .addComponent(labels[8])
                                        .addComponent(labels[9])
                        )
                        .addComponent(labels[0])
        );

    }

    public void choise(Field field, Field[][] fields) {
        now_clicked = field;
        win.copyFieldsMap(fields);
        if (now_clicked.isChangeable() == true) {
            this.setVisible(true);
        }
    }

    public void addMouseListeners() {
        for (int i = 0; i < 10; i++) {
            int a = i;
            labels[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    now_clicked.setSquare(a);
                    now_clicked.setValue(a);
                    win.winCheck();
                    System.out.println("value: " + now_clicked.getValue());
                    dispose();
                }
            });

        }
    }
}
