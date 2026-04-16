class SilencerStore {

    Silencer[] store = new Silencer[20];
    int index = 0;

    void save(Silencer s) {
        if (index < store.length) {
            store[index] = s;
            index++;
            System.out.println("Silencer saved");
        } else {
            System.out.println("Store is full");
        }
    }

    void displayAll() {
        for (int i = 0; i < index; i++) {
            store[i].display();
        }
    }
}