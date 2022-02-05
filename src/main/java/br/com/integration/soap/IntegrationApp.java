package br.com.integration.soap;

import br.com.integration.soap.model.CountryInfoService;
import br.com.integration.soap.model.CountryInfoServiceSoapType;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;

public class IntegrationApp {
    public static void main(String[] args) throws SOAPException, MalformedURLException {
        CountryInfoServiceSoapType countryInfoServiceSoapType = webService();

        System.out.println("-----------------One Invoked");

        countryInfoServiceSoapType.listOfContinentsByCode()
                .getTContinent()
                .stream()
                .forEach(tContinent ->
                        System.out.println("Codigo="
                                .concat(tContinent.getSCode())
                                .concat("-")
                                .concat("Nome=")
                                .concat(tContinent.getSName())
                        )
                );

        System.out.println("-----------------Two Invoked");

        countryInfoServiceSoapType.listOfLanguagesByName()
                .getTLanguage()
                .stream()
                .forEach(tLanguage ->
                        System.out.println("SISOCode="
                                .concat(tLanguage.getSISOCode())
                                .concat("-")
                                .concat("Name=")
                                .concat(tLanguage.getSName())
                        )
                );


        System.out.println("-----------------Three Invoked");

        countryInfoServiceSoapType.listOfCurrenciesByCode()
                .getTCurrency()
                .stream()
                .forEach(tCurrency ->
                        System.out.println("SISOCode="
                                .concat(tCurrency.getSISOCode())
                                .concat("-")
                                .concat("Name=")
                                .concat(tCurrency.getSName())
                        )
                );
    }

    private static CountryInfoServiceSoapType webService() throws MalformedURLException {
        URL url = new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");
        CountryInfoService countryInfoService = new CountryInfoService(url);
        return countryInfoService.getCountryInfoServiceSoap();
    }
}