/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Rafał
 */
public class Game {
    
    private static int counter = 0;
    private int help;
    private int[] x;
    private int[] y;
    private int[] value;
    
    private String gameCode1 = "005 103 407 016 311 419 515 129 228 726 038 436 833 044 348 543 841 057 452 856 166 662 768 374 471 579 875 488 787 889 ";
    private String gameCode2 = "032 044 069 101 115 143 166 214 268 302 351 364 378 383 403 434 459 485 504 516 527 533 589 628 677 729 745 772 786 824 846 853 ";
    //private String name2 = "401 502 603 704 165 176 187 203 214 227 336 342 353 402 416 421 468 473 489 531 549 558 669 671 682 709 718 725 812 823 834 847";
                               
    private String[] temporary = {gameCode1, gameCode2};
    
    public Game() {
        int gameCodeLength = temporary[counter].length()/4;
        this.help = gameCodeLength;
        this.x = new int[gameCodeLength];
        this.y = new int[gameCodeLength];
        this.value = new int[gameCodeLength];
        fillGameWithDate();
        counter++;
    }

    public void fillGameWithDate(){
        for(int i = 0; i < help; i++){
            this.x[i] = Character.getNumericValue(temporary[counter].charAt(4*i));
            this.y[i] = Character.getNumericValue(temporary[counter].charAt(4*i+1));
            this.value[i] = Character.getNumericValue(temporary[counter].charAt(4*i+2));
        }
    }

    public int[] getX() {
        return x;
    }

    public int[] getY() {
        return y;
    }

    public int[] getValue() {
        return value;
    }

    public int getHelp() {
        return help;
    }
    
    
}
