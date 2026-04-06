class MickeyMouseRun {

    MickeyMouseRun() {
        System.out.println("executing mickeymouse run");
    }

    void show(MickeyMouse mickey) {

        if (mickey != null) {
            mickey.info();
        } else {
            System.out.println("it is not mickeymouse");
        }
    }
}