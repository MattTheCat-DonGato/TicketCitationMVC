/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManagement;
import java.sql.*;
/**
 *
 * @author Matthew Rodriguez
 * Date: April 10, 2018
 * Revision Date: April 17, 2018
 */
public class Database 
{
    private Connection dbaseName; /* Connection for Database */   
	private Database() 
        {    
            try
            {
                // Get a connection to the database (jdbc:mysql://hostname:port/schema?useSSL=false, user, password)
               this.dbaseName = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/tickets?useSSL=false", "root", "SuperMar!064");  
            }
            catch (Exception e)
            {
                System.out.println("Cannot connect to the database.");            
            }           
	}     
	private static Database singletonOfDatabase = new Database(); /* Create a private singleton of the Database */	
        //Create static function to get the private singleton
        public static Database getSingletonOfdatabase() 
	{    
		return singletonOfDatabase;
	}

	/**
	 * @return the dbaseName
	 */
	public Connection getDbaseName() 
        {
		return dbaseName;
	}

	/**
	 * @param dbaseName the dbaseName to set
	 */
	public void setDbaseName(Connection dbaseName) 
        {
		this.dbaseName = dbaseName;
	}
}