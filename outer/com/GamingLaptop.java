package outer.com;

import inner.Laptop;

public class GamingLaptop extends Laptop {

    @Override
    protected void start() {
        System.out.println("Gaming Laptop getting started");
    }


}