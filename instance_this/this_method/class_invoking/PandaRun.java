class PandaRun {

    PandaRun() {
        System.out.println("executing panda run");
    }

    void show(Panda panda) {

        if (panda != null) {
            panda.info();
        } else {
            System.out.println("it is not panda");
        }
    }
}