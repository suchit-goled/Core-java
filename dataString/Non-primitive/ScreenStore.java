class ScreenStore {

    Screen[] store = new Screen[20];
    int index = 0;

    void save(Screen sc) {
        if (index < store.length) {
            store[index] = sc;
            index++;
            System.out.println("Screen saved");
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