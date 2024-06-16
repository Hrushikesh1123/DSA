package adopterPattern;

public class AdavancedDocumentReaderIo implements AdvancedDocumentReader{
    @Override
    public void readPdf(String fileName) {
        System.out.println("fileName is "+ fileName);

    }

    @Override
    public void readDoc(String fileName) {
        System.out .println("fileName is "+ fileName);

    }
}
