
package br.com.dijalmasilva.soap.hotel.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reserva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dataReservada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaDaCriacaoDaReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://ws.hotel.soap.dijalmasilva.com.br/}hotel" minOccurs="0"/>
 *         &lt;element name="cpfCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "id",
    "dataReservada",
    "diaDaCriacaoDaReserva",
    "hotel",
    "cpfCliente"
})
public class Reserva {

    protected Long id;
    protected String dataReservada;
    protected String diaDaCriacaoDaReserva;
    protected Hotel hotel;
    protected String cpfCliente;

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
     * Gets the value of the dataReservada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataReservada() {
        return dataReservada;
    }

    /**
     * Sets the value of the dataReservada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataReservada(String value) {
        this.dataReservada = value;
    }

    /**
     * Gets the value of the diaDaCriacaoDaReserva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaDaCriacaoDaReserva() {
        return diaDaCriacaoDaReserva;
    }

    /**
     * Sets the value of the diaDaCriacaoDaReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaDaCriacaoDaReserva(String value) {
        this.diaDaCriacaoDaReserva = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
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

}
