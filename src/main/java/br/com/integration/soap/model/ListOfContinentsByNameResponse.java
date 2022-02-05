
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
 *         &lt;element name="ListOfContinentsByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftContinent"/&gt;
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
    "listOfContinentsByNameResult"
})
@XmlRootElement(name = "ListOfContinentsByNameResponse")
public class ListOfContinentsByNameResponse {

    @XmlElement(name = "ListOfContinentsByNameResult", required = true)
    protected ArrayOftContinent listOfContinentsByNameResult;

    /**
     * Obt�m o valor da propriedade listOfContinentsByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftContinent }
     *     
     */
    public ArrayOftContinent getListOfContinentsByNameResult() {
        return listOfContinentsByNameResult;
    }

    /**
     * Define o valor da propriedade listOfContinentsByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftContinent }
     *     
     */
    public void setListOfContinentsByNameResult(ArrayOftContinent value) {
        this.listOfContinentsByNameResult = value;
    }

}
