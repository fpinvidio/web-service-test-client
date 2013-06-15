import org.um.model.Role;
import org.um.vendorwsdl.*;

/**

 */
public class AccessVendorManager {

        VendorManagerWebService vendorManagerWebService;

        public void uploadMovie(String Token, Role role, Movie movie) {
        vendorManagerWebService= new VendorManagerWebService();

        try {
            vendorManagerWebService.getVendorManagerPort().uploadMovie("UploadToken", role,movie);
        } catch (InvalidTokenException_Exception e) {
            e.printStackTrace();
        }
       }

        public void uploadClip(String Token, Role role, ClipData clipData){

        }

    }

