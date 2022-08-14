package oops2.tictoctoe;

public class Player {
    String name;
    String id;
    char key; // o x


    public Player(String name, String id, char key) {
        this.name = name;
        this.id = id;
        this.key = key;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
    }


}
