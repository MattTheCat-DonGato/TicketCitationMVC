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
import javafx.scene.layout.VBox;

/**
 *
 * @author Matthew Rodriguez 
 * Date: March 23, 2018 
 * Revision Date: April 24, 2018
 */
public class TicketView extends GridPane
{

    private Label titleLabel = new Label("Parking Ticket Citation");
    private Label titleLabel2 = new Label("Parking Ticket Citation");
    private Label titleLabel3 = new Label("Parking Ticket Citation");
    private Label titleLabel4 = new Label("Parking Ticket Citation");
    private Label titleLabel5 = new Label("Parking Ticket Citation");
    private Label licenseLabel = new Label("Enter License Number");
    private TextField licenseTF = new TextField();
    private Label stateLabel = new Label("Enter State");
    private TextField stateTF = new TextField();
    private Label permitLabel = new Label("Enter Permit Number");
    private TextField permitTF = new TextField();
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

    Label copyright = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nRead from Local Database will grab all ticket data from MySQL and display it onto the TextArea.\nInsert Current Ticket to Database will store the current ticket displayed in Current Ticket Information into Database Schema in MySQL.\nExit Program will end the session.");
    Label copyright2 = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nRead from Local Database will grab all ticket data from MySQL and display it onto the TextArea.\nInsert Current Ticket to Database will store the current ticket displayed in Current Ticket Information into Database Schema in MySQL.\nExit Program will end the session.\nThe list is empty.\nTry adding data first into the TextFields then click on Submit Ticket Data then click Next.\nOr you can click on Read from Local Database to grab ticket data from MySQL.");
    Label copyright3 = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nRead from Local Database will grab all ticket data from MySQL and display it onto the TextArea.\nInsert Current Ticket to Database will store the current ticket displayed in Current Ticket Information into Database Schema in MySQL.\nExit Program will end the session.\nYou cannot insert the current ticket being displayed in Current Ticket Information into the Database.\nReason: Because of the license number is the primary key and it's already in the Database.");
    Label copyright4 = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nRead from Local Database will grab all ticket data from MySQL and display it onto the TextArea.\nInsert Current Ticket to Database will store the current ticket displayed in Current Ticket Information into Database Schema in MySQL.\nExit Program will end the session.\nYou cannot have an empty field for any of the TextFields.\nPlease fill each field with acceptable parameters then click the Submit Ticket Data.");
    Label copyright5 = new Label("Enter data into TextFields then press Submit Ticket Data.\nClick on Next or Previous to move through the tickets that have been added.\nToggle Paid/Unpaid will change if the ticket has been paid or not (TextArea will refresh).\nRead from Local Database will grab all ticket data from MySQL and display it onto the TextArea.\nInsert Current Ticket to Database will store the current ticket displayed in Current Ticket Information into Database Schema in MySQL.\nExit Program will end the session.\nYou must enter valid numbers in the License Number TextField and Permit Number TextField.");
    
    private Button paidbtn = new Button("Toggle Paid/Unpaid");
    private Button addbtn = new Button("Submit Ticket Data");
    private Button lastBtn = new Button("<-- Previous");
    private Button nextBtn = new Button("--> Next");
    private Button storeBtn = new Button("Store Current Ticket");
    private Button storeallBtn = new Button("Store All Tickets");
    private Button readDataBtn = new Button("Read Ticket File");
    private Button connDatabaseBtn = new Button("Read from Local Database");
    private Button insertToDatabaseBtn = new Button("Insert Current Ticket to Database");
    private Button exitbtn = new Button("Exit Program");

    private Label ticketInfoDisplay = new Label("Current Ticket Information");
    private TextArea ticketinformation = new TextArea();

