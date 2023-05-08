package example1;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder(
                "500 GB","8 GB"
        )
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println("HDD : " + computer.getHDD() + " \nRam : " + computer.getRAM());

    }
}
