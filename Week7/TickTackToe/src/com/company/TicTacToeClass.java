package com.company;

public class TicTacToeClass {
    // Instance Variables
    private char[][] board;
    private int turns;

    // Constructors
    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    // Accessor Methods

    public boolean isWinner(char p) {
        return false;
    }

    public boolean isFull() {
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3; j++){
                if(board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isCat() {
        return false;
    }

    public boolean isValid(int r, int c) {
        if (0 <= r && r <= 2 && 0 <= c && c <= 2)
            return true;
        else
            return false;
    }

    public int numTurns() {
        return turns;
    }

    public char playerAt(int r, int c) {
        if (isValid(r, c))
            return board[r][c];
        else
            return '@';
    }

    public void displayBoard() {
        System.out.println("--+--+-+--");
        for( int i = 0; i < 3; i++){
            System.out.println("| ");
            for(int j = 0; j < 3; j++){
                System.out.println(board[i][j] + " | ");
            }
            System.out.println("--+--+-+--");
        }

    }

    // Modifiers
    public void playMove(char p, int r, int c) {
        if(r >= 0 && (r < 3)){
            if(c >= 0 && (c <  3)){
                if(board[r][c] == '-'){
                    board[r][c] = playerAt(r,c);
                }
            }
        }
    }
}