
package br.com.dijalmasilva.soap.passagem.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passagem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cpfCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadeDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDaPassagem" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passagem", propOrder = {
    "id",
    "cpfCliente",
    "cidadeOrigem",
    "cidadeDestino",
    "valorDaPassagem"
})
public class Passagem {

    protected Long id;
    protected String cpfCliente;
    protected String cidadeOrigem;
    protected String cidadeDestino;
    protected BigInteger valorDaPassagem;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the cpfCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * Sets the value of the cpfCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCliente(String value) {
        this.cpfCliente = value;
    }

    /**
     * Gets the value of the cidadeOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    /**
     * Sets the value of the cidadeOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeOrigem(String value) {
        this.cidadeOrigem = value;
    }

    /**
     * Gets the value of the cidadeDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDestino() {
        return cidadeDestino;
    }

    /**
     * Sets the value of the cidadeDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDestino(String value) {
        this.cidadeDestino = value;
    }

    /**
     * Gets the value of the valorDaPassagem property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValorDaPassagem() {
        return valorDaPassagem;
    }

    /**
     * Sets the value of the valorDaPassagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValorDaPassagem(BigInteger value) {
        this.valorDaPassagem = value;
    }

}
