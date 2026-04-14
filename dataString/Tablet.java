class Tablet {

    String[] tablets = new String[5];
    int index = 0;

    void addTablet(String tablet) {

        System.out.println("Adding tablet");

        if (tablet != null) {

            if (this.index < this.tablets.length) {
                this.tablets[this.index] = tablet;
                System.out.println("Tablet stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more tablets");
            }

        } else {
            System.out.println("Tablet name is null");
        }
    }

    void searchTablet(String name) {

        System.out.println("Searching tablet");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < tablets.length; i++) {
                if (name.equals(tablets[i])) {
                    System.out.println("Tablet found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Tablet not found");
            }

        } else {
            System.out.println("Tablet name is null");
        }
    }
}