package factory;

import abstractt.AbstractFactory;
import abstractt.Computer;
import imp.MsiDesktop;
import imp.SamsungDesktop;

public class DesktopFactory extends AbstractFactory {
    @Override
    public Computer getComputer(String computerType) {
        if (computerType.equalsIgnoreCase("PAHALI")) {
            return new MsiDesktop();
        } else if (computerType.equalsIgnoreCase("UCUZ")) {
            return new SamsungDesktop();
        }
        return null;
    }
}
