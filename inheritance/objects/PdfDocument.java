class PdfDocument extends Document {

    PdfDocument(String type, int pages) {
        super(type, pages);
        System.out.println("Type: " + type);
        System.out.println("Pages: " + pages);
    }
}