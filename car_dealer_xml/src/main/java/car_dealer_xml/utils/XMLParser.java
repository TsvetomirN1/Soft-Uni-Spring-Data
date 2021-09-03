package car_dealer_xml.utils;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public interface XMLParser {

    <T> T unmarshalFromFile(String filePath, Class<T> tClass) throws JAXBException, FileNotFoundException;

    <T> void marshalToFile(String filePath, T rootDto) throws JAXBException;


}
