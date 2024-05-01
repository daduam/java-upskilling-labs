package com.kforkojo.advancedjavafeatures.exercise1;

public class DocxDocument implements Document {

    @Override
    public void create(String content) {
        System.out.println("creating docx document with content: " + content);
    }

    @Override
    public void save() {
        System.out.println("saving docx document");
    }
}
