
package br.com.integration.soap.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FullCountryInfoAllCountriesResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fullCountryInfoAllCountriesResult"
})
@XmlRootElement(name = "FullCountryInfoAllCountriesResponse")
public class FullCountryInfoAllCountriesResponse {

    @XmlElement(name = "FullCountryInfoAllCountriesResult", required = true)
    protected ArrayOftCountryInfo fullCountryInfoAllCountriesResult;

    /**
     * Obt�m o valor da propriedade fullCountryInfoAllCountriesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public ArrayOftCountryInfo getFullCountryInfoAllCountriesResult() {
        return fullCountryInfoAllCountriesResult;
    }

    /**
     * Define o valor da propriedade fullCountryInfoAllCountriesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryInfo }
     *     
     */
    public void setFullCountryInfoAllCountriesResult(ArrayOftCountryInfo value) {
        this.fullCountryInfoAllCountriesResult = value;
    }

}
