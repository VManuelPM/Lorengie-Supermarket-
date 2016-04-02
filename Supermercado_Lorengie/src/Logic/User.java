package Logic;

import Interface.IntAdmin;
import Interface.IntDealer;
import Interface.IntHome;
import Interface.IntSeller;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * Class User
 * @author Asus
 */
public class User {
   private String userName; /*User name*/
   private String password; /*Password*/
   private String position; /*Position*/
   
   /**
    * Default constructor
    */
   public User() {
       
   }
   /**
    * Get user name
    * @return user name
    */
    public String getUserName() {
        return userName;
    }
    /**
     * Set user name
     * @param userName username
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * Get password
     * @return password
     */
    public String getPassword() {
        return this.password;
    }
/**
 * Set password
 * @param password password
 */
//    public void setPassword(String password) {
//        this.password = password;
//    }
    /**
     * Get position
     * @return position
     */
    public String getPosition() {
        return position;
    }
    /**
     * Set position
     * @param position position
     */
    public void setPosition(String position) {
        this.position = position;
    }
    
    
    
    public void setPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes(), 0, password.length());
            this.password = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
   /**
    * Method login
    * @param userName userName
    * @param position position 
    */
   public void login(String userName, String position){
       if(position.equals("Administrator")){
          IntAdmin openIntAdmin = new IntAdmin(); 
          openIntAdmin.setLabelUser(openIntAdmin.getLabelUser().getText()+this.userName);
          openIntAdmin.setVisible(true);
          openIntAdmin.setLocationRelativeTo(null);
      }
       if(position.equals("Seller")){
           IntSeller openIntSeller = new IntSeller();
          openIntSeller.setLabelUser(openIntSeller.getLabelUser().getText()+this.userName);
          openIntSeller.setVisible(true);
          openIntSeller.setLocationRelativeTo(null);
      }
       if(position.equals("Dealer")){
          IntDealer openIntDealer = new IntDealer(); 
          openIntDealer.setLabelUser(openIntDealer.getLabelUser().getText()+this.userName);
          openIntDealer.setVisible(true);
          openIntDealer.setLocationRelativeTo(null);
      }

   }
   /**
    * Method Logout
    * @param f JFrame
    */
   public void logOut(JFrame f) {
       IntHome openIntHome = new IntHome();
       f.setVisible(false);
       openIntHome.setLocationRelativeTo(null);
       openIntHome.setVisible(true);
   }
   
}
