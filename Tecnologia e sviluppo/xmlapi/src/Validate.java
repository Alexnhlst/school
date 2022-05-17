import java.io.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import org.xml.sax.SAXException;

public class Validate {
    public static void validate(String XMLDocument, String XSDschema) throws SAXException, IOException {
        SchemaFactory factory = SchemaFactory.newInstance("http://www.w2.org/2001/XMLSchema");
        File schemaFile = new File(XSDschema);
        Schema schema = factory.newSchema(schemaFile);
        Validator validator = schema.newValidator();
        Source source = new StreamSource(XMLDocument);
        validator.validate(source);
    }

    public static void main(String args[]) throws IOException {
        try {
            Validate.validate(args[0], args[1]);
            System.out.println("Documento XML valido");
        } catch (SAXException exception) {
            System.out.println("DOcumento XML NON valido");
            System.out.println(exception.getMessage());
        }
    }
}