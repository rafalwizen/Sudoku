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
public class Sudoku extends JFrame {

    private JFrame thisFrame = this;

    public FieldsMap fieldsmap;
    JPanel panel = new JPanel();// chyba nieuzywane
    GroupLayout layout;
    

    public Sudoku() {
        initComponents();
    }

    public void initComponents() {
        fieldsmap = new FieldsMap();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        int frameWidth = 600;
        int frameHeight = 500;
        setSize(new java.awt.Dimension(frameWidth, frameHeight));
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - frameWidth) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - frameHeight) / 2);

        setTitle("Sudoku");
        layout = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);

        
        
        addFields();
    }

    public void addFields() {
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][0].getSquare())
                                        .addComponent(fieldsmap.fields[0][1].getSquare())
                                        .addComponent(fieldsmap.fields[0][2].getSquare())
                                        .addComponent(fieldsmap.fields[0][3].getSquare())
                                        .addComponent(fieldsmap.fields[0][4].getSquare())
                                        .addComponent(fieldsmap.fields[0][5].getSquare())
                                        .addComponent(fieldsmap.fields[0][6].getSquare())
                                        .addComponent(fieldsmap.fields[0][7].getSquare())
                                        .addComponent(fieldsmap.fields[0][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[1][0].getSquare())
                                        .addComponent(fieldsmap.fields[1][1].getSquare())
                                        .addComponent(fieldsmap.fields[1][2].getSquare())
                                        .addComponent(fieldsmap.fields[1][3].getSquare())
                                        .addComponent(fieldsmap.fields[1][4].getSquare())
                                        .addComponent(fieldsmap.fields[1][5].getSquare())
                                        .addComponent(fieldsmap.fields[1][6].getSquare())
                                        .addComponent(fieldsmap.fields[1][7].getSquare())
                                        .addComponent(fieldsmap.fields[1][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[2][0].getSquare())
                                        .addComponent(fieldsmap.fields[2][1].getSquare())
                                        .addComponent(fieldsmap.fields[2][2].getSquare())
                                        .addComponent(fieldsmap.fields[2][3].getSquare())
                                        .addComponent(fieldsmap.fields[2][4].getSquare())
                                        .addComponent(fieldsmap.fields[2][5].getSquare())
                                        .addComponent(fieldsmap.fields[2][6].getSquare())
                                        .addComponent(fieldsmap.fields[2][7].getSquare())
                                        .addComponent(fieldsmap.fields[2][8].getSquare())
                                        .addGap(60)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[3][0].getSquare())
                                        .addComponent(fieldsmap.fields[3][1].getSquare())
                                        .addComponent(fieldsmap.fields[3][2].getSquare())
                                        .addComponent(fieldsmap.fields[3][3].getSquare())
                                        .addComponent(fieldsmap.fields[3][4].getSquare())
                                        .addComponent(fieldsmap.fields[3][5].getSquare())
                                        .addComponent(fieldsmap.fields[3][6].getSquare())
                                        .addComponent(fieldsmap.fields[3][7].getSquare())
                                        .addComponent(fieldsmap.fields[3][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[4][0].getSquare())
                                        .addComponent(fieldsmap.fields[4][1].getSquare())
                                        .addComponent(fieldsmap.fields[4][2].getSquare())
                                        .addComponent(fieldsmap.fields[4][3].getSquare())
                                        .addComponent(fieldsmap.fields[4][4].getSquare())
                                        .addComponent(fieldsmap.fields[4][5].getSquare())
                                        .addComponent(fieldsmap.fields[4][6].getSquare())
                                        .addComponent(fieldsmap.fields[4][7].getSquare())
                                        .addComponent(fieldsmap.fields[4][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[5][0].getSquare())
                                        .addComponent(fieldsmap.fields[5][1].getSquare())
                                        .addComponent(fieldsmap.fields[5][2].getSquare())
                                        .addComponent(fieldsmap.fields[5][3].getSquare())
                                        .addComponent(fieldsmap.fields[5][4].getSquare())
                                        .addComponent(fieldsmap.fields[5][5].getSquare())
                                        .addComponent(fieldsmap.fields[5][6].getSquare())
                                        .addComponent(fieldsmap.fields[5][7].getSquare())
                                        .addComponent(fieldsmap.fields[5][8].getSquare())
                                        .addGap(60)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[6][0].getSquare())
                                        .addComponent(fieldsmap.fields[6][1].getSquare())
                                        .addComponent(fieldsmap.fields[6][2].getSquare())
                                        .addComponent(fieldsmap.fields[6][3].getSquare())
                                        .addComponent(fieldsmap.fields[6][4].getSquare())
                                        .addComponent(fieldsmap.fields[6][5].getSquare())
                                        .addComponent(fieldsmap.fields[6][6].getSquare())
                                        .addComponent(fieldsmap.fields[6][7].getSquare())
                                        .addComponent(fieldsmap.fields[6][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[7][0].getSquare())
                                        .addComponent(fieldsmap.fields[7][1].getSquare())
                                        .addComponent(fieldsmap.fields[7][2].getSquare())
                                        .addComponent(fieldsmap.fields[7][3].getSquare())
                                        .addComponent(fieldsmap.fields[7][4].getSquare())
                                        .addComponent(fieldsmap.fields[7][5].getSquare())
                                        .addComponent(fieldsmap.fields[7][6].getSquare())
                                        .addComponent(fieldsmap.fields[7][7].getSquare())
                                        .addComponent(fieldsmap.fields[7][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[8][0].getSquare())
                                        .addComponent(fieldsmap.fields[8][1].getSquare())
                                        .addComponent(fieldsmap.fields[8][2].getSquare())
                                        .addComponent(fieldsmap.fields[8][3].getSquare())
                                        .addComponent(fieldsmap.fields[8][4].getSquare())
                                        .addComponent(fieldsmap.fields[8][5].getSquare())
                                        .addComponent(fieldsmap.fields[8][6].getSquare())
                                        .addComponent(fieldsmap.fields[8][7].getSquare())
                                        .addComponent(fieldsmap.fields[8][8].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.restart)
                                        .addComponent(fieldsmap.nextGame)
                        )
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][0].getSquare())
                                        .addComponent(fieldsmap.fields[1][0].getSquare())
                                        .addComponent(fieldsmap.fields[2][0].getSquare())
                                        .addComponent(fieldsmap.fields[3][0].getSquare())
                                        .addComponent(fieldsmap.fields[4][0].getSquare())
                                        .addComponent(fieldsmap.fields[5][0].getSquare())
                                        .addComponent(fieldsmap.fields[6][0].getSquare())
                                        .addComponent(fieldsmap.fields[7][0].getSquare())
                                        .addComponent(fieldsmap.fields[8][0].getSquare())
                                        .addComponent(fieldsmap.restart)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][1].getSquare())
                                        .addComponent(fieldsmap.fields[1][1].getSquare())
                                        .addComponent(fieldsmap.fields[2][1].getSquare())
                                        .addComponent(fieldsmap.fields[3][1].getSquare())
                                        .addComponent(fieldsmap.fields[4][1].getSquare())
                                        .addComponent(fieldsmap.fields[5][1].getSquare())
                                        .addComponent(fieldsmap.fields[6][1].getSquare())
                                        .addComponent(fieldsmap.fields[7][1].getSquare())
                                        .addComponent(fieldsmap.fields[8][1].getSquare())
                                        .addComponent(fieldsmap.nextGame)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][2].getSquare())
                                        .addComponent(fieldsmap.fields[1][2].getSquare())
                                        .addComponent(fieldsmap.fields[2][2].getSquare())
                                        .addComponent(fieldsmap.fields[3][2].getSquare())
                                        .addComponent(fieldsmap.fields[4][2].getSquare())
                                        .addComponent(fieldsmap.fields[5][2].getSquare())
                                        .addComponent(fieldsmap.fields[6][2].getSquare())
                                        .addComponent(fieldsmap.fields[7][2].getSquare())
                                        .addComponent(fieldsmap.fields[8][2].getSquare())
                                        .addGap(60)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][3].getSquare())
                                        .addComponent(fieldsmap.fields[1][3].getSquare())
                                        .addComponent(fieldsmap.fields[2][3].getSquare())
                                        .addComponent(fieldsmap.fields[3][3].getSquare())
                                        .addComponent(fieldsmap.fields[4][3].getSquare())
                                        .addComponent(fieldsmap.fields[5][3].getSquare())
                                        .addComponent(fieldsmap.fields[6][3].getSquare())
                                        .addComponent(fieldsmap.fields[7][3].getSquare())
                                        .addComponent(fieldsmap.fields[8][3].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][4].getSquare())
                                        .addComponent(fieldsmap.fields[1][4].getSquare())
                                        .addComponent(fieldsmap.fields[2][4].getSquare())
                                        .addComponent(fieldsmap.fields[3][4].getSquare())
                                        .addComponent(fieldsmap.fields[4][4].getSquare())
                                        .addComponent(fieldsmap.fields[5][4].getSquare())
                                        .addComponent(fieldsmap.fields[6][4].getSquare())
                                        .addComponent(fieldsmap.fields[7][4].getSquare())
                                        .addComponent(fieldsmap.fields[8][4].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][5].getSquare())
                                        .addComponent(fieldsmap.fields[1][5].getSquare())
                                        .addComponent(fieldsmap.fields[2][5].getSquare())
                                        .addComponent(fieldsmap.fields[3][5].getSquare())
                                        .addComponent(fieldsmap.fields[4][5].getSquare())
                                        .addComponent(fieldsmap.fields[5][5].getSquare())
                                        .addComponent(fieldsmap.fields[6][5].getSquare())
                                        .addComponent(fieldsmap.fields[7][5].getSquare())
                                        .addComponent(fieldsmap.fields[8][5].getSquare())
                                        .addGap(60)
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][6].getSquare())
                                        .addComponent(fieldsmap.fields[1][6].getSquare())
                                        .addComponent(fieldsmap.fields[2][6].getSquare())
                                        .addComponent(fieldsmap.fields[3][6].getSquare())
                                        .addComponent(fieldsmap.fields[4][6].getSquare())
                                        .addComponent(fieldsmap.fields[5][6].getSquare())
                                        .addComponent(fieldsmap.fields[6][6].getSquare())
                                        .addComponent(fieldsmap.fields[7][6].getSquare())
                                        .addComponent(fieldsmap.fields[8][6].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][7].getSquare())
                                        .addComponent(fieldsmap.fields[1][7].getSquare())
                                        .addComponent(fieldsmap.fields[2][7].getSquare())
                                        .addComponent(fieldsmap.fields[3][7].getSquare())
                                        .addComponent(fieldsmap.fields[4][7].getSquare())
                                        .addComponent(fieldsmap.fields[5][7].getSquare())
                                        .addComponent(fieldsmap.fields[6][7].getSquare())
                                        .addComponent(fieldsmap.fields[7][7].getSquare())
                                        .addComponent(fieldsmap.fields[8][7].getSquare())
                        )
                        .addGroup(
                                layout.createParallelGroup()
                                        .addComponent(fieldsmap.fields[0][8].getSquare())
                                        .addComponent(fieldsmap.fields[1][8].getSquare())
                                        .addComponent(fieldsmap.fields[2][8].getSquare())
                                        .addComponent(fieldsmap.fields[3][8].getSquare())
                                        .addComponent(fieldsmap.fields[4][8].getSquare())
                                        .addComponent(fieldsmap.fields[5][8].getSquare())
                                        .addComponent(fieldsmap.fields[6][8].getSquare())
                                        .addComponent(fieldsmap.fields[7][8].getSquare())
                                        .addComponent(fieldsmap.fields[8][8].getSquare())
                        )
        );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }
}
