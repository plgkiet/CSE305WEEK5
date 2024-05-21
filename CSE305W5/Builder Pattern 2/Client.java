import NormalDoc;
import ConfidentialDoc;
import Document;
import BuildDocument;


public class Client {
    public static void main (String[] args) {
        BuildDocument b = new NormalDoc();
        b.setEncryption("none");
        b.setExtension("txt");
        Document normalDoc = b.builDoc();
        System.out.println(normalDoc + " " + b.getClass().getName());
    }
}