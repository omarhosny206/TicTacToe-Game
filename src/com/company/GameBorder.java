package com.company;
import java.util.Scanner;

public class GameBorder {

    public char[][] borderShape = {
            {' ', '|', ' ', '|', ' '},
            {'-', '-', '-', '-', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '-', '-', '-', '-'},
            {' ', '|', ' ', '|', ' '}
    };

    public void drawBorder() {
        for (char[] row : borderShape) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
