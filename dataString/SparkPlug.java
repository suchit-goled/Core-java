class SparkPlug {

    String[] plugs = new String[5];
    int index = 0;

    void addPlug(String plug) {

        System.out.println("Adding spark plug");

        if (plug != null) {

            if (this.index < this.plugs.length) {
                this.plugs[this.index] = plug;
                System.out.println("Stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more plugs");
            }

        } else {
            System.out.println("Plug is null");
        }
    }

    void searchPlug(String name) {

        System.out.println("Searching spark plug");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < plugs.length; i++) {
                if (name.equals(plugs[i])) {
                    System.out.println("Plug found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Plug not found");
            }

        } else {
            System.out.println("Name is null");
        }
    }
}