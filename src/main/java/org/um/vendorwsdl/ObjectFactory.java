
package org.um.vendorwsdl;

import org.um.model.Role;
import org.um.model.User;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.org.um.vendorwsdl package.
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

    private final static QName _UploadClip_QNAME = new QName("http://um.org/vendorwsdl", "uploadClip");
    private final static QName _UploadAdResponse_QNAME = new QName("http://um.org/vendorwsdl", "uploadAdResponse");
    private final static QName _UploadMovie_QNAME = new QName("http://um.org/vendorwsdl", "uploadMovie");
    private final static QName _InvalidTokenException_QNAME = new QName("http://um.org/vendorwsdl", "InvalidTokenException");
    private final static QName _UploadMovieResponse_QNAME = new QName("http://um.org/vendorwsdl", "uploadMovieResponse");
    private final static QName _UploadAd_QNAME = new QName("http://um.org/vendorwsdl", "uploadAd");
    private final static QName _UploadClipResponse_QNAME = new QName("http://um.org/vendorwsdl", "uploadClipResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.org.um.vendorwsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvalidTokenException }
     * 
     */
    public InvalidTokenException createInvalidTokenException() {
        return new InvalidTokenException();
    }

    /**
     * Create an instance of {@link ClipData }
     * 
     */
    public ClipData createClipData() {
        return new ClipData();
    }

    /**
     * Create an instance of {@link UploadAd }
     * 
     */
    public UploadAd createUploadAd() {
        return new UploadAd();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UploadClipResponse }
     * 
     */
    public UploadClipResponse createUploadClipResponse() {
        return new UploadClipResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link UploadMovieResponse }
     * 
     */
    public UploadMovieResponse createUploadMovieResponse() {
        return new UploadMovieResponse();
    }

    /**
     * Create an instance of {@link License }
     * 
     */
    public License createLicense() {
        return new License();
    }

    /**
     * Create an instance of {@link Ad }
     * 
     */
    public Ad createAd() {
        return new Ad();
    }

    /**
     * Create an instance of {@link UploadClip }
     * 
     */
    public UploadClip createUploadClip() {
        return new UploadClip();
    }

    /**
     * Create an instance of {@link Clip }
     * 
     */
    public Clip createClip() {
        return new Clip();
    }

    /**
     * Create an instance of {@link UploadMovie }
     * 
     */
    public UploadMovie createUploadMovie() {
        return new UploadMovie();
    }

    /**
     * Create an instance of {@link UploadAdResponse }
     * 
     */
    public UploadAdResponse createUploadAdResponse() {
        return new UploadAdResponse();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UploadClip }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "uploadClip")
    public JAXBElement<UploadClip> createUploadClip(UploadClip value) {
        return new JAXBElement<UploadClip>(_UploadClip_QNAME, UploadClip.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UploadAdResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "uploadAdResponse")
    public JAXBElement<UploadAdResponse> createUploadAdResponse(UploadAdResponse value) {
        return new JAXBElement<UploadAdResponse>(_UploadAdResponse_QNAME, UploadAdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UploadMovie }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "uploadMovie")
    public JAXBElement<UploadMovie> createUploadMovie(UploadMovie value) {
        return new JAXBElement<UploadMovie>(_UploadMovie_QNAME, UploadMovie.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidTokenException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "InvalidTokenException")
    public JAXBElement<InvalidTokenException> createInvalidTokenException(InvalidTokenException value) {
        return new JAXBElement<InvalidTokenException>(_InvalidTokenException_QNAME, InvalidTokenException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UploadMovieResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "uploadMovieResponse")
    public JAXBElement<UploadMovieResponse> createUploadMovieResponse(UploadMovieResponse value) {
        return new JAXBElement<UploadMovieResponse>(_UploadMovieResponse_QNAME, UploadMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UploadAd }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "uploadAd")
    public JAXBElement<UploadAd> createUploadAd(UploadAd value) {
        return new JAXBElement<UploadAd>(_UploadAd_QNAME, UploadAd.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UploadClipResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.org/vendorwsdl", name = "uploadClipResponse")
    public JAXBElement<UploadClipResponse> createUploadClipResponse(UploadClipResponse value) {
        return new JAXBElement<UploadClipResponse>(_UploadClipResponse_QNAME, UploadClipResponse.class, null, value);
    }

}
