package OOP_Basic.dziedziczenie.buildings;

public class Tower {

    private String title;
    private int cost;
    private double damage;

    public Tower(String title, int cost, double damage) {
        this.title = title;
        this.cost = cost;
        this.damage = damage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Tower{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                ", damage=" + damage +
                '}';
    }
}
