package pack;

import ua.lviv.iot.algo.part1.lab1.BoardGame;

public class Main {
    public static void main(String[] args) {

        for (BoardGame game : BoardGame.instance) {
            System.out.println(game.toString());
        }
    }
}