
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
 *         &lt;element name="sISOCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "sisoCurrencyCode"
})
@XmlRootElement(name = "CountriesUsingCurrency")
public class CountriesUsingCurrency {

    @XmlElement(name = "sISOCurrencyCode", required = true)
    protected String sisoCurrencyCode;

    /**
     * Obt�m o valor da propriedade sisoCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISOCurrencyCode() {
        return sisoCurrencyCode;
    }

    /**
     * Define o valor da propriedade sisoCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISOCurrencyCode(String value) {
        this.sisoCurrencyCode = value;
    }

}
