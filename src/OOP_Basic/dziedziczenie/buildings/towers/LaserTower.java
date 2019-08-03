package OOP_Basic.dziedziczenie.buildings.towers;

import OOP_Basic.dziedziczenie.buildings.Tower;

public class LaserTower extends Tower {

    private double damageRate;
    private double accuracy;

    public LaserTower(String title, int cost, double damage, double damageRate, double accuracy) {
        super(title, cost, damage);
    }

    public double getDamageRate() {
        return damageRate;
    }

    public void setDamageRate(double damageRate) {
        this.damageRate = damageRate;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }
}
