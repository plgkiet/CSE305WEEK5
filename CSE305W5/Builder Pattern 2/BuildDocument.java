import Document;

public interface BuildDocument {
    
    void setExtension(String extension);
    void setEncryption (String encryption);
    Document builDoc();
}
