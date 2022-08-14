package oops2.tictoctoe;

import jdk.nashorn.internal.ir.BaseNode;

import java.util.Scanner;

enum GameStatus {
    Draw, Win, Running
}

public class TicTacToe {
    Player player1;
    Player player2;

    char board[][];
    final int BOARD_SIZE = 3;
    GameStatus status;
    Scanner sc = new Scanner(System.in);

    TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        status = GameStatus.Running;
        initBoard();
    }

    void initBoard() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '-';
            }
        }
    }

    void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean moveToPos(int row, int col, Player player) {
        if (row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == '-') {
            board[row][col] = player.key;
            return true;
        } else return false;
    }

    void currentTurn(Player player) {
        System.out.print("Player: " + player.name + " - enter the row col to move: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println();
        if (moveToPos(rows, cols, player)) {
            System.out.println("It is a valid move");
        } else {
            System.out.println("Invalid move");
        }
        if (isWon(player.key)) {
            System.out.println("player: " + player.name + " won");
            printBoard();
            status = GameStatus.Win;
        }
    }

    boolean isColSame(char key) {
        for (int col = 0; col < BOARD_SIZE; col++) {
            int count = 0;
            for (int row = 0; row < BOARD_SIZE; row++) {
                if (board[row][col] == key) count++;
            }
            if (count == BOARD_SIZE) return true;
        }
        return false;
    }

    boolean isRowSame(char key) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            int count = 0;
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] == key) count++;
            }
            if (count == BOARD_SIZE) return true;
        }
        return false;
    }

    boolean isDiagonalSame(char key) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][i] == key) count1++;
            if (board[i][BOARD_SIZE - i - 1] == key) count2++;
        }
        return (count1 == BOARD_SIZE || count2 == BOARD_SIZE);
    }

    boolean isWon(char key) {
        return isColSame(key) || isRowSame(key) || isDiagonalSame(key);
    }

    void play() {
        int playerTurn = 0;
        while (status == GameStatus.Running) {
            printBoard();
            if (playerTurn % 2 == 0) {
                currentTurn(player1);
            } else {
                currentTurn(player2);
            }

            playerTurn++;
            if (status == GameStatus.Running && playerTurn == (BOARD_SIZE*BOARD_SIZE)) {
                status = GameStatus.Draw;
                System.out.println("Game is draw");
                printBoard();
            }
        }
    }

}
