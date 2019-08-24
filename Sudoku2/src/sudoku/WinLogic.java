/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.JDialog;
import sudoku.FieldsMap;

/**
 *
 * @author Rafał
 */
public class WinLogic {

    private int[] check_column;
    private int[] check_row;
    private int[] check_square;
    private Field[][] fields;

    public WinLogic() {
        check_column = new int[9];
        check_row = new int[9];
        check_square = new int[9];
    }

    public void copyFieldsMap(Field[][] fields) {
        this.fields = fields;
    }

    public void winCheck() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                check_column[i] += fields[i][j].getValue();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                check_row[i] += fields[j][i].getValue();
            }
        }

        check_square[0] = fields[0][0].getValue() + fields[1][0].getValue() + fields[2][0].getValue()
                + fields[0][1].getValue() + fields[1][1].getValue() + fields[2][1].getValue()
                + fields[0][2].getValue() + fields[1][2].getValue() + fields[2][2].getValue();

        check_square[1] = fields[3][0].getValue() + fields[4][0].getValue() + fields[5][0].getValue()
                + fields[3][1].getValue() + fields[4][1].getValue() + fields[5][1].getValue()
                + fields[3][2].getValue() + fields[4][2].getValue() + fields[5][2].getValue();

        check_square[2] = fields[6][0].getValue() + fields[7][0].getValue() + fields[8][0].getValue()
                + fields[6][1].getValue() + fields[7][1].getValue() + fields[8][1].getValue()
                + fields[6][2].getValue() + fields[7][2].getValue() + fields[8][2].getValue();

        check_square[3] = fields[0][3].getValue() + fields[1][3].getValue() + fields[2][3].getValue()
                + fields[0][4].getValue() + fields[1][4].getValue() + fields[2][4].getValue()
                + fields[0][5].getValue() + fields[1][5].getValue() + fields[2][5].getValue();

        check_square[4] = fields[3][3].getValue() + fields[4][3].getValue() + fields[5][3].getValue()
                + fields[3][4].getValue() + fields[4][4].getValue() + fields[5][4].getValue()
                + fields[3][5].getValue() + fields[4][5].getValue() + fields[5][5].getValue();

        check_square[5] = fields[6][3].getValue() + fields[7][3].getValue() + fields[8][3].getValue()
                + fields[6][4].getValue() + fields[7][4].getValue() + fields[8][4].getValue()
                + fields[6][5].getValue() + fields[7][5].getValue() + fields[8][5].getValue();

        check_square[6] = fields[0][6].getValue() + fields[1][6].getValue() + fields[2][6].getValue()
                + fields[0][7].getValue() + fields[1][7].getValue() + fields[2][7].getValue()
                + fields[0][8].getValue() + fields[1][8].getValue() + fields[2][8].getValue();

        check_square[7] = fields[3][6].getValue() + fields[4][6].getValue() + fields[5][6].getValue()
                + fields[3][7].getValue() + fields[4][7].getValue() + fields[5][7].getValue()
                + fields[3][8].getValue() + fields[4][8].getValue() + fields[5][8].getValue();

        check_square[8] = fields[6][6].getValue() + fields[7][6].getValue() + fields[8][6].getValue()
                + fields[6][7].getValue() + fields[7][7].getValue() + fields[8][7].getValue()
                + fields[6][8].getValue() + fields[7][8].getValue() + fields[8][8].getValue();

        if (       check_column[0] == 45 && check_column[1] == 45 && check_column[2] == 45
                && check_column[3] == 45 && check_column[4] == 45 && check_column[5] == 45
                && check_column[6] == 45 && check_column[7] == 45 && check_column[8] == 45
                && check_row[0] == 45 && check_row[1] == 45 && check_row[2] == 45
                && check_row[3] == 45 && check_row[4] == 45 && check_row[5] == 45
                && check_row[6] == 45 && check_row[7] == 45 && check_row[8] == 45
                && check_square[0] == 45 && check_square[1] == 45 && check_square[2] == 45
                && check_square[3] == 45 && check_square[4] == 45 && check_square[5] == 45
                && check_square[6] == 45 && check_square[7] == 45 && check_square[8] == 45) {

            winMessage();
        }
        for (int i = 0; i < 9; i++){
            check_column[i] = 0;
            check_row[i] = 0;
            check_square[i] = 0;
        }
    }

    public void winMessage(){
        JDialog winFrame = new JDialog();
        winFrame.setVisible(true);
    }
}
