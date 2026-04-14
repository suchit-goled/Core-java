class Juice {

    String[] juices = new String[5];
    int index = 0;

    void addJuice(String juice) {

        System.out.println("Adding juice");

        if (juice != null) {

            if (this.index < this.juices.length) {
                this.juices[this.index] = juice;
                System.out.println("Stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more juices");
            }

        } else {
            System.out.println("Juice is null");
        }
    }

    void searchJuice(String name) {

        System.out.println("Searching juice");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < juices.length; i++) {
                if (name.equals(juices[i])) {
                    System.out.println("Juice found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Juice not found");
            }

        } else {
            System.out.println("Name is null");
        }
    }
}