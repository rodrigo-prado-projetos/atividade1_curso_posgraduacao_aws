
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
 *         &lt;element name="CountryIntPhoneCodeResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "countryIntPhoneCodeResult"
})
@XmlRootElement(name = "CountryIntPhoneCodeResponse")
public class CountryIntPhoneCodeResponse {

    @XmlElement(name = "CountryIntPhoneCodeResult", required = true)
    protected String countryIntPhoneCodeResult;

    /**
     * Obt�m o valor da propriedade countryIntPhoneCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryIntPhoneCodeResult() {
        return countryIntPhoneCodeResult;
    }

    /**
     * Define o valor da propriedade countryIntPhoneCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryIntPhoneCodeResult(String value) {
        this.countryIntPhoneCodeResult = value;
    }

}
