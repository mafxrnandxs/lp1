/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoiceproject;

/**
 *
 * @author mafxr
 */
public class Invoice  {
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;
    
    public Invoice(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getPricePerItem() {
        return pricePerItem;
    }
    
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    
    public double getInvoiceAmount() {
        if (quantity < 0) {
            quantity = 0;
        }
        
        if (pricePerItem < 0.0) {
            pricePerItem = 0.0;
        }
        
        return quantity * pricePerItem;
    }
}
