public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new wordFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new pdfFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new excelFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}