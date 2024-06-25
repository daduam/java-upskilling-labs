package kforkojo.advancedjavafeatures.exercise1;

public class DocxDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument(DocumentType type) {
        if (type.equals(DocumentType.DOCX)) {
            return new DocxDocument();
        }
        throw new IllegalArgumentException("Invalid document type");
    }
}
