package adopterPattern;

public class DocumentReaderIo implements DocumentReader{
    //only support txt file
    AdvancedDocumentReader advancedDocumentReader;
    public DocumentReaderIo(){
        this.advancedDocumentReader=new AdavancedDocumentReaderIo();
    }
    @Override
    public void read(String docType, String fileName) {
        if(docType.equals("txt")) {
            System.out.println("docType " + docType + "fileName " + fileName);
        }
        else if(docType.equals("pdf")){
            advancedDocumentReader.readPdf(fileName);
        }
        else {
            advancedDocumentReader.readDoc(fileName);
        }

    }
}
