class LibraryRunner {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("C++");

        lib.searchBook("Python");
        lib.searchBook("Ruby");
    }
}