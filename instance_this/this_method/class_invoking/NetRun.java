class NetRun {

    NetRun() {
        System.out.println("executing net run in net run");
    }

    void show(Net net) {

        if (net != null) {
            net.info();
        } else {
            System.out.println("it is not a net");
        }
    }
}