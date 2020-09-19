package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Piece extends GameBorder {

    public int sign = 1;
    public char symbol;
    public int position;
    public HashSet<Integer> bookedPositions = new HashSet<Integer>();

    public void placePiece(GameBorder border, int pos, String playerNumber) {

        if (bookedPositions.contains(pos)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tIt's already taken, try again !");
            sign = -1;
            return;
        }

        position = pos;
        bookedPositions.add(pos);
        sign = 1;

        symbol = (playerNumber.equals("one") ? 'X' : 'O');

        switch (pos) {
            case 1:
                border.borderShape[0][0] = symbol;
                break;
            case 2:
                border.borderShape[0][2] = symbol;
                break;
            case 3:
                border.borderShape[0][4] = symbol;
                break;
            case 4:
                border.borderShape[2][0] = symbol;
                break;
            case 5:
                border.borderShape[2][2] = symbol;
                break;
            case 6:
                border.borderShape[2][4] = symbol;
                break;
            case 7:
                border.borderShape[4][0] = symbol;
                break;
            case 8:
                border.borderShape[4][2] = symbol;
                break;
            case 9:
                border.borderShape[4][4] = symbol;
                break;
            default:
                break;
        }
    }
}
