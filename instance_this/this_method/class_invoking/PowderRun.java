class PowderRun {

    PowderRun() {
        System.out.println("executing powder run in powder run");
    }

    void show(Powder powder) {

        if (powder != null) {
            powder.info();
        } else {
            System.out.println("it is not a powder");
        }
    }
}