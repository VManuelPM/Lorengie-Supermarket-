/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Asus
 */
public class DetailBill {
    private int idDetailBill;
    private String product;
    private String quantity;
    private int salePrice;
    private int totalValue; 
    private String saleType;

    /**
     * Default constructor
     */
    public DetailBill() {
    }
    /**
     * Get idDetailBill
     * @return idDetailBill
     */
    public int getIdDetailBill() {
        return idDetailBill;
    }
    /**
     * Set idDetailBill
     * @param idDetailBill idDetailBill
     */
    public void setIdDetailBill(int idDetailBill) {
        this.idDetailBill = idDetailBill;
    }
    /**
     * Get product
     * @return product
     */
    public String getProduct() {
        return product;
    }
    /**
     * Set product
     * @param product product
     */
    public void setProduct(String product) {
        this.product = product;
    }
    /**
     * Get quantity
     * @return quantity
     */
    public String getQuantity() {
        return quantity;
    }
    /**
     * Set quantity
     * @param quantity quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    /**
     * Get salePrice
     * @return salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }
    /**
     * Set salePrice
     * @param salePrice salePrice
     */
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
    /**
     * Get totalValue
     * @return totalValue
     */
    public double getTotalValue() {
        return totalValue;
    }
    /**
     * Set totalValue
     * @param totalValue totalValue
     */
    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
    /**
     * Get saleType
     * @return saleType
     */
    public String getSaleType() {
        return saleType;
    }
    /**
     * Set saleType
     * @param saleType saleType
     */
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }
    
    
    
    
}