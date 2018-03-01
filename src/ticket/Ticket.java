/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author Matthew Rodriguez
 * @date February, 23, 2018
 */
public class Ticket 
{ 
    private String licenseNo;
    private String state;
    private String permitNo;
    private String vehicleModel;
    private String violation;
    private String color;
    private String date;
    private String time;
    private String location;
    private String issuedBy;
    private String paymentInfo;
    private boolean paidticket;

    public Ticket()
    {    
    }
    
    public Ticket(String licenseNo, String state, String permitNo, String vehicleModel, String violation, String color, String date, String time, String location, String issuedBy, String paymentInfo, boolean paidticket) {
        this.licenseNo = licenseNo;
        this.state = state;
        this.permitNo = permitNo;
        this.vehicleModel = vehicleModel;
        this.violation = violation;
        this.color = color;
        this.date = date;
        this.time = time;
        this.location = location;
        this.issuedBy = issuedBy;
        this.paymentInfo = paymentInfo;
        this.paidticket = paidticket;
    }
    
    /**
     * @return the licenseNo
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo the licenseNo to set
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the permitNo
     */
    public String getPermitNo() {
        return permitNo;
    }

    /**
     * @param permitNo the permitNo to set
     */
    public void setPermitNo(String permitNo) {
        this.permitNo = permitNo;
    }

    /**
     * @return the vehicleModel
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * @param vehicleModel the vehicleModel to set
     */
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    /**
     * @return the violation
     */

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the issuedBy
     */
    public String getIssuedBy() {
        return issuedBy;
    }

    /**
     * @param issuedBy the issuedBy to set
     */
    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    /**
     * @return the violation
     */
    public String getViolation() {
        return violation;
    }

    /**
     * @param violation the violation to set
     */
    public void setViolation(String violation) {
        this.violation = violation;
    }

    /**
     * @return the paymentInfo
     */
    public String getPaymentInfo() {
        return paymentInfo;
    }

    /**
     * @param paymentInfo the paymentInfo to set
     */
    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /**
     * @return the paidticket
     */
    public boolean isPaidticket() {
        return paidticket;
    }

    /**
     * @param paidticket the paidticket to set
     */
    public void setPaidticket(boolean paidticket) {
        this.paidticket = paidticket;
    }

}
