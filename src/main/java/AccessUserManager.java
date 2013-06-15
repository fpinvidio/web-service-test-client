import org.um.model.User;
import org.um.userwsdl.*;

/**
 * Created with IntelliJ IDEA.
 * User: marsh
 * Date: 6/14/13
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccessUserManager {

    UserManagerWebService userManagerWebService;

    public void registerUser(User user) {
        userManagerWebService= new UserManagerWebService();

        try {
            userManagerWebService.getUserManagerPort().register(user);
        } catch (EmailAlreadyTakenException_Exception e) {
            e.printStackTrace();
        } catch (InvalidEmailException_Exception e) {
            e.printStackTrace();
        } catch (InvalidPasswordException_Exception e) {
            e.printStackTrace();
        } catch (InvalidRoleException_Exception e) {
            e.printStackTrace();
        }
    }

    public void loginUser(User user){
        userManagerWebService= new UserManagerWebService();
            try {
                userManagerWebService.getUserManagerPort().login(user);
            } catch (InvalidUserException_Exception e) {
                e.printStackTrace();
            }
        }
}
