class RotaterRun {

    RotaterRun() {
        System.out.println("executing rotater run in rotater run");
    }

    void show(Rotater rotater) {

        if (rotater != null) {
            rotater.info();
        } else {
            System.out.println("it is not a rotater");
        }
    }
}