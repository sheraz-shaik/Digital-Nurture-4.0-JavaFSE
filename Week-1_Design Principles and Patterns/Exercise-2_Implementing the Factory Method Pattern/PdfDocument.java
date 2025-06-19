// Concrete implementation of a PDF document
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF file.");
    }

    @Override
    public void close() {
        System.out.println("Closing the PDF file.");
    }
}
