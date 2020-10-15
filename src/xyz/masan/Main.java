package xyz.masan;

public class Main {
    public static void main(String[] args) {

        Hero h = new Hero();
        h.name = "Minato";
        h.hp = 100;

        Hero h2 = new Hero();
        h2.name = "momoko"
                ;
        h2.hp = 23;

        Wizard w = new Wizard();
        w.hp = 50;
        w.heal(h);
        w.heal(h2);
        w.heal(h2);
        System.out.println(h.hp);
        System.out.println(h2.hp);


    }
}
