package example2;

public class BuilderMain {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        MealType type1 = builder.buildFood();
        type1.showItems();

        MealType type2 = builder.buildDrink();
        type2.showItems();
    }
}
