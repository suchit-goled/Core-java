class Dynamo {

    String[] dynamos = new String[5];
    int index = 0;

    void addDynamo(String dynamo) {

        System.out.println("Adding dynamo");

        if (dynamo != null) {

            if (this.index < this.dynamos.length) {
                this.dynamos[this.index] = dynamo;
                System.out.println("Stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more dynamos");
            }

        } else {
            System.out.println("Dynamo is null");
        }
    }

    void searchDynamo(String name) {

        System.out.println("Searching dynamo");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < dynamos.length; i++) {
                if (name.equals(dynamos[i])) {
                    System.out.println("Dynamo found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Dynamo not found");
            }

        } else {
            System.out.println("Name is null");
        }
    }
}