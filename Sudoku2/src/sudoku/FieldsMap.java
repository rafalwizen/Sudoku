/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;

/**
 *
 * @author Rafał
 */
public class FieldsMap {

    public Field[][] fields;
    Dialog dialog = new Dialog();
    BankOfGames bank = new BankOfGames();
    JButton restart;
    JButton nextGame;
    private int gameCounter;

//    private int[] check_column;
//    private int[] check_row;
//    private int[] check_square;
    public FieldsMap() {
        gameCounter = 0;
        fields = new Field[9][9];
        createFields();
        addMouseListeners();
        nextGame();
        restart = new JButton("Restart");
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Restart();
            }
        });
        nextGame = new JButton("Next Game");
        nextGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextGame();
            }

        });

//        check_column = new int[9];
//        check_row = new int[9];
//        check_square = new int[9];
    }

    public void createFields() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                fields[i][j] = new Field();
            }
        }
    }

    public void addMouseListeners() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int a = i;
                int b = j;
                fields[i][j].getSquare().addMouseListener(new MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        System.out.println("sudoku[" + a + "][" + b + "]");
                        dialog.choise(fields[a][b], fields);
                    }
                });
            }
        }
    }

    public void createSolidFields(int numberOfGame) {
        int[] x_ = bank.getGames().get(numberOfGame).getX();
        int[] y_ = bank.getGames().get(numberOfGame).getY();
        int[] value_ = bank.getGames().get(numberOfGame).getValue();
        for (int i = 0; i < bank.getGames().get(numberOfGame).getHelp(); i++) {
            fields[x_[i]][y_[i]].setValue(value_[i]);                           //chyba wywalic , powiela sie
            fields[x_[i]][y_[i]].setSolidField(value_[i]);
        }
    }

    public void Restart() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (fields[i][j].isChangeable() == true) {
                    fields[i][j].setSquare(0);
                    fields[i][j].setValue(0);
                }
            }
        }
    }

    public void cleanSolidFields() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                fields[i][j].setChangeable(true);
                fields[i][j].setSquare(0);
                fields[i][j].setValue(0);
            }
        }
    }

    public void nextGame() {
        //System.out.println(bank.getGames().size());
        if (bank.getGames().size() <= gameCounter) {
            gameCounter = 0;
        }
        cleanSolidFields();
        createSolidFields(gameCounter);
        gameCounter++;
    }
}
