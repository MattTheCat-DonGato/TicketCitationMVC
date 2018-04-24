package ticket;

/**
 *
 * @author Matthew Rodriguez
 * Date: February, 23, 2018
 * Revision Date: April 9, 2018
 */
public class Ticket 
{ 
    private int licenseNo;
    private String state;
    private int permitNo;
    private String vehicleModel;
    private String violation;
    private String color;
    private String date;
    private String time;
    private String location;
    private String issuedBy;
    private String paymentInfo;
    private boolean paidticket;

    /**
     * This is an empty constructor for a Ticket object.
     */
    public Ticket()
    {    
    }
 
    /**
     * This is the main constructor where all the ticket data will be stored for one Ticket object. 
     * It takes in 12 parameters which are described below.
     * @param licenseNo The license number of the vehicle
     * @param state The state in which the ticket was issued
     * @param permitNo The permit number of the vehicle
     * @param vehicleModel The vehicle model brand
     * @param violation The reason for the ticket being issued
     * @param color The color of the vehicle
     * @param date The date when the ticket was issued
     * @param time The time when the ticket was issued
     * @param location The location of where the ticket was issued
     * @param issuedBy The person who issued the ticket
     * @param paymentInfo The location where payment must be made.
     * @param paidticket Checks if the ticket was paid or not (true if paid or false if not paid)
     */  
    public Ticket(int licenseNo, String state, int permitNo, String vehicleModel, String violation, String color, String date, String time, String location, String issuedBy, String paymentInfo, boolean paidticket) {
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
    public int getLicenseNo() {
        return licenseNo;
    }

    /**
     * @param licenseNo the licenseNo to set
     */
    public void setLicenseNo(int licenseNo) {
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
    public int getPermitNo() {
        return permitNo;
    }

    /**
     * @param permitNo the permitNo to set
     */
    public void setPermitNo(int permitNo) {
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
    public void setLocation(String location) 
    {
        this.location = location;
    }

    /**
     * @return the issuedBy
     */
    public String getIssuedBy() 
    {
        return issuedBy;
    }

    /**
     * @param issuedBy the issuedBy to set
     */
    public void setIssuedBy(String issuedBy) 
    {
        this.issuedBy = issuedBy;
    }

    /**
     * @return the violation
     */
    public String getViolation() 
    {
        return violation;
    }

    /**
     * @param violation the violation to set
     */
    public void setViolation(String violation) 
    {
        this.violation = violation;
    }

    /**
     * @return the paymentInfo
     */
    public String getPaymentInfo() 
    {
        return paymentInfo;
    }

    /**
     * @param paymentInfo the paymentInfo to set
     */
    public void setPaymentInfo(String paymentInfo) 
    {
        this.paymentInfo = paymentInfo;
    }

    /**
     * @return the paidticket
     */
    public boolean isPaidticket() 
    {
        return paidticket;
    }

    /**
     * @param paidticket the paidticket to set
     */
    public void setPaidticket(boolean paidticket) 
    {
        this.paidticket = paidticket;
    }
}