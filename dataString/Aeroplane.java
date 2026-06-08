package dataString;

class Aeroplane {

    String[] planes = new String[5];
    int index = 0;

    void addPlane(String plane) {

        System.out.println("Adding aeroplane");

        if (plane != null) {

            if (this.index < this.planes.length) {
                this.planes[this.index] = plane;
                System.out.println("Stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more planes");
            }

        } else {
            System.out.println("Plane is null");
        }
    }

    void searchPlane(String name) {

        System.out.println("Searching aeroplane");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < planes.length; i++) {
                if (name.equals(planes[i])) {
                    System.out.println("Plane found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Plane not found");
            }

        } else {
            System.out.println("Name is null");
        }
    }
}