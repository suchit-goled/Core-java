class MashaRun {

    MashaRun() {
        System.out.println("executing masha run");
    }

    void show(Masha masha) {

        if (masha != null) {
            masha.info();
        } else {
            System.out.println("it is not masha");
        }
    }
}