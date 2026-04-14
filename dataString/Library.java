
class Library {

    String[] books = new String[5];
    int index = 0;

    void addBook(String book) {

        System.out.println("Adding book to library");

        if (book != null) {
            System.out.println("Book name: " + book);

            if (this.index < this.books.length) {
                this.books[this.index] = book;
                System.out.println("Book stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Library is full");
            }

        } else {
            System.out.println("Book name is null");
        }
    }

    void searchBook(String name) {

        System.out.println("Searching for book");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < books.length; i++) {
                if (name.equals(books[i])) {
                    System.out.println("Book found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book not found");
            }

        } else {
            System.out.println("Book name is null");
        }
    }
}