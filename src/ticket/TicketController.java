/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Platform;
/**
 *
 * @author Matthew Rodriguez
 * @date February, 23, 2018
 */
public class TicketController 
{
    TicketModel ticketModel;
    TicketView ticketView;
    int index = 0;
    
    public TicketController(TicketModel ticketModel, TicketView ticketView)
    {
        this.ticketModel=ticketModel;
        this.ticketView=ticketView;
        attachHandlers();
    }
    
    public void attachHandlers()
    {
    // Takes the data entered from the TextFields and stores them into Strings variables
    // The boolean variable paid ticket is automatically set to false
    // A Ticket object called newTicket will store all String data into the object and add it to ticketDB in ticketModel.
    // All the Textfields will be cleared out with the function clearFields() in ticketView.  
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
        
    // Displays the Next Ticket object data of the Ticket ArrayList in the TextArea.
    // Check if the current index number is less than zero.
    // If it is then increment and update that index's object data into the TextArea.
    // If index is already at max size limit, then re-display max size index's object data into TextArea.
    // If the list is empty then call TicketViewNoDatabase() in ticketView to throw an extra message to the user.
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
        
    // Displays the Previous Ticket object data of the Ticket ArrayList in the TextArea.
    // Check if the current index number is greater than zero.
    // If it is then decrement and update that index's object data into the TextArea.
    // If index is already at zero, then re-display index zero's object data into TextArea.
    // If the list is empty then call TicketViewNoDatabase() in ticketView to throw an extra message to the user.
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
        
    // Toggle the boolean variable of the current index in ArrayList to true or false. 
    // Then update the information in TextArea.
    // If the list is empty then call TicketViewNoDatabase() in ticketView to throw an extra message to the user.
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
        
        //Exits the program.
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