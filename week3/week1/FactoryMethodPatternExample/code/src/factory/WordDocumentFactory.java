package factory;

import doc.Document;
import doc.WordDocument;

public class WordDocumentFactory extends DocumentFactory{
  public Document createDocument()
  {
	  return new WordDocument();
  }
}
