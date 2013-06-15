
package org.um.userwsdl;

import org.um.model.Role;
import org.um.model.User;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.org.um.userwsdl package.
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

    private final static QName _EmailAlreadyTakenException_QNAME = new QName("http://um.org/userwsdl", "EmailAlreadyTakenException");
    private final static QName _LoginResponse_QNAME = new QName("http://um.org/userwsdl", "loginResponse");
    private final static QName _Update_QNAME = new QName("http://um.org/userwsdl", "update");
    private final static QName _InvalidPasswordException_QNAME = new QName("http://um.org/userwsdl", "InvalidPasswordException");
    private final static QName _InvalidEmailException_QNAME = new QName("http://um.org/userwsdl", "InvalidEmailException");
    private final static QName _PermissionDeniedException_QNAME = new QName("http://um.org/userwsdl", "PermissionDeniedException");
    private final static QName _RegisterResponse_QNAME = new QName("http://um.org/userwsdl", "registerResponse");
    private final static QName _Login_QNAME = new QName("http://um.org/userwsdl", "login");
    private final static QName _Delete_QNAME = new QName("http://um.org/userwsdl", "delete");
    private final static QName _UpdateResponse_QNAME = new QName("http://um.org/userwsdl", "updateResponse");
    private final static QName _InvalidUserException_QNAME = new QName("http://um.org/userwsdl", "InvalidUserException");
    private final static QName _InvalidTokenException_QNAME = new QName("http://um.org/userwsdl", "InvalidTokenException");
    private final static QName _DeleteResponse_QNAME = new QName("http://um.org/userwsdl", "deleteResponse");
    private final static QName _Register_QNAME = new QName("http://um.org/userwsdl", "register");
    private final static QName _InvalidRoleException_QNAME = new QName("http://um.org/userwsdl", "InvalidRoleException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.org.um.userwsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link org.um.model.User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link InvalidTokenException }
     * 
     */
    public InvalidTokenException createInvalidTokenException() {
        return new InvalidTokenException();
    }

    /**
     * Create an instance of {@link InvalidRoleException }
     * 
     */
    public InvalidRoleException createInvalidRoleException() {
        return new InvalidRoleException();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link org.um.model.Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link PermissionDeniedException }
     * 
     */
    public PermissionDeniedException createPermissionDeniedException() {
        return new PermissionDeniedException();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link EmailAlreadyTakenException }
     * 
     */
    public EmailAlreadyTakenException createEmailAlreadyTakenException() {
        return new EmailAlreadyTakenException();
    }

    /**
     * Create an instance of {@link InvalidEmailException }
     * 
     */
    public InvalidEmailException createInvalidEmailException() {
        return new InvalidEmailException();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link InvalidUserException }
     * 
     */
    public InvalidUserException createInvalidUserException() {
        return new InvalidUserException();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link InvalidPasswordException }
     * 
     */
    public InvalidPasswordException createInvalidPasswordException() {
        return new InvalidPasswordException();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link EmailAlreadyTakenException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "EmailAlreadyTakenException")
    public JAXBElement<EmailAlreadyTakenException> createEmailAlreadyTakenException(EmailAlreadyTakenException value) {
        return new JAXBElement<EmailAlreadyTakenException>(_EmailAlreadyTakenException_QNAME, EmailAlreadyTakenException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Update }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidPasswordException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "InvalidPasswordException")
    public JAXBElement<InvalidPasswordException> createInvalidPasswordException(InvalidPasswordException value) {
        return new JAXBElement<InvalidPasswordException>(_InvalidPasswordException_QNAME, InvalidPasswordException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidEmailException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "InvalidEmailException")
    public JAXBElement<InvalidEmailException> createInvalidEmailException(InvalidEmailException value) {
        return new JAXBElement<InvalidEmailException>(_InvalidEmailException_QNAME, InvalidEmailException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link PermissionDeniedException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "PermissionDeniedException")
    public JAXBElement<PermissionDeniedException> createPermissionDeniedException(PermissionDeniedException value) {
        return new JAXBElement<PermissionDeniedException>(_PermissionDeniedException_QNAME, PermissionDeniedException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Login }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Delete }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidUserException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "InvalidUserException")
    public JAXBElement<InvalidUserException> createInvalidUserException(InvalidUserException value) {
        return new JAXBElement<InvalidUserException>(_InvalidUserException_QNAME, InvalidUserException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidTokenException }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "InvalidTokenException")
    public JAXBElement<InvalidTokenException> createInvalidTokenException(InvalidTokenException value) {
        return new JAXBElement<InvalidTokenException>(_InvalidTokenException_QNAME, InvalidTokenException.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Register }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InvalidRoleException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://um.org/userwsdl", name = "InvalidRoleException")
    public JAXBElement<InvalidRoleException> createInvalidRoleException(InvalidRoleException value) {
        return new JAXBElement<InvalidRoleException>(_InvalidRoleException_QNAME, InvalidRoleException.class, null, value);
    }

}
