package POO2.aulas.xml;

import java.io.FileOutputStream;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class EscreverExemplo2 {
    public static void main(String[] args) throws Exception  {
        
        // loads a file
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse( new File("./Arquivo4.xml") );
        doc.getDocumentElement().normalize();
        
        // raiz
        Element raiz = doc.getDocumentElement();
        
        // elements
        Element element1 = doc.createElement( "pai_2" );
        element1.setAttribute("atributo1", "value");
        element1.setAttribute("atribute2", "value");
//        element1.setTextContent( "conteudo" );
        
        Element element2 = doc.createElement( "filho" );
        element2.setAttribute("atributo1", "value");
        element2.setAttribute("atributo2", "value");
        element2.setTextContent( "conteudo" );
        
        Element element3 = doc.createElement( "filho" );
        element3.setAttribute("atributo1", "value");
        element3.setAttribute("atributo2", "value");
        
        Element element4 = doc.createElement( "filho" );
        element4.setAttribute("atributo1", "value");
        element4.setAttribute("atributo2", "value");
        element4.setTextContent( "conteudo" );
        
        element1.appendChild(element2);
        element1.appendChild(element3);
        
        element3.appendChild(element4);
        
        raiz.appendChild( element1 );
        
        // save
        FileOutputStream output = new FileOutputStream("Arquivo4.xml");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource( doc );
        StreamResult result = new StreamResult( output );
        
        transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "yes" );
        transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//        transformer.setOutputProperty(OutputKeys.ENCODING,"ISO-8859-1");
        transformer.transform( source, result );
        
    }
}

