package factory;

import doc.Document;
import doc.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument()
    {
    	return new ExcelDocument();
    }
}
