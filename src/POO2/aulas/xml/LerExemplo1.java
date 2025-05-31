package POO2.aulas.xml;

import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LerExemplo1 {
    public static void main(String[] args) throws Exception  {
        
        // loads a file
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse( new File("./Arquivo4.xml") );
        doc.getDocumentElement().normalize();
        
        // raiz
        Element raiz = doc.getDocumentElement();
        System.out.println( "nome da tag '" + raiz.getNodeName() + "'" );
        
        // imprimir todos os nós do elemento raiz
        if ( raiz.hasChildNodes() ) {
            
            NodeList lista = raiz.getChildNodes();
            
            for( int i = 0; i < lista.getLength(); i ++ ) {
                
                Node no = lista.item(i);
                
                if( no.getNodeType() == Node.ELEMENT_NODE ) {
                    System.out.println( "nome do nó '" + no.getNodeName() + "'" );
                }
            }
        }
        
        
        NodeList lista = raiz.getElementsByTagName("filho");
        System.out.println( "lista.getLength() " + lista.getLength() );
        
        Node no = lista.item(0);
        System.out.println( "nó atributo1 '" + no.getAttributes().getNamedItem("atributo1").getNodeValue() + "'" );
        System.out.println( "nó atributo2 '" + no.getAttributes().getNamedItem("atributo2").getNodeValue() + "'" );
        System.out.println( "nó content '" + no.getTextContent() + "'" );
        
    }
}

