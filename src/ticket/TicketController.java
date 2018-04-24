package ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Platform;
import DataBaseManagement.Database;

import java.sql.*;
/**
 *
 * @author Matthew Rodriguez
 * Date February, 23, 2018
 * Revision Date: April 24, 2018
 */
public class TicketController 
{
    TicketModel ticketModel;
    TicketView ticketView;
    int index = 0; /* Point to the beginning of the ArrayList even if it is empty */
    Database ourDatabase = Database.getSingletonOfdatabase(); /* Create a single instance of the database */
    
    /**
     * This is the controller which handles all of the buttons in our GUI for the ticket citation.
     * It requires two main parameters: ticketModel and ticketView.
     * The attachHandlers() function will carryout all of the button implementations. 
     * @param ticketModel The ticket model database structure
     * @param ticketView The GUI view for the program
     */
    public TicketController(TicketModel ticketModel, TicketView ticketView)
    {
        this.ticketModel=ticketModel;
        this.ticketView=ticketView;
        attachHandlers();
    }
 
    /**
     * The attachHandlers() function will handle all of the actions each of the buttons will do in the TicketCitationMVC program.
     * Within the comments of the source code explains what each button performs.
     */  
    public void attachHandlers()
    {
        
     /* 
     ticketView.getAddbtn()
     Takes the data entered from the TextFields and stores them into Strings variables.
     The boolean variable paid ticket is automatically set to false (because new tickets are unpaid).
     The boolean varaible validNumber is set true at the start.
     A try-catch block is performed at the beginning to check for any NumberFormatException handling that may be caught based on the input entered into the License Number TextField and Permit Number TextField.
     If any exceptions are caught then set validNumber to false.
     First it checks to see if any of the TextFields are empty, if there are then call the TicketViewEmptyTextFields() to throw a message saying that all the fields must be filled in.
     Next it will check the strings again, but this time ignoring all whitespaces that may have been ignored in the first if statement and check the length of the strings.
     If any of the strings are zero then call the TicketViewEmptyTextFields() to throw the same error message.
     If all the fields are filled, then we check boolean variable validNumber.
     If it is true then store the data into a new Ticket object and add it to the ArrayList.
     Else call the function TicketViewInvalidNumber() to throw an error message saying that the License and Permit number must be integer numbers.
     All the TextFields will be cleared out with the function clearFields() in ticketView. 
     */  
        ticketView.getAddbtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
            /* get Fields */
            String stringlicenseNo = ticketView.getLicenseTF().getText();
            String state = ticketView.getStateTF().getText();
            String stringpermitNo = ticketView.getPermitTF().getText();
            String vehicleModel = ticketView.getVmTF().getText();
            String violation = ticketView.getViolationTF().getText();
            String color = ticketView.getColorTF().getText();
            String date = ticketView.getDateTF().getText();
            String time = ticketView.getTimeTF().getText();
            String location = ticketView.getLocationTF().getText();
            String issuedBy = ticketView.getIssuedbyTF().getText();
            String paymentInfo = ticketView.getPaymentTF().getText();
            boolean paidticket;
            boolean validNumber = true; /* Flag to check if the license number or permit number is an integer. */
            paidticket = false; 
            try
            {                       
                Integer.parseInt(stringlicenseNo);
                Integer.parseInt(stringpermitNo);
            }
            catch (NumberFormatException e)
            {
                validNumber = false;
            }
                /* Check if any of the fields are empty (no/semi input from user) */
                if(stringlicenseNo.matches("")||state.matches("")||stringpermitNo.matches("")||vehicleModel.matches("")||violation.matches("")||color.matches("")||date.matches("")||time.matches("")||location.matches("")||issuedBy.matches("")||paymentInfo.matches(""))
                {
                    ticketView.TicketViewEmptyTextFields();
                    ticketView.clearFields();
                }
                /* If all the strings do have something in it, then check again, but this time remove the whitespaces: If any of the lengths are zero, then do this instead... */
                else if (stringlicenseNo.trim().length() == 0||state.trim().length() == 0||stringpermitNo.trim().length() == 0||vehicleModel.trim().length() == 0||violation.matches("")||color.trim().length() == 0||date.trim().length() == 0||time.trim().length() == 0||location.trim().length() == 0||issuedBy.trim().length() == 0||paymentInfo.trim().length() == 0)
                {
                    ticketView.TicketViewEmptyTextFields();
                    ticketView.clearFields();
                }
                else
                { 
                        if(validNumber)
                        {
                            int licenseNo = Integer.parseInt(stringlicenseNo);
                            int permitNo = Integer.parseInt(stringpermitNo);
                            /* Create the new Ticket Object with the fields obtained */
                            Ticket newTicket = new Ticket(licenseNo, state, permitNo, vehicleModel, violation, color, date, time, location, issuedBy, paymentInfo, paidticket);
                            /* Add it to the Ticket ArrayList */
                            ticketModel.setCurrentTicket(newTicket);
                            /* Clear the TextFields in the GUI */
                            ticketView.clearFields();
                        }
                        else
                        {
                            ticketView.TicketViewInvalidNumber();
                            ticketView.clearFields();
                        }      
                }
            }               
        });
         
      /* ticketView.getNextBtn()
     Displays the Next Ticket object data of the Ticket ArrayList in the TextArea.
     Check if the current index number is less than the size of the ArrayList.
     If it is less than the size of the ArrayList then increment the index, and update that indexes object data into the TextArea.
     If index is already at max size limit, then re-display max size indexes object data into TextArea.
     If the list is empty then call TicketViewNoDatabase() in ticketView to throw an exception message saying that the ArrayList is empty to the user.
      */
        ticketView.getNextBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {        
             /* Check to see if the ArrayList is empty */
             if (!ticketModel.getCurrentTickets().isEmpty())
             {
                 if (index < ticketModel.getCurrentTickets().size()-1)
                 {
                     index++;
                     Ticket currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
                 else
                 {
                     Ticket currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 } 
             }              
             else
             {
                 ticketView.TicketViewNoDataBase();
             }
            }       
        });      
     
        /*  
        ticketView.getLastBtn()
     Displays the Previous Ticket object data of the Ticket ArrayList in the TextArea.
     Check if the current index number is greater than zero.
     If it is then decrement the index, and update that indexes object data into the TextArea.
     If index is already at zero, then re-display the index zero object data into TextArea.
     If the list is empty then call TicketViewNoDatabase() in ticketView to throw an exception message saying that the ArrayList is empty to the user.
        */
        ticketView.getLastBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {            
             if(!ticketModel.getCurrentTickets().isEmpty())
             {
                 if (index > 0)
                 {
                     index--;
                     Ticket currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
                 else
                 {
                     Ticket currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
             }              
             else
             {
                ticketView.TicketViewNoDataBase();  
             }
            }       
        });
       /* 
        ticketView.getPaidbtn()
     Toggles the boolean variable of the current index in ArrayList to true or false.
     Then update the currenTicket information in TextArea.
     If the list is empty then call TicketViewNoDatabase() in ticketView to throw an exception message saying that the Array List is empty to the user.
        */
        ticketView.getPaidbtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {   
             if (!ticketModel.getCurrentTickets().isEmpty())
             {
                 if (ticketModel.getCurrentTickets().get(index).isPaidticket() == false)
                 {
                     ticketModel.getCurrentTickets().get(index).setPaidticket(true);
                     Ticket currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
                 else
                 {
                     ticketModel.getCurrentTickets().get(index).setPaidticket(false);
                     Ticket currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 } 
             }
             else
             {
                 ticketView.TicketViewNoDataBase();
             }            
            }            
        });        
        /*  
        ticketView.getStoreBtn()
     Grabs the currently pointed index of the ticketModel.ticketDB and appends the strings into Tickets.dat 
     even if the current Ticket object was read in from the file.
     If any of the strings are null then an exception is thrown to the Output window.
     Because this program is now database driven this functionality is removed from the project; however, button implementation will still be within the source code.
        */
        ticketView.getStoreBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
               Ticket currentTicket = ticketModel.ticketDB.get(index);
               ticketModel.StoreTicketObject(currentTicket);
            }
        });
        
        /*  
        ticketView.getStoreallBtn()
     Grabs the entire ticketDB and appends the strings of each object into Tickets.dat 
     even if the Ticket objects were read in from the file.
     If any of the strings are null then an exception is thrown to the Output window.
     Because this program is now database driven this functionality is removed the project; however, button implementation will still be within the source code.
        */
        ticketView.getStoreallBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
               ArrayList<Ticket> currentTickets = ticketModel.ticketDB;
               ticketModel.StoreTicketObjects(currentTickets);
            }
        });       
        /*  
        ticketView.getReadDataBtn()
     Opens the Tickets.dat file and reads in the strings line by line. 
     There must be twelve strings per loop in order for it to be stored as ticket object. 
     If any of the fields are null then an exception will be thrown saying that the file does not exist.
     If successful, all Ticket objects that were created are then displayed onto the TextArea box of the GUI.
     Once the file has been completely read then the message "File Read Successfully" will be shown on the Output window.
     Because this program is now database driven this functionality is removed from the project; however, button implementation will still be within the source code.
        */
        ticketView.getReadDataBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
              {
                   try
                { 
                    FileReader in = new FileReader("Tickets.dat"); /* Input File to read from */
                    BufferedReader inputline = new BufferedReader(in); /* BufferedReader to read lines in file */
                    Boolean line = true; /* Flag to see if there is something to be read from file */              
                    while(line == inputline.ready())
                    {
                    String stringlicenseNo, state, stringpermitNo, vehicleModel, violation, color, date, time, location, issuedby, paymentinfo, finalstring;
                    Boolean ispaid;
                    stringlicenseNo = inputline.readLine();
                    int licenseNo = Integer.parseInt(stringlicenseNo);
                    state = inputline.readLine();
                    stringpermitNo = inputline.readLine();
                    int permitNo = Integer.parseInt(stringpermitNo);
                    vehicleModel = inputline.readLine();
                    violation = inputline.readLine();
                    color = inputline.readLine();
                    date = inputline.readLine();
                    time = inputline.readLine();
                    location = inputline.readLine();
                    issuedby = inputline.readLine();
                    paymentinfo = inputline.readLine();
                    finalstring = inputline.readLine();
                    /* This is used to grab the boolean variable */
                    ispaid = finalstring.matches("Ticket has been paid.");
                    /* Create the new Ticket object */
                    Ticket currentTicket = new Ticket(licenseNo,state,permitNo,vehicleModel,violation,color,date,time,location,issuedby,paymentinfo,ispaid);
                    /* Add it to the database */
                    ticketModel.setCurrentTicket(currentTicket);                           
                    }
                    in.close(); /* Close the input file */
                    ArrayList<Ticket> currentTickets = ticketModel.ticketDB; /* Grab the ArrayList of Tickets */
                    ticketView.TicketViewUpdateAll(currentTickets); /* Call the TicketViewUpdateAll() function */
                    System.out.println("File successfully Read."); /* Notify that the file has been read */
            }
            catch(Exception e)
            {
            System.out.println("Tickets.dat file does not exist."); /*Notify that the file doesn't exist*/
            } 
          }
        });        
        /**
         * ticketView.getConnDatabaseBtn()
         * Performs a SELECT query command within in MySQL and stores the result into a ResultSet object myRs. 
         * It then loops through the myRs object grabbing the strings and storing them into a Ticket object.
         * Checks if any rows read from the database have already been inserted into the ArrayList by comparing the primary key of the current row with the primary keys of the ticket data objects in the ArrayList.
         * If the primary key already exists in the ArrayList it outputs an error message to the console. If not, then it adds the database row data into the ArrayList.
         * Finally it passes in the ArrayList of Ticket objects called currentTickets into the TicketViewUpdateAll() function and displays all of the Ticket objects (even the tickets that were inserted from the GUI or read from a file into ticketModel.ticketDB) into the TextArea.
         */
        ticketView.getConnDatabaseBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                try
                {
                    // Create a statement
                    Statement statement = ourDatabase.getDbaseName().createStatement();
                    // Execute SQL Statement
                    ResultSet myRs = statement.executeQuery("select * from ticketsunf");
                    // Process the Result Set
                    while(myRs.next())
                    {
                        int licenseNo, permitNo;
                        String state, vehicleModel, violation, color, date, time, location, issuedby, paymentinfo, finalstring;
                        boolean ispaid;
                        boolean match = false;
                        licenseNo = myRs.getInt("licenseNo");
                        state = myRs.getString("state");
                        permitNo = myRs.getInt("permitNo");
                        vehicleModel = myRs.getString("vehicleModel");
                        violation = myRs.getString("violation");
                        color = myRs.getString("color");
                        date = myRs.getString("datestamp");
                        time = myRs.getString("timestamp");
                        location = myRs.getString("location");
                        issuedby = myRs.getString("issuedBy");
                        paymentinfo = myRs.getString("paymentInfo");
                        finalstring = myRs.getString("ticketPaid");
                        ispaid = finalstring.matches("Ticket has been paid.");
                        Ticket newDBticket = new Ticket(licenseNo,state,permitNo,vehicleModel,violation,color,date,time,location,issuedby,paymentinfo,ispaid); /* Store the data into a Ticket object */
                        for(int i = 0; i < ticketModel.getCurrentTickets().size(); i++)
                        {
                            if(newDBticket.getLicenseNo() == ticketModel.getCurrentTickets().get(i).getLicenseNo())
                            {
                                match = true;
                            }
                        }                      
                        if(match)
                        {
                            System.out.println("No duplicate tickets allowed in the list from database.");
                        }
                        else
                        {
                            ticketModel.setCurrentTicket(newDBticket);
                        }                       
                    }
                    ArrayList<Ticket> currentTickets = ticketModel.getCurrentTickets(); /* Grab the ArrayList of Ticket objects */
                    ticketView.TicketViewUpdateAll(currentTickets); /* Updates the GUI Text Area */
                }
                catch(Exception e)
                {
                    System.out.println("Error: There is no data in the database or there is no connection established with the database.");        
                }              
            }
        });       
        /**
         * ticketView.getInsertToDatabaseBtn() 
         * Grabs the currently pointed index of the ticketModel.ticketDB and performs the INSERT SQL command inserts the values
         * of the object into the database table.
         * First it checks if the ArrayList is empty, if it is then then call TicketViewNoDatabase().
         * If not, then we grab the currentTicket object and try to check if any of the primary keys in the database match the currentTicket's licenseNo.
         * If there is a match, then call the TicketViewCannotInsertToDatabase() passing in the currentTicket object to display it into the TextArea, and notify the user they cannot insert the ticket into the database because of matching primary keys.
         * If there was no match, then pass the currentTicket into InsertCurrentTicketToDatabase() to perform the INSERT command for that ticket object.
         */
        ticketView.getInsertToDatabaseBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                if(ticketModel.getCurrentTickets().isEmpty())
                {
                    ticketView.TicketViewNoDataBase();
                }
                else
                {
                Ticket currentTicket = ticketModel.ticketDB.get(index);             
                    try
                    {                   
                        // Flag to check if the currentTicket's licenseNo matches any of the ResultSet's licenseNo primary keys
                        boolean isInDatabase = false;
                        // Create a statement
                        Statement statement = ourDatabase.getDbaseName().createStatement();
                        // Execute SQL Statement
                        ResultSet myRs = statement.executeQuery("select licenseNo from ticketsunf");
                        // While processing the Result Set and currentTicket's licenseNo is not in the Database
                        while(myRs.next() && !isInDatabase)
                        {
                            int licenseNoPrimaryKey; 
                            licenseNoPrimaryKey = myRs.getInt("licenseNo"); /* Grab the Primary Key */
                            // If the currentTickets licenseNo about to be inserted matches the current primary key being looked at.
                            if (currentTicket.getLicenseNo() == licenseNoPrimaryKey)
                            {
                                isInDatabase = true; /* Set off the flag */
                            }     
                        }
                        //If flag is set off...
                        if(isInDatabase)
                        {
                        ticketView.TicketViewCannotInsertToDatabase(currentTicket);
                        }
                        //If flag didn't set off...
                        else
                        {
                        ticketModel.InsertCurrentTicketToDatabase(currentTicket);
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("No Database connectivity established. Please make sure that the Jar File has been added.");
                    }
                }    
            }            
        });      
        /*  
     ticketView.getExitbtn()
     Exits the program. 
        */
        ticketView.getExitbtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
                Platform.exit();
            }
        });
    }
}