    VBox labelTFvbox = new VBox(licenseLabel, licenseTF, stateLabel, stateTF, permitLabel, permitTF, vehiclemodelLabel, vmTF, violationLabel, violationTF, colorLabel, colorTF, timeLabel, timeTF, dateLabel, dateTF, locationLabel, locationTF, issuedbyLabel, issuedbyTF, paymentLabel, paymentTF);
    VBox titlevbox = new VBox(titleLabel, copyright);
    VBox titlenoListvbox = new VBox(titleLabel2, copyright2);
    VBox titlenoInsertvbox = new VBox(titleLabel3, copyright3);
    VBox titleemptyparamvbox = new VBox(getTitleLabel4(), copyright4);
    VBox titleinvalidNumbervbox = new VBox(titleLabel5, copyright5);   
    VBox buttonvbox = new VBox(addbtn, nextBtn, lastBtn, paidbtn, connDatabaseBtn, insertToDatabaseBtn, exitbtn);
    VBox infovbox = new VBox(ticketInfoDisplay, ticketinformation);

    /**
     * @return the titleLabel
     */
    public Label getTitleLabel()
    {
        return titleLabel;
    }

    /**
     * @param titleLabel the titleLabel to set
     */
    public void setTitleLabel(Label titleLabel)
    {
        this.titleLabel = titleLabel;
    }

    /**
     * @return the titleLabel2
     */
    public Label getTitleLabel2()
    {
        return titleLabel2;
    }

    /**
     * @param titleLabel2 the titleLabel2 to set
     */
    public void setTitleLabel2(Label titleLabel2)
    {
        this.titleLabel2 = titleLabel2;
    }

    /**
     * @return the titleLabel3
     */
    public Label getTitleLabel3()
    {
        return titleLabel3;
    }

    /**
     * @param titleLabel3 the titleLabel3 to set
     */
    public void setTitleLabel3(Label titleLabel3)
    {
        this.titleLabel3 = titleLabel3;
    }

    /**
     * @return the titleLabel4
     */
    public Label getTitleLabel4()
    {
        return titleLabel4;
    }

    /**
     * @param titleLabel4 the titleLabel4 to set
     */
    public void setTitleLabel4(Label titleLabel4)
    {
        this.titleLabel4 = titleLabel4;
    }

    /**
     * @return the licenseLabel
     */
    public Label getLicenseLabel()
    {
        return licenseLabel;
    }

    /**
     * @param licenseLabel the licenseLabel to set
     */
    public void setLicenseLabel(Label licenseLabel)
    {
        this.licenseLabel = licenseLabel;
    }

    /**
     * @return the licenseTF
     */
    public TextField getLicenseTF()
    {
        return licenseTF;
    }

