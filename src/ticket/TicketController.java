/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Platform;
/**
 *
 * @author Matthew Rodriguez
 * Date February, 23, 2018
 */
public class TicketController 
{
    TicketModel ticketModel;
    TicketView ticketView;
    int index = 0;
    
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
     A Ticket object called newTicket will store all String data into the newTicket object and add it to ticketDB in ticketModel.
     All the TextFields will be cleared out with the function clearFields() in ticketView. 
     */  
        ticketView.getAddbtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
            // get Fields
            String licenseNo = ticketView.getLicenseTF().getText();
            String state = ticketView.getStateTF().getText();
            String permitNo = ticketView.getPermitTF().getText();
            String vehicleModel = ticketView.getVmTF().getText();
            String violation = ticketView.getViolationTF().getText();
            String color = ticketView.getColorTF().getText();
            String date = ticketView.getDateTF().getText();
            String time = ticketView.getTimeTF().getText();
            String location = ticketView.getLocationTF().getText();
            String issuedBy = ticketView.getIssuedbyTF().getText();
            String paymentInfo = ticketView.getPaymentTF().getText();
            boolean paidticket;
            paidticket = false;
            
            Ticket newTicket = new Ticket(licenseNo, state, permitNo, vehicleModel, violation, color, date, time, location, issuedBy, paymentInfo, paidticket);
            ticketModel.setCurrentTicket(newTicket);
            ticketView.clearFields();
            }               
        });
         
      /* ticketView.getNextBtn()
     Displays the Next Ticket object data of the Ticket ArrayList in the TextArea.
     Check if the current index number is less than zero.
     If it is less than zero then increment the index, and update that indexes object data into the TextArea.
     If index is already at max size limit, then re-display max size indexes object data into TextArea.
     If the list is empty then call TicketViewNoDatabase() in ticketView to throw an exception message to the user.
      */
        ticketView.getNextBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
             Ticket currentTicket = ticketModel.getCurrentTicket();
             // Display Next Ticket in Ticket Data Arraylist
             if (!ticketModel.getCurrentTickets().isEmpty())
             {
                 if (index < ticketModel.getCurrentTickets().size()-1)
                 {
                     index++;
                     currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
                 else
                 {
                     currentTicket = ticketModel.ticketDB.get(index);
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
     If the list is empty then call TicketViewNoDatabase() in ticketView to throw an exception message to the user.
        */
        ticketView.getLastBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
             Ticket currentTicket = ticketModel.getCurrentTicket();
             
             if (!ticketModel.getCurrentTickets().isEmpty())
             {
                 if (index > 0)
                 {
                     index--;
                     currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
                 else
                 {
                     currentTicket = ticketModel.ticketDB.get(index);
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
     If the list is empty then call TicketViewNoDatabase() in ticketView to throw an exception message to the user.
        */
        ticketView.getPaidbtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
            {
               Ticket currentTicket = ticketModel.getCurrentTicket();
             
             if (!ticketModel.getCurrentTickets().isEmpty())
             {
                 if (ticketModel.getCurrentTickets().get(index).isPaidticket() == false)
                 {
                     ticketModel.getCurrentTickets().get(index).setPaidticket(true);
                     currentTicket = ticketModel.ticketDB.get(index);
                     ticketView.TicketViewUpdate(currentTicket);
                 }
                 else
                 {
                     ticketModel.getCurrentTickets().get(index).setPaidticket(false);
                     currentTicket = ticketModel.ticketDB.get(index);
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
        */
        ticketView.getReadDataBtn().setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event) 
              {
                   try
                { 
                    FileReader in = new FileReader("Tickets.dat");
                    BufferedReader inputline = new BufferedReader(in);
                    Boolean line = true;               
                    while(line = inputline.ready())
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
                    String issuedby;
                    String paymentinfo;
                    String finalstring;
                    Boolean ispaid;
                    licenseNo = inputline.readLine();
                    state = inputline.readLine();
                    permitNo = inputline.readLine();
                    vehicleModel = inputline.readLine();
                    violation = inputline.readLine();
                    color = inputline.readLine();
                    date = inputline.readLine();
                    time = inputline.readLine();
                    location = inputline.readLine();
                    issuedby = inputline.readLine();
                    paymentinfo = inputline.readLine();
                    finalstring = inputline.readLine();
                    ispaid = finalstring.matches("Ticket has been paid.");
                    
                    Ticket currentTicket = new Ticket(licenseNo,state,permitNo,vehicleModel,violation,color,date,time,location,issuedby,paymentinfo,ispaid);
                    ticketModel.setCurrentTicket(currentTicket);                           
                    }
                    in.close();  //close the file
                    ArrayList<Ticket> currentTickets = ticketModel.ticketDB;
                    ticketView.TicketViewUpdateAll(currentTickets);
                    System.out.println("File successfully Read.");
            }
            catch(Exception e)
            {
            System.out.println("Tickets.dat file does not exist.");
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