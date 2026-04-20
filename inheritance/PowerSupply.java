class PowerSupply extends Electricity {

    PowerSupply(int voltage, int current) {
        super(voltage, current);
        System.out.println("Voltage: " + voltage);
        System.out.println("Current: " + current);
    }
}
