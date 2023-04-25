package imp;

import abstractt.Computer;

public class MonsterLaptop implements Computer{
    @Override
    public void draw() {
        System.out.println("Laptoplar arasinda onemli bir yeri var ama daha pahali :: Monster Laptop");
    }
}
