public class ConfidentialDoc implements BuildDocument {
    private String extension;
    private String encryption;

    @Override
    public Document builDoc() {
        return new Document(extension, encryption);
    }

    @Override
    public void setEncryption(String encryption) {
        this.encryption = encryption;     
    }

    @Override
    public void setExtension(String extension) {
        this.extension = extension;
        
    }
    
}
