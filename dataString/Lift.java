class Lift {

    String[] lifts = new String[5];
    int index = 0;

    void addLift(String lift) {

        System.out.println("Adding lift");

        if (lift != null) {

            if (this.index < this.lifts.length) {
                this.lifts[this.index] = lift;
                System.out.println("Stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more lifts");
            }

        } else {
            System.out.println("Lift is null");
        }
    }

    void searchLift(String name) {

        System.out.println("Searching lift");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < lifts.length; i++) {
                if (name.equals(lifts[i])) {
                    System.out.println("Lift found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Lift not found");
            }

        } else {
            System.out.println("Name is null");
        }
    }
}