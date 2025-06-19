public class Main {
    public static void main(String[] args) {
        // Using the factory to create a Word document
        DocumentFactory wordDocFactory = new WordDocumentFactory();
        Document wordDocument = wordDocFactory.createDocument();
        wordDocument.open();
        wordDocument.close();

        // Using the factory to create a PDF document
        DocumentFactory pdfDocFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfDocFactory.createDocument();
        pdfDocument.open();
        pdfDocument.close();

        // Using the factory to create an Excel document
        DocumentFactory excelDocFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocFactory.createDocument();
        excelDocument.open();
        excelDocument.close();
    }
}
