package SnakeLadder;

import java.util.ArrayList;
import java.util.List;

public class SaapSidi {
    public static void main(String[] args) {
        //
        //create player
        List<Player> players = new ArrayList<>();
        Player p1 = new Player("P1", "Varun");
        players.add(p1);
        players.add(new Player("P2", "Tarun"));

        List<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(55, 44));
        snakes.add(new Snake(22, 10));
        snakes.add(new Snake(99, 9));

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(4, 15));
        ladders.add(new Ladder(25, 56));
        ladders.add(new Ladder(11, 40));

        SnakeAndLadderGame saapsidi = new SnakeAndLadderGame(players, snakes, ladders);
        saapsidi.play();

    }
}
