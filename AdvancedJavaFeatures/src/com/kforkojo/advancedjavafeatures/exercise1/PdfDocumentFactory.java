package com.kforkojo.advancedjavafeatures.exercise1;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument(DocumentType type) {
        if (type.equals(DocumentType.PDF)) {
            return new PdfDocument();
        }
        throw new IllegalArgumentException("Invalid document type");
    }
}
