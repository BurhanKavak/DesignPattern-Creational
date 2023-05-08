package example2;

public class Food extends Restaurant{
    @Override
    public String pack() {
        return "Tavuk Doner";
    }

    @Override
    public int price() {
        return 20;
    }
}
