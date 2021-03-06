package ticketmain;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ticket.TicketView;
import ticket.TicketModel;
import ticket.TicketController;

/**
 *
 * @author Matthew Rodriguez
 * date: February, 23, 2018
 * Revision Date: April 9, 2018
 */

public class TicketCitationMVC extends Application
{    
    @Override
    public void start(Stage primaryStage) 
    {   
        TicketView root = new TicketView();
        TicketModel ticketmodel = new TicketModel();
        TicketController tc = new TicketController(ticketmodel,root);
        Scene scene = new Scene(root, 1250, 1000);      
        primaryStage.setTitle("Ticket Citation MVC Mode");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        launch(args);
    } 
}