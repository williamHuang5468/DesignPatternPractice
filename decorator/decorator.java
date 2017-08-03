interface Meal {
    String getContent();
    double price();
}

class FriedChicken implements Meal {
    public String getContent() {
        return "不黑心炸雞";
    }
    public double price() {
        return 49.0;
    }
}

class Hamburger implements Meal {
    public String getContent() {
        return "美味蟹堡";
    }
    public double price() {
        return 99.0;
    }
}

abstract class SideDish implements Meal {
    protected Meal meal;
    SideDish(Meal meal) {
        this.meal = meal;
    }
}

class SideDishOne extends SideDish {
    SideDishOne(Meal meal) {
        super(meal);
    }
    public String getContent() {
        return meal.getContent() + " | 可樂 | 薯條";
    }
    public double price() {
        return meal.price() + 30.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Meal meal = new SideDishOne(new FriedChicken());
        System.out.println("點了：" + meal.getContent());
        System.out.println("價格：" + meal.price());
    }
}
