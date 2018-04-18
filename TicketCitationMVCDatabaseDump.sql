-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tickets
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ticketsunf`
--

DROP TABLE IF EXISTS `ticketsunf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticketsunf` (
  `licenseNo` varchar(8) NOT NULL,
  `state` varchar(15) NOT NULL,
  `permitNo` varchar(10) DEFAULT NULL,
  `vehicleModel` varchar(45) DEFAULT NULL,
  `violation` varchar(100) DEFAULT NULL,
  `color` varchar(30) DEFAULT NULL,
  `datestamp` varchar(30) DEFAULT NULL,
  `timestamp` varchar(50) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  `issuedBy` varchar(45) DEFAULT NULL,
  `paymentInfo` varchar(200) DEFAULT NULL,
  `ticketPaid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`licenseNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='This Table is used to store the data of our tickets from the TicketCitationMVC Project.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketsunf`
--

LOCK TABLES `ticketsunf` WRITE;
/*!40000 ALTER TABLE `ticketsunf` DISABLE KEYS */;
INSERT INTO `ticketsunf` VALUES ('00000000','Texas','460','2018 Ford Fusion','Illegal Parking','Blue','May 20, 2018','4:32 PM','Brownsville','Andrew Medina','Pay $45 to the University of Texas Rio Grande Valley Main Tower 1.100.','Ticket has been paid.'),('00648730','Texas','780','2014 Subaru Outback','No Parking Permit','Blue','March 23, 2018','4:32 PM','Brownsville','Matthew Rodriguez','Pay $50 to the University of Texas Rio Grande Valley Main Tower 1.100.','Ticket has not been paid.'),('10245354','Texas','220','Ford Ranger','Expired Meter','Orange','November 28, 2017','12:05 PM','Brownsville','Alex Arriola','Pay $40 to the University of Texas Rio Grande Valley Main Tower 1.100.','Ticket has not been paid.'),('11111000','Texas','140','1967 Chevy Impalla','Parked in Fire Area','Silver','May 10, 2017','1:13 PM','Harlingen','Luis Gonzalez','Pay $75 to the Harlingen Munincipal Building','Ticket has not been paid.'),('34501128','Texas','415','2013 Ford Mustang','Double Parking','Red','December 30, 2017','9:45 AM','Brownsville','Alex Arriola','Pay $30 to the University of Texas Rio Grande Valley Main Tower 1.100.','Ticket has been paid.'),('94561324','Texas','333','Toyota','Illegal Parking','Orange Yellow','January 23, 2018','3:45 PM','Los Fresnos','Andrew Medina','Pay $25 to Los Fresnos City Hall','Ticket has not been paid.');
/*!40000 ALTER TABLE `ticketsunf` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-17 22:55:58
