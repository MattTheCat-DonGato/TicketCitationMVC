/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

import java.util.ArrayList;

/**
 *
 * @author Matthew Rodriguez
 * Date February, 23, 2018
 */
public class TicketModel 
{
    ArrayList<Ticket> ticketDB = new ArrayList<>(); /*List to hold all the ticket objects */
    Ticket currentTicket = new Ticket(); /* New Ticket object */
    
    /**
     * The setCurrentTicket() function passes in a Ticket object and adds it to the ticketDB ArrayList.
     * @param currentTicket The ticket object to be added to the ArrayList.
     */
     public void setCurrentTicket(Ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        ticketDB.add(currentTicket);
    }
     
     /**
      * The getcurrentTicket() function returns the currently pointed currentTicket object in the ticketDB ArrayList.
      * @return    the currentTicket object
      */
    public Ticket getCurrentTicket()
    {
        return currentTicket;
    }
    
    /**
     * The getcurrentTickets() function returns the entire ticketDB ArrayList of Ticket objects.
     * @return   the ticketDB ArrayList
     */
    public ArrayList<Ticket> getCurrentTickets()
    {
        return ticketDB;
    }
}