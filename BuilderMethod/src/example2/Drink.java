package example2;

public class Drink extends Restaurant{
    @Override
    public String pack() {
        return "Ayran";
    }

    @Override
    public int price() {
        return 5;
    }
}
