package javaExamplesJAXPandJAXB.ex_011_marshalling_unmarshalling;



import javaExamplesJAXPandJAXB.ex_011_marshalling_unmarshalling.country.CountryType;
import javaExamplesJAXPandJAXB.ex_011_marshalling_unmarshalling.country.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MainMarshlling {

    public static void main(String[] args) throws JAXBException {
        ObjectFactory factory = new ObjectFactory();
        CountryType countryType = factory.createCountryType();
        countryType.setName("Germany");
        countryType.setCapital("Berlin");
        countryType.setCountryCode("De");
        countryType.setDescription("Detchland is ... ");
//
        JAXBContext context = JAXBContext.newInstance(CountryType.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.marshal(countryType, new File("out.xml"));
    }
}
