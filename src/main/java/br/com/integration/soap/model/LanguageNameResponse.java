
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
 *         &lt;element name="LanguageNameResult" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "languageNameResult"
})
@XmlRootElement(name = "LanguageNameResponse")
public class LanguageNameResponse {

    @XmlElement(name = "LanguageNameResult", required = true)
    protected String languageNameResult;

    /**
     * Obt�m o valor da propriedade languageNameResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageNameResult() {
        return languageNameResult;
    }

    /**
     * Define o valor da propriedade languageNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageNameResult(String value) {
        this.languageNameResult = value;
    }

}
