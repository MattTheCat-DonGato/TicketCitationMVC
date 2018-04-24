package ticket;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import DataBaseManagement.Database;
import java.sql.*;

/**
 *
 * @author Matthew Rodriguez
 * Date February, 23, 2018
 * Revision Date: April 17, 2018
 */
public class TicketModel 
{
    ArrayList<Ticket> ticketDB = new ArrayList<>(); /*List to hold all the ticket objects */
    Ticket currentTicket = new Ticket(); /* New Ticket object */
    OutputStreamWriter out; /* Output to write to the textfile */
    Database ourDatabase = Database.getSingletonOfdatabase(); /* Retrieve the single instance of the Database */
    
    public TicketModel()
    {
        try
        { 
            out = new OutputStreamWriter(new BufferedOutputStream(
            new FileOutputStream("Tickets.dat", true)));  /* Open the data file */
        }
        catch(Exception e)
        {
           
        }
    }
    
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
      * @return the currentTicket object
      */
    public Ticket getCurrentTicket()
    {
        return currentTicket;
    }
    
    /**
     * The getcurrentTickets() function returns the entire ticketDB ArrayList of Ticket objects.
     * @return the ticketDB ArrayList
     */
    public ArrayList<Ticket> getCurrentTickets()
    {
        return ticketDB;
    }
    
    /**
     * The StoreTicketObject passes in a Ticket object as a parameter. It takes the current index of the ticket
     * database and writes the strings of the object to the Tickets.dat file.
     * @param currentTicket The currentTicket object to output to the file.
     */
    public void StoreTicketObject(Ticket currentTicket)
    {
        try
        {
        out.write(currentTicket.getLicenseNo());
        out.write("\r\n");
        out.write(currentTicket.getState());
        out.write("\r\n");
        out.write(currentTicket.getPermitNo());
        out.write("\r\n");
        out.write(currentTicket.getVehicleModel()); 
        out.write("\r\n");
        out.write(currentTicket.getViolation()); 
        out.write("\r\n");
        out.write(currentTicket.getColor()); 
        out.write("\r\n");
        out.write(currentTicket.getDate()); 
        out.write("\r\n");
        out.write(currentTicket.getTime()); 
        out.write("\r\n");
        out.write(currentTicket.getLocation()); 
        out.write("\r\n");
        out.write(currentTicket.getIssuedBy()); 
        out.write("\r\n");
        out.write(currentTicket.getPaymentInfo()); 
        out.write("\r\n");
        if (currentTicket.isPaidticket() == true)
                {
                    out.write("Ticket has been paid.");
                    out.write("\r\n");
                }
                else
                {
                    out.write("Ticket has not been paid.");
                    out.write("\r\n");
                }
        out.flush(); /* flush stream object to the .dat file (append) */
        System.out.println("Current ticket object stored successfully."); /* Notify that the object has been outputted */
        }
        catch (Exception e)
        {
        System.out.println("Cannot store Data into target text File."); /* Notify that the Data could not be outputted */
        }      
    }

    /**
     * The function takes in an ArrayList of Ticket objects and loops through each object outputting strings
     * into the Tickets.dat file. If the file does not exist, an exception is thrown to the output window.
     * @param currentTickets The ArrayList of Ticket objects to be outputted to the file
     */
    public void StoreTicketObjects(ArrayList<Ticket> currentTickets) 
    {
        try
        {
            for(int i = 0; i < currentTickets.size(); i++)
            {
                out.write(currentTickets.get(i).getLicenseNo());
                out.write("\r\n");
                out.write(currentTickets.get(i).getState());
                out.write("\r\n");
                out.write(currentTickets.get(i).getPermitNo());
                out.write("\r\n");
                out.write(currentTickets.get(i).getVehicleModel());
                out.write("\r\n");
                out.write(currentTickets.get(i).getViolation());
                out.write("\r\n");
                out.write(currentTickets.get(i).getColor());
                out.write("\r\n");
                out.write(currentTickets.get(i).getDate());
                out.write("\r\n");
                out.write(currentTickets.get(i).getTime());
                out.write("\r\n");
                out.write(currentTickets.get(i).getLocation());
                out.write("\r\n");
                out.write(currentTickets.get(i).getIssuedBy());
                out.write("\r\n");
                out.write(currentTickets.get(i).getPaymentInfo());
                out.write("\r\n");
                if (currentTickets.get(i).isPaidticket() == true)
                {
                    out.write("Ticket has been paid.");
                    out.write("\r\n");
                }
                else
                {
                    out.write("Ticket has not been paid.");
                    out.write("\r\n");
                }
            }
        out.flush(); /* flush stream object to the .dat file (append) */
        System.out.println("All objects have been stored successfully"); /* Notify that the objects has been outputted */
        }
        catch (Exception e)
        {
        System.out.println("Cannot store Data into File."); /* Notify that the objects could not be outputted to the file */
        }       
    }
    
    /**
     * This function takes in a Ticket object called currentTicket and performs an INSERT SQL statement grabbing the strings of the object, and passing them as the values to be inserted into the selected schema table.
     * @param currentTicket The ticket object to extract the strings to insert them into the database
     */
    public void InsertCurrentTicketToDatabase(Ticket currentTicket)
    {
        try
        {
            int licenseNo = currentTicket.getLicenseNo();
            String state = currentTicket.getState();
            int permitNo = currentTicket.getPermitNo();
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
           // Create SQL Statement
           Statement mystatement = ourDatabase.getDbaseName().createStatement();
           // Write the query command
           String sql = "insert into ticketsunf (licenseNo, state, permitNo, vehicleModel, violation, color, datestamp, timestamp, location, issuedBy, paymentInfo, ticketPaid) values ("+licenseNo+",'"+state+"',"+permitNo+",'"+ vehicleModel +"','"+ violation +"','"+ color +"','"+ date +"','"+ time +"','"+ location +"','"+ issuedBy +"','"+ paymentInfo +"','"+ pt +"');";
           // Execute statement
           mystatement.executeUpdate(sql);
           System.out.println("The SQL Query command has been entered. Please check MySQL Workbench for validation.");
        }
        catch(Exception e)
        {
            System.out.println("Invalid SQL Query command.");
        }
    }    
}