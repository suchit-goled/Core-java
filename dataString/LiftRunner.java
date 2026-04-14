class LiftRunner {

    public static void main(String[] args) {

        Lift lift = new Lift();

        lift.addLift("Passenger Lift");
        lift.addLift("Goods Lift");

        lift.searchLift("Passenger Lift");
        lift.searchLift("Service Lift");
    }
}