public class wordFactory extends DocumentFactory{
    @Override
    public Document createDocument(){
        return new wordDocument();
    }
}
