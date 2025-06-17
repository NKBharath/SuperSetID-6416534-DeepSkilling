public class pdfFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new pdfDocument();
    }
}
