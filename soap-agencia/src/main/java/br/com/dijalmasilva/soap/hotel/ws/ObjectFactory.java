
package br.com.dijalmasilva.soap.hotel.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.dijalmasilva.soap.hotel.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindAllHotelResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findAllHotelResponse");
    private final static QName _FindReservaByIdResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findReservaByIdResponse");
    private final static QName _FindAllReserva_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findAllReserva");
    private final static QName _FindAllReservaResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findAllReservaResponse");
    private final static QName _DeleteHotel_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "deleteHotel");
    private final static QName _SaveReserva_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "saveReserva");
    private final static QName _DeleteReservaResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "deleteReservaResponse");
    private final static QName _SaveHotelResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "saveHotelResponse");
    private final static QName _Hotel_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "hotel");
    private final static QName _Reserva_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "reserva");
    private final static QName _EditHotelResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "editHotelResponse");
    private final static QName _DeleteReserva_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "deleteReserva");
    private final static QName _DeleteHotelResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "deleteHotelResponse");
    private final static QName _SaveHotel_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "saveHotel");
    private final static QName _FindHotelById_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findHotelById");
    private final static QName _EditHotel_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "editHotel");
    private final static QName _EditReservaResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "editReservaResponse");
    private final static QName _SaveReservaResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "saveReservaResponse");
    private final static QName _ReservaException_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "ReservaException");
    private final static QName _EditReserva_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "editReserva");
    private final static QName _FindHotelByIdResponse_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findHotelByIdResponse");
    private final static QName _FindAllHotel_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findAllHotel");
    private final static QName _FindReservaById_QNAME = new QName("http://ws.hotel.soap.dijalmasilva.com.br/", "findReservaById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.dijalmasilva.soap.hotel.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteHotelResponse }
     * 
     */
    public DeleteHotelResponse createDeleteHotelResponse() {
        return new DeleteHotelResponse();
    }

    /**
     * Create an instance of {@link DeleteReserva }
     * 
     */
    public DeleteReserva createDeleteReserva() {
        return new DeleteReserva();
    }

    /**
     * Create an instance of {@link EditHotelResponse }
     * 
     */
    public EditHotelResponse createEditHotelResponse() {
        return new EditHotelResponse();
    }

    /**
     * Create an instance of {@link SaveHotel }
     * 
     */
    public SaveHotel createSaveHotel() {
        return new SaveHotel();
    }

    /**
     * Create an instance of {@link SaveReservaResponse }
     * 
     */
    public SaveReservaResponse createSaveReservaResponse() {
        return new SaveReservaResponse();
    }

    /**
     * Create an instance of {@link EditHotel }
     * 
     */
    public EditHotel createEditHotel() {
        return new EditHotel();
    }

    /**
     * Create an instance of {@link EditReservaResponse }
     * 
     */
    public EditReservaResponse createEditReservaResponse() {
        return new EditReservaResponse();
    }

    /**
     * Create an instance of {@link FindHotelById }
     * 
     */
    public FindHotelById createFindHotelById() {
        return new FindHotelById();
    }

    /**
     * Create an instance of {@link FindReservaById }
     * 
     */
    public FindReservaById createFindReservaById() {
        return new FindReservaById();
    }

    /**
     * Create an instance of {@link FindAllHotel }
     * 
     */
    public FindAllHotel createFindAllHotel() {
        return new FindAllHotel();
    }

    /**
     * Create an instance of {@link ReservaException }
     * 
     */
    public ReservaException createReservaException() {
        return new ReservaException();
    }

    /**
     * Create an instance of {@link EditReserva }
     * 
     */
    public EditReserva createEditReserva() {
        return new EditReserva();
    }

    /**
     * Create an instance of {@link FindHotelByIdResponse }
     * 
     */
    public FindHotelByIdResponse createFindHotelByIdResponse() {
        return new FindHotelByIdResponse();
    }

    /**
     * Create an instance of {@link FindReservaByIdResponse }
     * 
     */
    public FindReservaByIdResponse createFindReservaByIdResponse() {
        return new FindReservaByIdResponse();
    }

    /**
     * Create an instance of {@link FindAllHotelResponse }
     * 
     */
    public FindAllHotelResponse createFindAllHotelResponse() {
        return new FindAllHotelResponse();
    }

    /**
     * Create an instance of {@link DeleteReservaResponse }
     * 
     */
    public DeleteReservaResponse createDeleteReservaResponse() {
        return new DeleteReservaResponse();
    }

    /**
     * Create an instance of {@link DeleteHotel }
     * 
     */
    public DeleteHotel createDeleteHotel() {
        return new DeleteHotel();
    }

    /**
     * Create an instance of {@link SaveReserva }
     * 
     */
    public SaveReserva createSaveReserva() {
        return new SaveReserva();
    }

    /**
     * Create an instance of {@link FindAllReservaResponse }
     * 
     */
    public FindAllReservaResponse createFindAllReservaResponse() {
        return new FindAllReservaResponse();
    }

    /**
     * Create an instance of {@link FindAllReserva }
     * 
     */
    public FindAllReserva createFindAllReserva() {
        return new FindAllReserva();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link SaveHotelResponse }
     * 
     */
    public SaveHotelResponse createSaveHotelResponse() {
        return new SaveHotelResponse();
    }

    /**
     * Create an instance of {@link Reserva }
     * 
     */
    public Reserva createReserva() {
        return new Reserva();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findAllHotelResponse")
    public JAXBElement<FindAllHotelResponse> createFindAllHotelResponse(FindAllHotelResponse value) {
        return new JAXBElement<FindAllHotelResponse>(_FindAllHotelResponse_QNAME, FindAllHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindReservaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findReservaByIdResponse")
    public JAXBElement<FindReservaByIdResponse> createFindReservaByIdResponse(FindReservaByIdResponse value) {
        return new JAXBElement<FindReservaByIdResponse>(_FindReservaByIdResponse_QNAME, FindReservaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findAllReserva")
    public JAXBElement<FindAllReserva> createFindAllReserva(FindAllReserva value) {
        return new JAXBElement<FindAllReserva>(_FindAllReserva_QNAME, FindAllReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findAllReservaResponse")
    public JAXBElement<FindAllReservaResponse> createFindAllReservaResponse(FindAllReservaResponse value) {
        return new JAXBElement<FindAllReservaResponse>(_FindAllReservaResponse_QNAME, FindAllReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "deleteHotel")
    public JAXBElement<DeleteHotel> createDeleteHotel(DeleteHotel value) {
        return new JAXBElement<DeleteHotel>(_DeleteHotel_QNAME, DeleteHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "saveReserva")
    public JAXBElement<SaveReserva> createSaveReserva(SaveReserva value) {
        return new JAXBElement<SaveReserva>(_SaveReserva_QNAME, SaveReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "deleteReservaResponse")
    public JAXBElement<DeleteReservaResponse> createDeleteReservaResponse(DeleteReservaResponse value) {
        return new JAXBElement<DeleteReservaResponse>(_DeleteReservaResponse_QNAME, DeleteReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "saveHotelResponse")
    public JAXBElement<SaveHotelResponse> createSaveHotelResponse(SaveHotelResponse value) {
        return new JAXBElement<SaveHotelResponse>(_SaveHotelResponse_QNAME, SaveHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "reserva")
    public JAXBElement<Reserva> createReserva(Reserva value) {
        return new JAXBElement<Reserva>(_Reserva_QNAME, Reserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "editHotelResponse")
    public JAXBElement<EditHotelResponse> createEditHotelResponse(EditHotelResponse value) {
        return new JAXBElement<EditHotelResponse>(_EditHotelResponse_QNAME, EditHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "deleteReserva")
    public JAXBElement<DeleteReserva> createDeleteReserva(DeleteReserva value) {
        return new JAXBElement<DeleteReserva>(_DeleteReserva_QNAME, DeleteReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "deleteHotelResponse")
    public JAXBElement<DeleteHotelResponse> createDeleteHotelResponse(DeleteHotelResponse value) {
        return new JAXBElement<DeleteHotelResponse>(_DeleteHotelResponse_QNAME, DeleteHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "saveHotel")
    public JAXBElement<SaveHotel> createSaveHotel(SaveHotel value) {
        return new JAXBElement<SaveHotel>(_SaveHotel_QNAME, SaveHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHotelById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findHotelById")
    public JAXBElement<FindHotelById> createFindHotelById(FindHotelById value) {
        return new JAXBElement<FindHotelById>(_FindHotelById_QNAME, FindHotelById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "editHotel")
    public JAXBElement<EditHotel> createEditHotel(EditHotel value) {
        return new JAXBElement<EditHotel>(_EditHotel_QNAME, EditHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "editReservaResponse")
    public JAXBElement<EditReservaResponse> createEditReservaResponse(EditReservaResponse value) {
        return new JAXBElement<EditReservaResponse>(_EditReservaResponse_QNAME, EditReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveReservaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "saveReservaResponse")
    public JAXBElement<SaveReservaResponse> createSaveReservaResponse(SaveReservaResponse value) {
        return new JAXBElement<SaveReservaResponse>(_SaveReservaResponse_QNAME, SaveReservaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "ReservaException")
    public JAXBElement<ReservaException> createReservaException(ReservaException value) {
        return new JAXBElement<ReservaException>(_ReservaException_QNAME, ReservaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditReserva }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "editReserva")
    public JAXBElement<EditReserva> createEditReserva(EditReserva value) {
        return new JAXBElement<EditReserva>(_EditReserva_QNAME, EditReserva.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHotelByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findHotelByIdResponse")
    public JAXBElement<FindHotelByIdResponse> createFindHotelByIdResponse(FindHotelByIdResponse value) {
        return new JAXBElement<FindHotelByIdResponse>(_FindHotelByIdResponse_QNAME, FindHotelByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findAllHotel")
    public JAXBElement<FindAllHotel> createFindAllHotel(FindAllHotel value) {
        return new JAXBElement<FindAllHotel>(_FindAllHotel_QNAME, FindAllHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindReservaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.soap.dijalmasilva.com.br/", name = "findReservaById")
    public JAXBElement<FindReservaById> createFindReservaById(FindReservaById value) {
        return new JAXBElement<FindReservaById>(_FindReservaById_QNAME, FindReservaById.class, null, value);
    }

}
