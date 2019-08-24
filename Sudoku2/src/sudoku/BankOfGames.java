/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Rafał
 */
public class BankOfGames {
    
    public ArrayList<Game> games = new ArrayList<>();
    
    
    public BankOfGames(){
        games.add(new Game());
        games.add(new Game());
    }

    public ArrayList<Game> getGames() {
        return games;
    }
    
    
}
