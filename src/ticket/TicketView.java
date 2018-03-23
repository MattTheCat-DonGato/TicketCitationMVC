/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;

/**
 *
 * @author Matthew Rodriguez
 * Date: March 23, 2018
 */
public class TicketView extends GridPane
{
    private Label titleLabel = new Label("Parking Ticket Citation");    
    private Label licenseLabel = new Label("Enter License Number");
    private TextField licenseTF = new TextField();   
    private Label stateLabel = new Label("Enter State");
    private TextField stateTF = new TextField();
    private Label permitLabel = new Label("Enter Permit Number");
    private TextField permitTF =new TextField();
    private Label vehiclemodelLabel = new Label("Enter Vehicle Model");
    private TextField vmTF = new TextField();  
    private Label violationLabel = new Label("Enter the Violation for Ticket");
    private TextField violationTF = new TextField();  
    private Label colorLabel = new Label("Enter Color of Vehicle");
    private TextField colorTF = new TextField();  
    private Label timeLabel = new Label("Enter Time of Violation");
    private TextField timeTF = new TextField();  
    private Label dateLabel = new Label("Enter Date of Violation");
    private TextField dateTF = new TextField();    
    private Label locationLabel = new Label("Enter Location of Violation");
    private TextField locationTF = new TextField();   
    private Label issuedbyLabel = new Label("Enter Name who Issued Ticket");
    private TextField issuedbyTF = new TextField();  
    private Label paymentLabel = new Label("Enter Payment Information");
    private TextField paymentTF = new TextField();
    
    Label copyright = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nStore Current Ticket will store the ticket data in Current Ticket Information into a file.\nStore All Tickets will grab all the tickets in the database and store them into a file.\nRead Ticket Data will go through the file of Tickets.dat and display them in the TextArea.\nExit Program will end the session.");
    Label copyright2 = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nExit Program will end the session.\nThis Graphic User Interface is written for UTRGV Purposes only.\nAll Copyrights Reserved\nThe list is empty. Try adding data first then click on Submit Ticket Data then Next.");
    
    private Button paidbtn = new Button("Toggle Paid/Unpaid");
    private Button addbtn = new Button("Submit Ticket Data");
    private Button lastBtn = new Button("<-- Previous");
    private Button nextBtn = new Button("--> Next");
    private Button storeBtn = new Button("Store Current Ticket");
    private Button storeallBtn = new Button("Store All Tickets");
    private Button readDataBtn = new Button("Read Ticket File");
    private Button exitbtn = new Button("Exit Program");
    
    private Label ticketInfoDisplay = new Label("Current Ticket Information");
    private TextArea ticketinformation = new TextArea(); 
   
    /**
     * @return the titleLabel
     */
    public Label getTitleLabel() {
        return titleLabel;
    }

    /**
     * @param titleLabel the titleLabel to set
     */
    public void setTitleLabel(Label titleLabel) {
        this.titleLabel = titleLabel;
    }

    /**
     * @return the licenseLabel
     */
    public Label getLicenseLabel() {
        return licenseLabel;
    }

    /**
     * @param licenseLabel the licenseLabel to set
     */
    public void setLicenseLabel(Label licenseLabel) {
        this.licenseLabel = licenseLabel;
    }

    /**
     * @return the licenseTF
     */
    public TextField getLicenseTF() {
        return licenseTF;
    }

