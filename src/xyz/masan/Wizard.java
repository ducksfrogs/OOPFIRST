package xyz.masan;

public class Wizard {
    String name;
    int hp;

    void heal(Hero h){
        h.hp += 10;
        System.out.println(h.name +" recoverd 10points");
    }
}
