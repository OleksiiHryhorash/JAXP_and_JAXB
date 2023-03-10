package javaExamplesJAXPandJAXB.ex_011_marshalling_unmarshalling;



import javaExamplesJAXPandJAXB.ex_011_marshalling_unmarshalling.country.CountryType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainUnmarshalling {

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(CountryType.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();

        CountryType countryTypes =(CountryType) unmarshaller.unmarshal(new File("out.xml"));


            System.out.println(countryTypes.getName() + " " + countryTypes.getCapital()
                    + " " + countryTypes.getCountryCode() + " " + countryTypes.getDescription());



    }

}
