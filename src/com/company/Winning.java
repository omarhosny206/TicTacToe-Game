package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Winning extends Player {


    private List firstRow = Arrays.asList(1, 2, 3);
    private List secondRow = Arrays.asList(4, 5, 6);
    private List thirdRow = Arrays.asList(7, 8, 9);
    private List firstColumn = Arrays.asList(1, 4, 7);
    private List secondColumn = Arrays.asList(2, 5, 8);
    private List thirdColumn = Arrays.asList(3, 6, 9);
    private List principalDiagonal = Arrays.asList(1, 5, 9);
    private List secondaryDiagonal = Arrays.asList(3, 5, 7);
    List<List> winning = new ArrayList<List>();

    public void winningPossibilities() {
        winning.add(firstRow);
        winning.add(secondRow);
        winning.add(thirdRow);
        winning.add(firstColumn);
        winning.add(secondColumn);
        winning.add(thirdColumn);
        winning.add(principalDiagonal);
        winning.add(secondaryDiagonal);
    }


    public String checkWinner(Player player) {
        for (List l : winning) {
            if (player.player1_positions.containsAll(l))
                return "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlayer one is the winner !";
            else if (player.player2_positions.containsAll(l))
                return "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPlayer two is the winner !";
            else if (player.player1_positions.size() + player.player2_positions.size() == 9)
                return "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tOps, no one won !";
        }
        return "";
    }
}
