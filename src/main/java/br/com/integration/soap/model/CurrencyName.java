
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
 *         &lt;element name="sCurrencyISOCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "sCurrencyISOCode"
})
@XmlRootElement(name = "CurrencyName")
public class CurrencyName {

    @XmlElement(required = true)
    protected String sCurrencyISOCode;

    /**
     * Obt�m o valor da propriedade sCurrencyISOCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCurrencyISOCode() {
        return sCurrencyISOCode;
    }

    /**
     * Define o valor da propriedade sCurrencyISOCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCurrencyISOCode(String value) {
        this.sCurrencyISOCode = value;
    }

}
