class LaserStore {

    Laser[] store = new Laser[20];
    int index = 0;

    void save(Laser l) {
        if (index < store.length) {
            store[index] = l;
            index++;
            System.out.println("Laser saved");
        } else {
            System.out.println("Store full");
        }
    }

    void displayAll() {
        for (int i = 0; i < index; i++) {
            store[i].display();
        }
    }
}