package POO2.aulas.xml;

import java.io.FileOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class EscreverExemplo1 {
    public static void main(String[] args) throws Exception  {
        
        // creates a file
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        
        // raiz
        Element raiz = doc.createElement( "raiz" );
        doc.appendChild(raiz);
        
        // elements
        Element element1 = doc.createElement( "projeto" );
        element1.setAttribute("nome", "Projeto X");
        element1.setAttribute("local", "São Paulo");
//        element1.setTextContent( "conteudo" );
        
        Element element2 = doc.createElement( "Trabalhador" );
        element2.setAttribute("nome", "Victor");
        element2.setAttribute("cpf", "555.555.555-55");
        element2.setTextContent( "gerente de projeto" );
        
        element1.appendChild( element2 );        
        raiz.appendChild( element1 );
        
        // save
        FileOutputStream output = new FileOutputStream("./Arquivo4.xml");
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

