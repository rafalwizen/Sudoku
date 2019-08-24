/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuloader;

import javax.swing.*;

/**
 *
 * @author Rafał
 */
public class Field {
    
    private int value;
    private JLabel square;

    public Field () {
        value = 0;
        square = new JLabel();
        square.setIcon(new ImageIcon(getClass().getResource("/GUI/photos/0.jpg")));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSquare(int x) {
        this.square.setIcon(new ImageIcon(getClass().getResource("/GUI/photos/"+x+".jpg")));
    }

    public JLabel getSquare() {
        return square;
    }
}
