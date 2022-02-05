
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
 *         &lt;element name="ListOfCountryNamesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCountryCodeAndName"/&gt;
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
    "listOfCountryNamesByCodeResult"
})
@XmlRootElement(name = "ListOfCountryNamesByCodeResponse")
public class ListOfCountryNamesByCodeResponse {

    @XmlElement(name = "ListOfCountryNamesByCodeResult", required = true)
    protected ArrayOftCountryCodeAndName listOfCountryNamesByCodeResult;

    /**
     * Obt�m o valor da propriedade listOfCountryNamesByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public ArrayOftCountryCodeAndName getListOfCountryNamesByCodeResult() {
        return listOfCountryNamesByCodeResult;
    }

    /**
     * Define o valor da propriedade listOfCountryNamesByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCountryCodeAndName }
     *     
     */
    public void setListOfCountryNamesByCodeResult(ArrayOftCountryCodeAndName value) {
        this.listOfCountryNamesByCodeResult = value;
    }

}
