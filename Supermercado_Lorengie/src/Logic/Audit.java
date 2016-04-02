/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Date;

/**
 * Class audit
 * @author Estudiante
 */

public class Audit {
    private String process;
    private Date dateAudit;
    private String username;
    private int operationType;
/**
 * Default constructor
 */
    public Audit() {
    }
    /**
     * Contructor with parameters
     * @param process process
     * @param dateAudit date audit
     * @param username user name
     * @param operationType operation type
     */
    public Audit(String process, Date dateAudit, String username, int operationType) {
        this.process = process;
        this.dateAudit = dateAudit;
        this.username = username;
        this.operationType = operationType;
    }
/**
 * Get process 
 * @return process
 */
    public String getProcess() {
        return process;
    }
/**
 * Set process
 * @param process process 
 */
    public void setProcess(String process) {
        this.process = process;
    }
/**
 * Get date audit
 * @return date audit
 */
    public Date getDateAudit() {
        return dateAudit;
    }
/**
 * Set date audit
 * @param dateAudit date audit
 */
    public void setDateAudit(Date dateAudit) {
        this.dateAudit = dateAudit;
    }
/**
 * Get user name
 * @return user name
 */
    public String getUsername() {
        return username;
    }
/**
 * Set user name
 * @param username user name 
 */
    public void setUsername(String username) {
        this.username = username;
    }
/**
 * Get operation type
 * @return operation type
 */
    public int getOperationType() {
        return operationType;
    }
/**
 * Set operation type
 * @param operationType operation type 
 */
    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }
    
    
}
