package factory;

import doc.Document;
import doc.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory{
   public Document createDocument()
   {
	   return new PdfDocument();
   }
}
