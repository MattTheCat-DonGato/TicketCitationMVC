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
 * @date February, 23, 2018
 */
public class TicketModel 
{
    ArrayList<Ticket> ticketDB = new ArrayList<>();
    Ticket currentTicket = new Ticket();
    
     public void setCurrentTicket(Ticket currentTicket)
    {
        this.currentTicket = currentTicket;
        ticketDB.add(currentTicket);
    }
    public Ticket getCurrentTicket()
    {
        return currentTicket;
    }
    public ArrayList<Ticket> getCurrentTickets()
    {
        return ticketDB;
    }
}