package com.kforkojo.advancedjavafeatures.exercise1;

public class TxtDocument implements Document {

    @Override
    public void create(String content) {
        System.out.println("creating txt document with content: " + content);
    }

    @Override
    public void save() {
        System.out.println("saving txt document");
    }
}
