//This will use DocumentFactory to create a word document.
public class WordDocumentCreator extends DocumentFactory{
    public Document createDocument(){
        return new WordDocument();
    }
}
