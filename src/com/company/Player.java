package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Piece {

    public ArrayList<Integer> player1_positions = new ArrayList<Integer>();
    public ArrayList<Integer> player2_positions = new ArrayList<Integer>();

    private String number = "";
    public int sign = 1;

    public String Number() {
        number = (sign > 0 ? "one" : "two");
        System.out.format("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlayer %s --> Enter the placement (1-9): ", number);
        return number;
    }

    public int Position() {
        Scanner scan = new Scanner(System.in);
        int playerPosition = scan.nextInt();
        return playerPosition;
    }

    public void checkPlacement(int placement) {
        if (placement > 0)
            sign *= -1;
        else
            return;
    }

    public void addPiecesPosition(Piece piece) {
        if (piece.symbol == 'X')
            player1_positions.add(piece.position);
        else
            player2_positions.add(piece.position);
    }
}
