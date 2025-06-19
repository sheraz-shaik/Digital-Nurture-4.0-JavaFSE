// Concrete implementation of a Word document
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word file.");
    }

    @Override
    public void close() {
        System.out.println("Closing the Word file.");
    }
}
