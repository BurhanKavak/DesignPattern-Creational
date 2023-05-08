package example2;

public class MealBuilder {

    public MealType buildFood() {
        MealType mealType = new MealType();
        mealType.addItem(new Food());
        return mealType;
    }


    public MealType buildDrink() {
        MealType mealType = new MealType();
        mealType.addItem(new Drink());
        return mealType;
    }
}
