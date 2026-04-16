class CricketStore {

    Cricket[] store = new Cricket[20];
    int index = 0;

    void save(Cricket c) {
        if (index < store.length) {
            store[index] = c;
            index++;
            System.out.println("Cricket data saved");
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