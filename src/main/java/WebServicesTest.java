import org.um.model.Role;
import org.um.model.User;
import org.um.vendorwsdl.Clip;
import org.um.vendorwsdl.License;
import org.um.vendorwsdl.Movie;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**

 */
public class WebServicesTest {

    public static void main(String[] args) {
    //RoleDao

    //Create Role
    Role testRole=new Role();
    testRole.setId(Long.valueOf(4));

    //Create User
    User testUser=new User();
    testUser.setName("marsha");
    testUser.setPassword("marsha");
    testUser.setEmail("marsha@gmail.com");
    testUser.setRole(testRole);

    //Create Clips
    Clip testClip=new Clip();
    testClip.setDuration(Long.valueOf(1000));
    testClip.setPosition(2);

    //Create Licenses
    License testLicense=new License();
    testLicense.setName("Lucas film license");
    testLicense.setAccepted(true);
    testLicense.setCostPerMinute(Long.valueOf(1));
    testLicense.setDescription("Lucas film summer licenses");
    testLicense.setMaxViews(Long.valueOf(1000000));
    testLicense.setPolicyId(Long.valueOf(1));

    GregorianCalendar gcal = new GregorianCalendar();
    try {
        XMLGregorianCalendar fec_start = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        XMLGregorianCalendar fec_end = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        String fecha_start = "2013-03-26";
        String fecha_end = "2013-08-26";
        String[] fec_start_part = fecha_start.split("-");
        String[] fec_end_part = fecha_end.split("-");
        fec_start.setYear(Integer.parseInt(fec_start_part[0]));
        fec_start.setMonth(Integer.parseInt(fec_start_part[1]));
        fec_start.setDay(Integer.parseInt(fec_start_part[2]));
        fec_end.setYear(Integer.parseInt(fec_end_part[0]));
        fec_end.setMonth(Integer.parseInt(fec_end_part[1]));
        fec_end.setDay(Integer.parseInt(fec_end_part[2]));
        testLicense.setStartDate(fec_start);
        testLicense.setEndDate(fec_end);

    } catch (DatatypeConfigurationException e) {
        e.printStackTrace();
    }

    //Create Movie
    Movie testMovie=new Movie();
    testMovie.setDuration(Long.valueOf(4800));
    List<String> castList=new ArrayList<String>();
    castList.add("Johnny Depp");
    castList.add("Orlando Bloom");
    castList.add("Geoffrey Rush");
    testMovie.setDirector("Gore Verbinski");
    testMovie.setEnabled(true);
    testMovie.setGenre("Adventure");
    testMovie.setTitle("Pirates of the Caribbean: The Curse of the Black Pearl");

    try {
        XMLGregorianCalendar fec = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        String fecha_actual = "2011-03-26";
        String[] fec_part = fecha_actual.split("-");
        fec.setYear(Integer.parseInt(fec_part[0]));
        fec.setMonth(Integer.parseInt(fec_part[1]));
        fec.setDay(Integer.parseInt(fec_part[2]));
        testMovie.setPremiereDate(fec);
    } catch (DatatypeConfigurationException e) {
        e.printStackTrace();
    }

    List <License> licenseList=testMovie.getLicenses();
    licenseList.add(testLicense);
    List <Clip> clipList=testMovie.getClips();
    clipList.add(testClip);


    AccessVendorManager accessVendorManager =new AccessVendorManager();
    AccessUserManager accessUserManager=new AccessUserManager();
    accessUserManager.registerUser(testUser);
    //accessVendorManager.uploadMovie("",testRole,testMovie);





    }
}
