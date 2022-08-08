package SnakeLadder;


public class Snake {
    int head; //head
    int tail; // tail

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }
}


class Ladder {
    int start;
    int end;

    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }
}


class Player {
    String id;
    String name;
    int position;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
        this.position = 0;
    }
}

