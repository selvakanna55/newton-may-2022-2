package Assignment;

import java.util.ArrayList;
import java.util.List;

interface ISaveable {
    List<String> write();

    void read(List<String> list);
}

public class Player implements ISaveable {
    String name;
    String weapon;
    int hitPoints;
    int strength;

    Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public List<String> write() {
        ArrayList<String> li = new ArrayList<>();
        //["newton", "10", "5", "sword"]
        li.add(name); //0
        li.add(String.valueOf(hitPoints)); // 1
        li.add(String.valueOf(strength));//2
        li.add(weapon);//3
        return li;
    }

    public void read(List<String> li) {
        if (li != null && li.size() > 0) {
            name = li.get(0);
            hitPoints = Integer.parseInt(li.get(1));
            strength = Integer.parseInt(li.get(2));
            weapon = li.get(3);
        }
    }

    public String toString() {
        //name = newton, hitPoints = 10, hitPoints = 5, weapon=sword
        //converts variables and values into string -
        return "Player{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
        // Player{name='newton', hitPoints=10, strength=5, weapon='sword'}
    }

}


class Monster implements ISaveable {
    String name;
    int hitPoints;
    int strength;

    Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


    public List<String> write() {
        ArrayList<String> li = new ArrayList<>();
        li.add(name); //0
        li.add(String.valueOf(hitPoints)); // 1
        li.add(String.valueOf(strength));//2
        return li;
    }

    public void read(List<String> li) {
        if (li != null && li.size() > 0) {
            name = li.get(0);
            hitPoints = Integer.parseInt(li.get(1));
            strength = Integer.parseInt(li.get(2));
        }
    }

    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }

}