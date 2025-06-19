// Concrete implementation of an Excel document
public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel file.");
    }

    @Override
    public void close() {
        System.out.println("Closing the Excel file.");
    }
}
