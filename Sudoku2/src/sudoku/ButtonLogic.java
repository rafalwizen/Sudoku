/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Rafał
 */
public class ButtonLogic extends JButton implements ActionListener{
    
    private String name;
    
    public ButtonLogic(String name) {
        super(name);
        this.name = name;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Restart".equals(name))
            restart();
        else if ("Next Game".equals(name))
            nextGame();
    }
    
    public void restart(){
        System.out.println("restart");
        
    }
    
    public void nextGame() {
        System.out.println("nextgame");
    }
    
}
