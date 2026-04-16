class WaterMelonStore {

    WaterMelon[] store = new WaterMelon[20];
    int index = 0;

    void save(WaterMelon waterMelon) {
        if (index < store.length) {
            store[index] = waterMelon;
            index++;
            System.out.println("Watermelon saved");
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