    /**
     * @param licenseTF the licenseTF to set
     */
    public void setLicenseTF(TextField licenseTF)
    {
        this.licenseTF = licenseTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel()
    {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel)
    {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF()
    {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF)
    {
        this.stateTF = stateTF;
    }

    /**
     * @return the permitLabel
     */
    public Label getPermitLabel()
    {
        return permitLabel;
    }

    /**
     * @param permitLabel the permitLabel to set
     */
    public void setPermitLabel(Label permitLabel)
    {
        this.permitLabel = permitLabel;
    }

    /**
     * @return the permitTF
     */
    public TextField getPermitTF()
    {
        return permitTF;
    }

    /**
     * @param permitTF the permitTF to set
     */
    public void setPermitTF(TextField permitTF)
    {
        this.permitTF = permitTF;
    }

    /**
     * @return the vehiclemodelLabel
     */
    public Label getVehiclemodelLabel()
    {
        return vehiclemodelLabel;
    }

    /**
     * @param vehiclemodelLabel the vehiclemodelLabel to set
     */
    public void setVehiclemodelLabel(Label vehiclemodelLabel)
    {
        this.vehiclemodelLabel = vehiclemodelLabel;
    }

    /**
     * @return the vmTF
     */
    public TextField getVmTF()
    {
        return vmTF;
    }

    /**
     * @param vmTF the vmTF to set
     */
    public void setVmTF(TextField vmTF)
    {
        this.vmTF = vmTF;
    }

    /**
     * @return the violationLabel
     */
    public Label getViolationLabel()
    {
        return violationLabel;
    }

    /**
     * @param violationLabel the violationLabel to set
     */
    public void setViolationLabel(Label violationLabel)
    {
        this.violationLabel = violationLabel;
    }

    /**
     * @return the violationTF
     */
    public TextField getViolationTF()
    {
        return violationTF;
    }

    /**
     * @param violationTF the violationTF to set
     */
    public void setViolationTF(TextField violationTF)
    {
        this.violationTF = violationTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel()
    {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel)
    {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF()
    {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF)
    {
        this.colorTF = colorTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel()
    {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel)
    {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF()
    {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF)
    {
        this.timeTF = timeTF;
    }

    /**
     * @return the dateLabel
     */
    public Label getDateLabel()
    {
        return dateLabel;
    }

    /**
     * @param dateLabel the dateLabel to set
     */
    public void setDateLabel(Label dateLabel)
    {
        this.dateLabel = dateLabel;
    }

    /**
     * @return the dateTF
     */
    public TextField getDateTF()
    {
        return dateTF;
    }

    /**
     * @param dateTF the dateTF to set
     */
    public void setDateTF(TextField dateTF)
    {
        this.dateTF = dateTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel()
    {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel)
    {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF()
    {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF)
    {
        this.locationTF = locationTF;
    }

    /**
     * @return the issuedbyLabel
     */
    public Label getIssuedbyLabel()
    {
        return issuedbyLabel;
    }

    /**
     * @param issuedbyLabel the issuedbyLabel to set
     */
    public void setIssuedbyLabel(Label issuedbyLabel)
    {
        this.issuedbyLabel = issuedbyLabel;
    }

    /**
     * @return the issuedbyTF
     */
    public TextField getIssuedbyTF()
    {
        return issuedbyTF;
    }

    /**
     * @param issuedbyTF the issuedbyTF to set
     */
    public void setIssuedbyTF(TextField issuedbyTF)
    {
        this.issuedbyTF = issuedbyTF;
    }

    /**
     * @return the paymentLabel
     */
    public Label getPaymentLabel()
    {
        return paymentLabel;
    }

    /**
     * @param paymentLabel the paymentLabel to set
     */
    public void setPaymentLabel(Label paymentLabel)
    {
        this.paymentLabel = paymentLabel;
    }

    /**
     * @return the paymentTF
     */
    public TextField getPaymentTF()
    {
        return paymentTF;
    }

    /**
     * @param paymentTF the paymentTF to set
     */
    public void setPaymentTF(TextField paymentTF)
    {
        this.paymentTF = paymentTF;
    }

    /**
     * @return the paidbtn
     */
    public Button getPaidbtn()
    {
        return paidbtn;
    }

    /**
     * @param paidbtn the paidbtn to set
     */
    public void setPaidbtn(Button paidbtn)
    {
        this.paidbtn = paidbtn;
    }

    /**
     * @return the addbtn
     */
    public Button getAddbtn()
    {
        return addbtn;
    }

    /**
     * @param addbtn the addbtn to set
     */
    public void setAddbtn(Button addbtn)
    {
        this.addbtn = addbtn;
    }

    /**
     * @return the lastBtn
     */
    public Button getLastBtn()
    {
        return lastBtn;
    }

    /**
     * @param lastBtn the lastBtn to set
     */
    public void setLastBtn(Button lastBtn)
    {
        this.lastBtn = lastBtn;
    }

    /**
     * @return the nextBtn
     */
    public Button getNextBtn()
    {
        return nextBtn;
    }

    /**
     * @param nextBtn the nextBtn to set
     */
    public void setNextBtn(Button nextBtn)
    {
        this.nextBtn = nextBtn;
    }

    /**
     * @return the exitbtn
     */
    public Button getExitbtn()
    {
        return exitbtn;
    }

    /**
     * @param exitbtn the exitbtn to set
     */
    public void setExitbtn(Button exitbtn)
    {
        this.exitbtn = exitbtn;
    }

    /**
     * @return the ticketInfoDisplay
     */
    public Label getTicketInfoDisplay()
    {
        return ticketInfoDisplay;
    }

    /**
     * @param ticketInfoDisplay the ticketInfoDisplay to set
     */
    public void setTicketInfoDisplay(Label ticketInfoDisplay)
    {
        this.ticketInfoDisplay = ticketInfoDisplay;
    }

    /**
     * @return the ticketinformation
     */
    public TextArea getTicketinformation()
    {
        return ticketinformation;
    }

    /**
     * @param ticketinformation the ticketinformation to set
     */
    public void setTicketinformation(TextArea ticketinformation)
    {
        this.ticketinformation = ticketinformation;
    }

    /**
     * @return the storeBtn
     */
    public Button getStoreBtn()
    {
        return storeBtn;
    }

    /**
     * @param storeBtn the storeBtn to set
     */
    public void setStoreBtn(Button storeBtn)
    {
        this.storeBtn = storeBtn;
    }

    /**
     * @return the storeallBtn
     */
    public Button getStoreallBtn()
    {
        return storeallBtn;
    }

    /**
     * @param storeallBtn the storeallBtn to set
     */
    public void setStoreallBtn(Button storeallBtn)
    {
        this.storeallBtn = storeallBtn;
    }

    /**
     * @return the readDataBtn
     */
    public Button getReadDataBtn()
    {
        return readDataBtn;
    }

    /**
     * @param readDataBtn the readDataBtn to set
     */
    public void setReadDataBtn(Button readDataBtn)
    {
        this.readDataBtn = readDataBtn;
    }

    /**
     * @return the connDatabaseBtn
     */
    public Button getConnDatabaseBtn()
    {
        return connDatabaseBtn;
    }

    /**
     * @param connDatabaseBtn the connDatabaseBtn to set
     */
    public void setConnDatabaseBtn(Button connDatabaseBtn)
    {
        this.connDatabaseBtn = connDatabaseBtn;
    }

    /**
     * @return the insertToDatabaseBtn
     */
    public Button getInsertToDatabaseBtn()
    {
        return insertToDatabaseBtn;
    }

    /**
     * @param insertToDatabaseBtn the insertToDatabaseBtn to set
     */
    public void setInsertToDatabaseBtn(Button insertToDatabaseBtn)
    {
        this.insertToDatabaseBtn = insertToDatabaseBtn;
    }

    /**
     * Removes all of the text inserted into the TextFields. It is called when
     * the Submit Data button has been pressed.
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
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titlevbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }

    /**
     * This function is only called when the ticket ArrayList database is currently empty.
     */
    public void TicketViewNoDataBase()
    {
        this.getChildren().clear();
        titleLabel2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright2.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titlenoListvbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }

    /**
     * This function is called when any of the TextFields are empty including fields with just whitespace characters only.
     */
    public void TicketViewEmptyTextFields()
    {
        this.getChildren().clear();
        getTitleLabel4().setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright4.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titleemptyparamvbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }
    
    /**
     * This function is called when the license number field text or permit number field text are not valid integer numbers.
     */
    public void TicketViewInvalidNumber()
    {
        this.getChildren().clear();
        titleLabel5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright5.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titleinvalidNumbervbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }

    /**
     * This function is only called when the current ticket object trying to be inserted can't because of matching primary keys with the cuurentTicket object being passed in as a parameter.
     * Only used so that the ticket info will still be displayed in the TextArea.
     * @param currentTicket The ticket object trying to be inserted; 
     */
    public void TicketViewCannotInsertToDatabase(Ticket currentTicket)
    {
        int licenseNo = currentTicket.getLicenseNo();
        String state = currentTicket.getState();
        int permitNo = currentTicket.getPermitNo();
        String vehicleModel = currentTicket.getVehicleModel();
        String violation = currentTicket.getViolation();
        String color = currentTicket.getColor();
        String date = currentTicket.getDate();
        String time = currentTicket.getTime();
        String location = currentTicket.getLocation();
        String issuedBy = currentTicket.getIssuedBy();
        String paymentInfo = currentTicket.getPaymentInfo();
        boolean paidticket = currentTicket.isPaidticket();
        String pt = "";

        if (paidticket == false)
        {
            pt = "Ticket has not been paid.";
        } else
        {
            pt = "Ticket has been paid.";
        }
        String info = "License Number: " + licenseNo + "\nState: " + state + "\nPermit Number: " + permitNo + "\nVehicle Model: " + vehicleModel + "\nViolation: " + violation + "\nColor of Vehicle: " + color + "\nDate of Violation: " + date + "\nTime of Violation: " + time + "\nLocation: " + location + "\nTicket Issued By: " + issuedBy + "\nPayment Information: " + paymentInfo + "\n" + pt;
        this.getChildren().clear();
        titleLabel3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright3.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titlenoInsertvbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        ticketinformation.setText(info);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }

    /**
     * This function passes in a Ticket object as a parameter and displays the object's strings into a TextArea.
     * It also checks if the object's paidTicket variable is true or false and updates a string whether the ticket has been paid.
     * @param currentTicket The current ticket going to be displayed on the TextArea
     */
    public void TicketViewUpdate(Ticket currentTicket)
    {
        int licenseNo = currentTicket.getLicenseNo();
        String state = currentTicket.getState();
        int permitNo = currentTicket.getPermitNo();
        String vehicleModel = currentTicket.getVehicleModel();
        String violation = currentTicket.getViolation();
        String color = currentTicket.getColor();
        String date = currentTicket.getDate();
        String time = currentTicket.getTime();
        String location = currentTicket.getLocation();
        String issuedBy = currentTicket.getIssuedBy();
        String paymentInfo = currentTicket.getPaymentInfo();
        boolean paidticket = currentTicket.isPaidticket();
        String pt = "";
        if (paidticket == false)
        {
            pt = "Ticket has not been paid.";
        } else
        {
            pt = "Ticket has been paid.";
        }
        String info = "License Number: " + licenseNo + "\nState: " + state + "\nPermit Number: " + permitNo + "\nVehicle Model: " + vehicleModel + "\nViolation: " + violation + "\nColor of Vehicle: " + color + "\nDate of Violation: " + date + "\nTime of Violation: " + time + "\nLocation: " + location + "\nTicket Issued By: " + issuedBy + "\nPayment Information: " + paymentInfo + "\n" + pt;
        this.getChildren().clear();
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titlevbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        ticketinformation.setText(info);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }

    /**
     * This function takes in an ArrayList of Tickets called currentTickets and loops through each object printing out the strings in the text area until the last object's strings are printed. 
     * If the paidTicket variable is true then the string variable pt will equal: "Ticket has been paid." otherwise it will equal: "Ticket has not been paid."
     * @param currentTickets The ArrayList of Tickets stored in the program
     */
    public void TicketViewUpdateAll(ArrayList<Ticket> currentTickets)
    {
        int licenseNo, permitNo;
        String state, vehicleModel, violation, color, date, time, location, issuedBy, paymentInfo;
        boolean paidticket;
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
            if (paidticket == false)
            {
                pt = "Ticket has not been paid.";
            } else
            {
                pt = "Ticket has been paid.";
            }
            allTickets += "License Number: " + licenseNo + "\nState: " + state + "\nPermit Number: " + permitNo + "\nVehicle Model: " + vehicleModel + "\nViolation: " + violation + "\nColor of Vehicle: " + color + "\nDate of Violation: " + date + "\nTime of Violation: " + time + "\nLocation: " + location + "\nTicket Issued By: " + issuedBy + "\nPayment Information: " + paymentInfo + "\n" + pt + "\n";
        }
        this.getChildren().clear();
        titleLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        copyright.setFont(Font.font("Times New Roman", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        ticketInfoDisplay.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        this.add(titlevbox, 0, 0);
        this.add(labelTFvbox, 0, 1);
        this.add(infovbox, 1, 0);
        ticketinformation.setText(allTickets);
        this.add(buttonvbox, 1, 1);
        this.setAlignment(Pos.CENTER);
    }
}