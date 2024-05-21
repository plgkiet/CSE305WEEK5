public class Document {
    private String extension;
    private String Encryption;
    
    public Document(String extension, String encryption) {
        this.extension = extension;
        Encryption = encryption;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String getEncryption() {
        return Encryption;
    }
    public void setEncryption(String encryption) {
        Encryption = encryption;
    }
    @Override
    public String toString() {
        return "Document [extension=" + extension + ", Encryption=" + Encryption + "]";
    }
    
}
