package oops2.tictoctoe;

public class PlayGround {
    public static void main(String[] args) {
        Player player1 = new Player("Varun", "12", 'x');
        Player player2 = new Player("Bharat", "12", 'o');
        TicTacToe t = new TicTacToe(player1, player2);
        t.play();
    }
}
