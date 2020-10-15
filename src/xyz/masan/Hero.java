package xyz.masan;

public class Hero {
    String name;
    int hp;

    void sleep(){
        this.hp = 100;
        System.out.println(this.name + "slept and recoverd !");
    }

    void sit(int sec){
        this.hp += sec;
        System.out.println(this.name + " sat for " + sec );
        System.out.println(sec + " recoverd.");
    }

    void slip(){
        this.hp -=5;
        System.out.println(this.name+" slipped ");
        System.out.println("5 damaged");
    }

    void run(){
        System.out.println(this.name+ "had run away.");
        System.out.println("GAME OVER");
        System.out.println(this.hp + "remained!!");
    }
}
