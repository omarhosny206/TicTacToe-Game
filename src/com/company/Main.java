package com.company;

public class Main {


    public static void main(String[] args) {

        GameBorder border = new GameBorder();
        Player player = new Player();
        Piece piece = new Piece();
        Winning winning = new Winning();
        winning.winningPossibilities();

        String result = "";

        while (result.equals("")) {
            String number = player.Number();
            int position = player.Position();
            piece.placePiece(border, position, number);
            player.checkPlacement(piece.sign);
            player.addPiecesPosition(piece);
            border.drawBorder();
            result = winning.checkWinner(player);
        }
        System.out.println(result);
    }
}
