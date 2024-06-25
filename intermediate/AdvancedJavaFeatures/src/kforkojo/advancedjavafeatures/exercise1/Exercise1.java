package kforkojo.advancedjavafeatures.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        createNewDocument(DocumentType.PDF, "The quick brown fox jumps over the lazy dog.");
    }

    private static void createNewDocument(DocumentType type, String content) {
        DocumentFactory factory = getDocumentFactory(type);
        Document document = factory.createDocument(type);
        document.create(content);
        document.save();
    }

    private static DocumentFactory getDocumentFactory(DocumentType type) {
        switch (type) {
            case PDF:
                return new PdfDocumentFactory();
            case DOCX:
                return new DocxDocumentFactory();
            case TXT:
                return new TxtDocumentFactory();
            default:
                throw new IllegalArgumentException("Unsupported document type");
        }
    }
}
