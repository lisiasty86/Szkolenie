package OOP_Basic.dziedziczenie.buildings.towers;

import OOP_Basic.dziedziczenie.buildings.Tower;

public class GunTower extends Tower {

    private double damageRate;
    private double accuracy;

    public GunTower(String title, int cost, double damage, double damageRate, double accuracy) {
        super(title, cost, damage);
        this.damageRate = damageRate;
        this.accuracy = accuracy;
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
