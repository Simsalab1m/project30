/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2;

/**
 *
 * @author Justin Reichard
 */
public class BikePart {
    //6 fields
    private String PartName;
    private int PartNumber;
    private double ListPrice;
    private double SalePrice;
    private boolean OnSale;
    private int Quantity;
    


    /**
     *
     * @param setPartName - sets part name
     * @param setPartNumber - sets part number
     * @param setListPrice - sets list price
     * @param setSalePrice - sets sale price
     * @param setOnSale - sets if on sale or not
     * @param setQuantity - sets quantity
     */
    public BikePart(String setPartName,int setPartNumber, double setListPrice, double setSalePrice, boolean setOnSale, int setQuantity) {
        PartName = setPartName;
        PartNumber = setPartNumber;
        ListPrice = setListPrice;
        SalePrice = setSalePrice;
        OnSale = setOnSale;
        Quantity = setQuantity;
        
    }
    
    public double getPrice(){
        return ListPrice;
    }

    /**
     * getPrice - gets price
     * toString - turns BikePart Array into a readable string
     * @return
     */
    public String toString(){
        return PartName + " " + " " + PartNumber + " " + ListPrice + " " + SalePrice + " " + OnSale + " " + Quantity;
    }
}
