package OOP_Basic.dziedziczenie.buildings.game;

import OOP_Basic.dziedziczenie.buildings.Tower;
import OOP_Basic.dziedziczenie.buildings.towers.BowTower;

public class Start {

    public static void main(String[] args) {

        Tower bowTower = new BowTower("Bow tower", 120, 24.5, 0.2, 0.2);
        System.out.println(bowTower.getTitle());
    }

}
