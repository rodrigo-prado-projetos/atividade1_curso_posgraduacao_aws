
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
 *         &lt;element name="ListOfCountryNamesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/&gt;
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
    "listOfCountryNamesByNameResult"
})
@XmlRootElement(name = "ListOfCountryNamesByNameResponse")
public class ListOfCountryNamesByNameResponse {

    @XmlElement(name = "ListOfCountryNamesByNameResult", required = true)
    protected ArrayOftCountryCodeAndName listOfCountryNamesByNameResult;

    /**
     * Obt�m o valor da propriedade listOfCountryNamesByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getListOfCountryNamesByNameResult() {
        return listOfCountryNamesByNameResult;
    }

    /**
     * Define o valor da propriedade listOfCountryNamesByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setListOfCountryNamesByNameResult(ArrayOftCountryCodeAndName value) {
        this.listOfCountryNamesByNameResult = value;
    }

}
