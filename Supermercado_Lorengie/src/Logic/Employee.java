/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class Employee
 * @author VP,NR,AA,AH
 */
public class Employee {
   private int employeeCode; /**Employee code*/
   private String employeeName; /**Employee name*/
   private int employeeIdentification; /**Employee identification*/
    private String employeePosition; /**Employee position*/
    private String userName; /**User for log in**/
    private String password; /**User for log in**/
    private String email; /**Email user**/ 


        /**
         * Default constructor
         */
    public Employee() {
    }
    
    /**
     * 
     * @param EmployeeCode employee code
     * @param EmployeePosition employee position
     * @param EmployeeName employee name
     * @param employeeIdentification employee identification
     * @param userName user for log in
     */
    public Employee(int EmployeeCode, String EmployeePosition, String EmployeeName, int employeeIdentification, String userName, String password,String email) {
        this.employeeCode = EmployeeCode;
        this.employeePosition = EmployeePosition;
        this.employeeName = EmployeeName;
        this.employeeIdentification = employeeIdentification;
        this.userName = userName;
        this.setPassword(password);
        this.password = password;
    }

    public String getPassword() {
        return this.password;
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
     * Get employee code
     * @return employee code
     */
    public int getEmployeeCode() {
        return employeeCode;
    }
    /**
     * Set employee code
     * @param employeeCode employee code
     */
    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }
    /**
     * Get employee position
     * @return employee position
     */
    public String getEmployeePosition() {
        return employeePosition;
    }
    /**
     * Set employee position
     * @param employeePosition employee position
     */

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }
    /**
     * Get employee name
     * @return employee name
     */

    public String getEmployeeName() {
        return employeeName;
    }
    /**
     * Set employee name
     * @param employeeName employee name
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    /**
     * Get employee identification
     * @return employee Identification
     */
    public int getEmployeeIdentification() {
        return employeeIdentification;
    }
    /**
     * Set employee identification
     * @param employeeIdentification employee identification
     */
    public void setEmployeeIdentification(int employeeIdentification) {
        this.employeeIdentification = employeeIdentification;
    }
    /**
     * Get user for log in
     * @return user
     */
    public String getUserName() {
        return userName;
    }
    /**
     * Set user for log in
     * @param userName for log in
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
