class Cup {

    String[] cups = new String[5];
    int index = 0;

    void addCup(String cup) {

        System.out.println("Adding cup");

        if (cup != null) {

            if (this.index < this.cups.length) {
                this.cups[this.index] = cup;
                System.out.println("Cup stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more cups");
            }

        } else {
            System.out.println("Cup is null");
        }
    }

    void searchCup(String name) {

        System.out.println("Searching cup");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < cups.length; i++) {
                if (name.equals(cups[i])) {
                    System.out.println("Cup found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Cup not found");
            }

        } else {
            System.out.println("Cup name is null");
        }
    }
}