package Main;

import doc.Document;
import factory.DocumentFactory;
import factory.ExcelDocumentFactory;
import factory.PdfDocumentFactory;
import factory.WordDocumentFactory;

public class MainFactoryTest {
	public static void main(String arg [])
	{
		DocumentFactory wordfactory = new WordDocumentFactory();
		   DocumentFactory pdffactory = new PdfDocumentFactory();
		   DocumentFactory excelfactory = new ExcelDocumentFactory();
		   
		   Document doc1 = wordfactory.createDocument();
		   Document doc2 = pdffactory.createDocument();
		   Document doc3 = excelfactory.createDocument();
		   
		   doc1.open();
		   doc2.open();
		   doc3.open();
	}
   
}
