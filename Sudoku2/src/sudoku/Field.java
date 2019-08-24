/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.*;

/**
 *
 * @author Rafał
 */
public class Field {
    
    private int value;
    private JLabel square;
    private boolean changeable;

    
    
    public Field () {
        value = 0;
        changeable = true;
        square = new JLabel();
        square.setIcon(new ImageIcon(getClass().getResource("/GUI/photos/0.jpg")));
    }
    
    public void setSolidField(int x) {
        this.value = x;
        this.changeable = false;
        this.square.setIcon(new ImageIcon(getClass().getResource("/GUI/photos/"+x+"solid.jpg")));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (this.changeable == true)
        this.value = value;
    }

    public void setSquare(int x) {
        if(this.changeable == true)
        this.square.setIcon(new ImageIcon(getClass().getResource("/GUI/photos/"+x+".jpg")));
    }

    public JLabel getSquare() {
        return square;
    }

    public boolean isChangeable() {
        return changeable;
    }
   
    public void setChangeable(boolean changeable) {
        this.changeable = changeable;
    }
}
