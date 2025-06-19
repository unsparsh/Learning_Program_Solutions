public class Main {
    public static void main(String[] args){
        // Create a Word document
        DocumentFactory wordFactory = new WordDocumentCreator();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        // Create a PDF document
        DocumentFactory pdfFactory = new PdfocumentCreator();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        // Create a Excel document
        DocumentFactory ExcelFactory = new ExcelDocumentCreator();
        Document excelDoc = ExcelFactory.createDocument();
        excelDoc.open();
    }
}