    /**
     * @param licenseTF the licenseTF to set
     */
    public void setLicenseTF(TextField licenseTF) {
        this.licenseTF = licenseTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the permitLabel
     */
    public Label getPermitLabel() {
        return permitLabel;
    }

    /**
     * @param permitLabel the permitLabel to set
     */
    public void setPermitLabel(Label permitLabel) {
        this.permitLabel = permitLabel;
    }

    /**
     * @return the permitTF
     */
    public TextField getPermitTF() {
        return permitTF;
    }

    /**
     * @param permitTF the permitTF to set
     */
    public void setPermitTF(TextField permitTF) {
        this.permitTF = permitTF;
    }

    /**
     * @return the vehiclemodelLabel
     */
    public Label getVehiclemodelLabel() {
        return vehiclemodelLabel;
    }

    /**
     * @param vehiclemodelLabel the vehiclemodelLabel to set
     */
    public void setVehiclemodelLabel(Label vehiclemodelLabel) {
        this.vehiclemodelLabel = vehiclemodelLabel;
    }

    /**
     * @return the vmTF
     */
    public TextField getVmTF() {
        return vmTF;
    }

    /**
     * @param vmTF the vmTF to set
     */
    public void setVmTF(TextField vmTF) {
        this.vmTF = vmTF;
    }

    /**
     * @return the violationLabel
     */
    public Label getViolationLabel() {
        return violationLabel;
    }

    /**
     * @param violationLabel the violationLabel to set
     */
    public void setViolationLabel(Label violationLabel) {
        this.violationLabel = violationLabel;
    }

    /**
     * @return the violationTF
     */
    public TextField getViolationTF() {
        return violationTF;
    }

    /**
     * @param violationTF the violationTF to set
     */
    public void setViolationTF(TextField violationTF) {
        this.violationTF = violationTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel() {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel() {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the dateLabel
     */
    public Label getDateLabel() {
        return dateLabel;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(Label dateLabel) {
        this.dateLabel = dateLabel;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF() {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF) {
        this.dateTF = dateTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel() {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the issuedbyLabel
     */
    public Label getIssuedbyLabel() {
        return issuedbyLabel;
    }

    /**
     * @param issuedbyLabel the issuedbyLabel to set
     */
    public void setIssuedbyLabel(Label issuedbyLabel) {
        this.issuedbyLabel = issuedbyLabel;
    }

    /**
     * @return the issuedbyTF
     */
    public TextField getIssuedbyTF() {
        return issuedbyTF;
    }

    /**
     * @param issuedbyTF the issuedbyTF to set
     */
    public void setIssuedbyTF(TextField issuedbyTF) {
        this.issuedbyTF = issuedbyTF;
    }

    /**
     * @return the paymentLabel
     */
    public Label getPaymentLabel() {
        return paymentLabel;
    }

    /**
     * @param paymentLabel the paymentLabel to set
     */
    public void setPaymentLabel(Label paymentLabel) {
        this.paymentLabel = paymentLabel;
    }

    /**
     * @return the paymentTF
     */
    public TextField getPaymentTF() {
        return paymentTF;
    }

    /**
     * @param paymentTF the paymentTF to set
     */
    public void setPaymentTF(TextField paymentTF) {
        this.paymentTF = paymentTF;
    }

    /**
     * @return the paidbtn
     */
    public Button getPaidbtn() {
        return paidbtn;
    }

    /**
     * @param paidbtn the paidbtn to set
     */
    public void setPaidbtn(Button paidbtn) {
        this.paidbtn = paidbtn;
    }

    /**
     * @return the addbtn
     */
    public Button getAddbtn() {
        return addbtn;
    }

    /**
     * @param addbtn the addbtn to set
     */
    public void setAddbtn(Button addbtn) {
        this.addbtn = addbtn;
    }

    /**
     * @return the lastBtn
     */
    public Button getLastBtn() {
        return lastBtn;
    }

    /**
     * @param lastBtn the lastBtn to set
     */
    public void setLastBtn(Button lastBtn) {
        this.lastBtn = lastBtn;
    }

    /**
     * @return the nextBtn
     */
    public Button getNextBtn() {
        return nextBtn;
    }

    /**
     * @param nextBtn the nextBtn to set
     */
    public void setNextBtn(Button nextBtn) {
        this.nextBtn = nextBtn;
    }

    /**
     * @return the exitbtn
     */
    public Button getExitbtn() {
        return exitbtn;
    }

    /**
     * @param exitbtn the exitbtn to set
     */
    public void setExitbtn(Button exitbtn) {
        this.exitbtn = exitbtn;
    }

    /**
     * @return the ticketInfoDisplay
     */
    public Label getTicketInfoDisplay() {
        return ticketInfoDisplay;
    }

    /**
     * @param ticketInfoDisplay the ticketInfoDisplay to set
     */
    public void setTicketInfoDisplay(Label ticketInfoDisplay) {
        this.ticketInfoDisplay = ticketInfoDisplay;
    }

    /**
     * @return the ticketinformation
     */
    public TextArea getTicketinformation() {
        return ticketinformation;
    }

    /**
     * @param ticketinformation the ticketinformation to set
     */
    public void setTicketinformation(TextArea ticketinformation) {
        this.ticketinformation = ticketinformation;
    }
    
    
    /**
     * @return the storeBtn
     */
    public Button getStoreBtn() {
        return storeBtn;
    }

    /**
     * @param storeBtn the storeBtn to set
     */
    public void setStoreBtn(Button storeBtn) {
        this.storeBtn = storeBtn;
    }

    /**
     * @return the storeallBtn
     */
    public Button getStoreallBtn() {
        return storeallBtn;
    }

    /**
     * @param storeallBtn the storeallBtn to set
     */
    public void setStoreallBtn(Button storeallBtn) {
        this.storeallBtn = storeallBtn;
    }

    /**
     * @return the readDataBtn
     */
    public Button getReadDataBtn() {
        return readDataBtn;
    }

    /**
     * @param readDataBtn the readDataBtn to set
     */
    public void setReadDataBtn(Button readDataBtn) {
        this.readDataBtn = readDataBtn;
    }

    /**
     * Removes all of the text inserted into the TextFields.
     * It is called when the Submit Data button has been pressed. 
     */
    public void clearFields()
    {
        licenseTF.clear();
        stateTF.clear();
        permitTF.clear();
        vmTF.clear();
        violationTF.clear();
        colorTF.clear();
        timeTF.clear();
        dateTF.clear();
        locationTF.clear();
        issuedbyTF.clear();
        paymentTF.clear();
    }
       /**
        * Main GUI Startup.
        */
    public TicketView()
    {
                titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(titleLabel, 0, 0);
                copyright.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
                this.add(copyright, 0, 1);
                this.add(licenseLabel, 0, 2);
                this.addColumn(0,licenseTF,stateLabel,stateTF,permitLabel,permitTF,vehiclemodelLabel,vmTF,violationLabel,violationTF,colorLabel,colorTF,timeLabel,timeTF,dateLabel,dateTF,locationLabel,locationTF,issuedbyLabel,issuedbyTF,paymentLabel,paymentTF);
                this.add(addbtn,3,3);
                this.add(nextBtn,3,4);
                this.add(lastBtn,3,5);
                this.add(paidbtn,3,6);
                this.add(storeBtn,3,7);
                this.add(storeallBtn,3,8);
                this.add(readDataBtn,3,9);
                this.add(exitbtn,3,10);
                ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(ticketInfoDisplay,3,0);
                this.add(ticketinformation,3,1);
                this.setAlignment(Pos.CENTER);
    }
    
    /**
     * This function is only called when there is no ticket database is currently empty.
     */
     public void TicketViewNoDataBase()
    {
                this.getChildren().clear();
                titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(titleLabel, 0, 0);
                copyright2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
                this.add(copyright2, 0, 1);
                this.add(licenseLabel, 0, 2);
                this.addColumn(0,licenseTF,stateLabel,stateTF,permitLabel,permitTF,vehiclemodelLabel,vmTF,violationLabel,violationTF,colorLabel,colorTF,timeLabel,timeTF,dateLabel,dateTF,locationLabel,locationTF,issuedbyLabel,issuedbyTF,paymentLabel,paymentTF);
                this.add(addbtn,3,3);
                this.add(nextBtn,3,4);
                this.add(lastBtn,3,5);
                this.add(paidbtn,3,6);
                this.add(storeBtn,3,7);
                this.add(storeallBtn,3,8);
                this.add(readDataBtn,3,9);
                this.add(exitbtn,3,10);
                ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(ticketInfoDisplay,3,0);
                this.add(ticketinformation,3,1);
                this.setAlignment(Pos.CENTER);
    }
     
    /**
     * This function passes in a Ticket object as a parameter and displays the object's strings into a TextArea.
     * It also checks if the object's paidTicket variable is true or false and updates a string whether the ticket has been paid. 
     * @param currentTicket The current ticket going to be displayed on the TextArea
     */
    public void TicketViewUpdate(Ticket currentTicket)
    {
    String licenseNo = currentTicket.getLicenseNo();
    String state = currentTicket.getState();
    String permitNo = currentTicket.getPermitNo();
    String vehicleModel= currentTicket.getVehicleModel();
    String violation = currentTicket.getViolation();
    String color = currentTicket.getColor();
    String date = currentTicket.getDate();
    String time = currentTicket.getTime();
    String location = currentTicket.getLocation();
    String issuedBy = currentTicket.getIssuedBy();
    String paymentInfo = currentTicket.getPaymentInfo();
    boolean paidticket = currentTicket.isPaidticket();
    String pt = "";
    
    if(paidticket == false)
    {
       pt = "Ticket has not been paid."; 
    }
    else
    {
       pt = "Ticket has been paid.";
    }
    String info = "License Number: " + licenseNo + "\nState: " + state + "\nPermit Number: " + permitNo + "\nVehicle Model: " + vehicleModel + "\nViolation: " + violation + "\nColor of Vehicle: " + color + "\nDate of Violation: " + date + "\nTime of Violation: " + time + "\nLocation: " + location + "\nTicket Issued By: " + issuedBy + "\nPayment Information: " + paymentInfo + "\n" + pt;

                this.getChildren().clear();
                titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(titleLabel, 0, 0);
                copyright.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
                this.add(copyright, 0, 1);
                this.add(licenseLabel, 0, 2);
                this.addColumn(0,licenseTF,stateLabel,stateTF,permitLabel,permitTF,vehiclemodelLabel,vmTF,violationLabel,violationTF,colorLabel,colorTF,timeLabel,timeTF,dateLabel,dateTF,locationLabel,locationTF,issuedbyLabel,issuedbyTF,paymentLabel,paymentTF);
                this.add(addbtn,3,3);
                this.add(nextBtn,3,4);
                this.add(lastBtn,3,5);
                this.add(paidbtn,3,6);
                this.add(storeBtn,3,7);
                this.add(storeallBtn,3,8);
                this.add(readDataBtn,3,9);
                this.add(exitbtn,3,10);
                ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(ticketInfoDisplay,3,0);
                ticketinformation.setText(info);
                this.add(ticketinformation,3,1);
                this.setAlignment(Pos.CENTER);      
    }    

    /**
     * This function takes in an ArrayList of Tickets called currentTickets and loops through each object printing 
     * out the strings in the text area until the last object's strings are printed. If the paidticket variable is true 
     * then the variable pt will equal: "Ticket has been paid." otherwise it will equal: "Ticket has not been paid.
     * @param currentTickets The ArrayList of Tickets stored in the program
     */
    public void TicketViewUpdateAll(ArrayList<Ticket> currentTickets) 
    {
    String licenseNo;
    String state;
    String permitNo;
    String vehicleModel;
    String violation;
    String color;
    String date;
    String time;
    String location;
    String issuedBy;
    String paymentInfo;
    Boolean paidticket;
    String pt = "";
    String allTickets = "";
    
    for (int i = 0; i < currentTickets.size(); i++)
    {
        Ticket current = (Ticket) currentTickets.get(i);
        licenseNo = current.getLicenseNo();
        state = current.getState();
        permitNo = current.getPermitNo();
        vehicleModel = current.getVehicleModel();
        violation = current.getViolation();
        color = current.getColor();
        date = current.getDate();
        time = current.getTime();
        location = current.getLocation();
        issuedBy = current.getIssuedBy();
        paymentInfo = current.getPaymentInfo();
        paidticket = current.isPaidticket();
        if(paidticket == false)
            pt = "Ticket has not been paid."; 
        else
            pt = "Ticket has been paid.";
        
        allTickets += "License Number: " + licenseNo + "\nState: " + state + "\nPermit Number: " + permitNo + "\nVehicle Model: " + vehicleModel + "\nViolation: " + violation + "\nColor of Vehicle: " + color + "\nDate of Violation: " + date + "\nTime of Violation: " + time + "\nLocation: " + location + "\nTicket Issued By: " + issuedBy + "\nPayment Information: " + paymentInfo + "\n" + pt + "\n";
    }
    
                this.getChildren().clear();
                titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(titleLabel, 0, 0);
                copyright.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR,20));
                this.add(copyright, 0, 1);
                this.add(licenseLabel, 0, 2);
                this.addColumn(0,licenseTF,stateLabel,stateTF,permitLabel,permitTF,vehiclemodelLabel,vmTF,violationLabel,violationTF,colorLabel,colorTF,timeLabel,timeTF,dateLabel,dateTF,locationLabel,locationTF,issuedbyLabel,issuedbyTF,paymentLabel,paymentTF);
                this.add(addbtn,3,3);
                this.add(nextBtn,3,4);
                this.add(lastBtn,3,5);
                this.add(paidbtn,3,6);
                this.add(storeBtn,3,7);
                this.add(storeallBtn,3,8);
                this.add(readDataBtn,3,9);
                this.add(exitbtn,3,10);
                ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,40));
                this.add(ticketInfoDisplay,3,0);
                ticketinformation.setText(allTickets);
                this.add(ticketinformation,3,1);
                this.setAlignment(Pos.CENTER);
    }
}