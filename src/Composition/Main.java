package Composition;

public class Main {

    public static void main(String[] args) {

        Hands hands = new Hands();

        Man man = new Man(hands, "Furqan");

        System.out.println(man.hands.handsUp());

    }

}
