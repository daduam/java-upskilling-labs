package com.kforkojo.advancedjavafeatures.exercise1;

public class TxtDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument(DocumentType type) {
        if (type.equals(DocumentType.TXT)) {
            return new TxtDocument();
        }
        throw new IllegalArgumentException("Invalid document type");
    }
}
