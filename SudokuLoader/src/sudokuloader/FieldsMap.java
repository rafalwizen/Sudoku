/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuloader;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Rafał
 */
public class FieldsMap {

    public Field[][] fields;
    Dialog dialog = new Dialog();
    JButton save;
    private String gameCode;

    public FieldsMap() {
        gameCode = "";
        fields = new Field[9][9];
        createFields();
        addMouseListeners();
        save = new JButton("Save");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        });
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

    public void saveFile(){
        int tempX, tempY, tempValue;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(fields[i][j].getValue()!=0){
                    tempX = i;
                    tempY = j;
                    tempValue = fields[i][j].getValue();
                    gameCode = gameCode + tempX + tempY + tempValue + " ";
                }
            }
        }
        writeToTxt();
    }
    
    public void writeToTxt(){
        PrintWriter file = null;
        try {
            file = new PrintWriter("game_code_sudoku.txt");
            file.println(gameCode);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FieldsMap.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("wysypalo");
        } finally {
            file.close();
            gameCode = "";
        }
    }

}
