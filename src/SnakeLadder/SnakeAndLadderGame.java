package SnakeLadder;

import java.util.List;
import java.util.Random;

public class SnakeAndLadderGame {
    List<Player> players;
    List<Snake> snakes;
    List<Ladder> ladders;


    int boardSize = 100; // if any player goes to 100 then game ends
    boolean stopGame = false;  // false, don't stop the game


    int rollDice() {
        Random r = new Random(); // random obj
        return r.nextInt(6) + 1;
        // 0 1 2 3 4 5
        // 1 2 3 4 5 6
    }

    public SnakeAndLadderGame(List<Player> players, List<Snake> snakes, List<Ladder> ladders) {
        this.players = players;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    int getNewPositionWithSnakeAndLadderMoves(Player player, int pos) {
        for (Snake s : snakes) {
            if (s.head == pos) { // come down
//                System.out.println(" player bitten by snake  " + player.name + " " + s.head + "->" + s.tail);
                return s.tail;
            }
        }

        for (Ladder l : ladders) {
            if (l.start == pos) {
//                System.out.println("ladder goes up " + player.name + " " + l.start + "->" + l.end);
                return l.end;
            }
        }

        return pos;
    }

    void play() {
        int currentTurn = 0;
        //logic of game
        while (stopGame == false) {
            Player currentPlayer = players.get(currentTurn % players.size());
            int number = rollDice();
            int prevPosition = currentPlayer.position;
            int newPosition = currentPlayer.position + number;
            if (newPosition <= boardSize) {
                if (newPosition == boardSize) { // have you reached the end?
                    currentPlayer.position = newPosition;
                    System.out.println(currentPlayer.name + " win the game");
                    stopGame = true;
                } else {
                    currentPlayer.position = getNewPositionWithSnakeAndLadderMoves(currentPlayer, currentPlayer.position + number);
                }
            }
            System.out.println("Player " + currentPlayer.name + " rolled dice and got " + number + ". moved from " + prevPosition + " " + currentPlayer.position);
            currentTurn++;
        }

    }

}
