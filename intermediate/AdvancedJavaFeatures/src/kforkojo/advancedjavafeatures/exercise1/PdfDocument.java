package kforkojo.advancedjavafeatures.exercise1;

public class PdfDocument implements Document {

    @Override
    public void create(String content) {
        System.out.println("creating pdf document with content: " + content);
    }

    @Override
    public void save() {
        System.out.println("saving pdf document");
    }
}
