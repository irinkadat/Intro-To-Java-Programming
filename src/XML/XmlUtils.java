package XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlUtils {

    public static void createXML() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        Element studentsElement = document.createElement("students");
        document.appendChild(studentsElement);

        Element studentElement = document.createElement("student");
        studentElement.setAttribute("id", "1");
        studentsElement.appendChild(studentElement);

        Element firstNewElement = document.createElement("firstName");
        firstNewElement.appendChild(document.createTextNode("vinme"));
        studentElement.appendChild(firstNewElement);

        Element studentElement2 = document.createElement("student");
        studentElement2.setAttribute("id", "2");
        studentsElement.appendChild(studentElement2);

        Element secondNewElement = document.createElement("firstname");
        secondNewElement.appendChild(document.createTextNode("iinka"));
        studentElement2.appendChild(secondNewElement);


        TransformerFactory transformerFactory  = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult  = new StreamResult(new File("c.xml"));
        transformer.transform(domSource, streamResult);


    }

}