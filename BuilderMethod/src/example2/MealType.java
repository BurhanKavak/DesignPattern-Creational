package example2;

import java.util.ArrayList;
import java.util.List;

public class MealType {

    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs) {
        items.add(packs);
    }

    public void getCost() {
        for (Packing packs :items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packing packing : items) {

            System.out.print("Urun ismi : " + packing.pack());
            System.out.println(", fiyati : " + packing.price());
        }
    }
}
