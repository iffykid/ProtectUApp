/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProtectU;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.HashMap;
/**
 *
 * @author shaun
 */
public class ReportClass {

private String[][] reports = new String[3][7];//stores a set of 3 reports and the relevant details

//returns the reports array
public String[][] getReports(){
    return reports;
}

//
public ReportClass(){
    //
}

//takes in the query type and returns initialises a set of 3 reports given the upper and lower limits 
public ReportClass(String type, String area, int lowerLimit, int upperLimit){
    try {
        //sorting
        ResultSet rs;
        if(type.equalsIgnoreCase("1")){
        //select all
            //System.out.println(area.length());
            if(area.length() > 3){
                rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode WHERE ProtectU_DB.Area.City LIKE '"+area+"' LIMIT "+ lowerLimit + "," + upperLimit);
            }
            else{
                rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode LIMIT "+ lowerLimit + "," + upperLimit);
            }
            int counter = 0;
            while(rs.next()){
                //System.out.println(rs.getString("CrimeType"));
                reports[counter][0] = rs.getString("CrimeType");
                //System.out.println(rs.getString("City"));
                reports[counter][1] = "LOCATION: " + rs.getString("City").toUpperCase();
                //System.out.println(rs.getDate("CrimeDate"));
                reports[counter][2] = "DATE: " + rs.getDate("CrimeDate");
                reports[counter][3] = "REPORT NO. " + rs.getInt("CrimeCode");
                reports[counter][4] = "STATUS: " + rs.getString("CrimeStatus");
                reports[counter][5] = rs.getString("CrimeDescription");
                counter++;
                //System.out.println(counter);
                //rs.next();
            }
            //type,location,date,reportnumber,status,description
        }//SORTING BY DATE OF CRIME
        else if(type.equalsIgnoreCase("2")){
            
            if(area.length() > 3){
                rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode WHERE ProtectU_DB.Area.City = '"+area+"' ORDER BY ProtectU_DB.Crime.CrimeDate DESC LIMIT "+ lowerLimit + "," + upperLimit);
            }
            else{
            rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode ORDER BY ProtectU_DB.Crime.CrimeDate DESC LIMIT "+ lowerLimit + "," + upperLimit);
            }
            int counter = 0;
            while(rs.next()){
                //System.out.println(rs.getString("CrimeType"));
                reports[counter][0] = rs.getString("CrimeType");
                //System.out.println(rs.getString("City"));
                reports[counter][1] = "LOCATION: " + rs.getString("City").toUpperCase();
                //System.out.println(rs.getDate("CrimeDate"));
                reports[counter][2] = "DATE: " + rs.getDate("CrimeDate");
                reports[counter][3] = "REPORT NO. " + rs.getInt("CrimeCode");
                reports[counter][4] = "STATUS: " + rs.getString("CrimeStatus");
                reports[counter][5] = rs.getString("CrimeDescription");
                counter++;
                //System.out.println(counter);
                //rs.next();
            }
        }
        //SORTING BY AREA
        else if(type.equalsIgnoreCase("3")){
            
            //if(area.length() > 0){
            //    rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode  ORDER BY ProtectU_DB.Area.City LIMIT "+ lowerLimit + "," + upperLimit);
            //}
            //else{
            rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode ORDER BY ProtectU_DB.Area.City LIMIT "+ lowerLimit + "," + upperLimit);
            //}
            int counter = 0;
            while(rs.next()){
                //System.out.println(rs.getString("CrimeType"));
                reports[counter][0] = rs.getString("CrimeType");
                //System.out.println(rs.getString("City"));
                reports[counter][1] = "LOCATION: " + rs.getString("City").toUpperCase();
                //System.out.println(rs.getDate("CrimeDate"));
                reports[counter][2] = "DATE: " + rs.getDate("CrimeDate");
                reports[counter][3] = "REPORT NO. " + rs.getInt("CrimeCode");
                reports[counter][4] = "STATUS: " + rs.getString("CrimeStatus");
                reports[counter][5] = rs.getString("CrimeDescription");
                counter++;
                //System.out.println(counter);
                //rs.next();
            }
        }
        //SORING BY STATUS
        else if(type.equalsIgnoreCase("4")){
            
            if(area.length() > 0){
                rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode WHERE ProtectU_DB.Area.City = '"+area+"' ORDER BY ProtectU_DB.Crime.CrimeType LIMIT "+ lowerLimit + "," + upperLimit);
            }
            else{
                rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode ORDER BY ProtectU_DB.Crime.CrimeType LIMIT "+ lowerLimit + "," + upperLimit);
            }
            int counter = 0;
            while(rs.next()){
                //System.out.println(rs.getString("CrimeType"));
                reports[counter][0] = rs.getString("CrimeType");
                //System.out.println(rs.getString("City"));
                reports[counter][1] = "LOCATION: " + rs.getString("City").toUpperCase();
                //System.out.println(rs.getDate("CrimeDate"));
                reports[counter][2] = "DATE: " + rs.getDate("CrimeDate");
                reports[counter][3] = "REPORT NO. " + rs.getInt("CrimeCode");
                reports[counter][4] = "STATUS: " + rs.getString("CrimeStatus");
                reports[counter][5] = rs.getString("CrimeDescription");
                counter++;
                //System.out.println(counter);
                //rs.next();
            }
        }
        /*else if(type.equalsIgnoreCase("5")){
            
            if(area.isEmpty() == false){
                rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode WHERE ProtectU_DB.Area.City = '"+area+"'");
            }
            rs = dbQuery().executeQuery("SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType FROM ProtectU_DB.Area INNER JOIN ProtectU_DB.Crime ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode WHERE ProtectU_DB.Area.City = '"+area+"'");
            int counter = 0;
            while(rs.next()){
                System.out.println(rs.getString("CrimeType"));
                reports[counter][0] = rs.getString("CrimeType");
                System.out.println(rs.getString("City"));
                reports[counter][1] = "LOCATION: " + rs.getString("City").toUpperCase();
                System.out.println(rs.getDate("CrimeDate"));
                reports[counter][2] = "DATE: " + rs.getDate("CrimeDate");
                counter++;
                System.out.println(counter);
                //rs.next();
            }
            
        }
        */
        
        
    } catch (Exception e) {
        System.out.println("REPORT INFORMATION INVALID");
    }
}

//SQL query function
public java.sql.Statement dbQuery(){
    ResultSet rs;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtectU_DB","root","");
        java.sql.Statement st = c.createStatement();
        
        return st;
        
    } catch (Exception e) {
        System.out.println("NO DB CONNECTION MADE");
    }
    
    return null;
}

//function that finds the users most recent report and its details
public void userRecentReport(int user){
    String [][]recentReport = new String [3][3]; 
    try {
        ResultSet rs;
        String q1 = "SELECT ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate , ProtectU_DB.Area.City , ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeStatus, ProtectU_DB.Crime.CrimeCode FROM ProtectU_DB.Crime INNER JOIN ProtectU_DB.Area ON ProtectU_DB.Crime.AreaCode = ProtectU_DB.Area.AreaCode INNER JOIN ProtectU_DB.Report ON ProtectU_DB.Crime.CrimeCode = ProtectU_DB.Report.CrimeCode INNER JOIN ProtectU_DB.User ON ProtectU_DB.`User`.UserID = ProtectU_DB.Report.UserID WHERE ProtectU_DB.`User`.UserID = "+user+" ORDER BY ProtectU_DB.Crime.CrimeDate DESC";
        rs = dbQuery().executeQuery(q1);
        //System.out.println("working");
        int counter = 0;
        while(rs.next()){
        //System.out.println(rs.getString("CrimeType"));
            reports[counter][0] = rs.getString("CrimeType");
            //System.out.println(rs.getString("City"));
            reports[counter][1] = "LOCATION: " + rs.getString("City").toUpperCase();
            //System.out.println(rs.getDate("CrimeDate"));
            reports[counter][2] = "DATE: " + rs.getDate("CrimeDate");
            reports[counter][3] = "REPORT NO. " + rs.getInt("CrimeCode");
            reports[counter][4] = "STATUS: " + rs.getString("CrimeStatus");
            reports[counter][5] = rs.getString("CrimeDescription");
            counter++;
            //System.out.println(counter);
            //rs.next();
        }

    } catch (Exception e) {
        System.out.println("CANNOT FIND RECENT REPORTS");
    }
    
}

//function that allows a user to file a report
public void createReport(int areaCode, String crimeType, String crimeDescription, String crimeDate){
    try {
        UserClass uc = new UserClass();
                //String q1 = "INSERT INTO ProtectU_DB.Crime (ProtectU_DB.User.`Na`)";
                
        String q1 = "INSERT INTO ProtectU_DB.Crime (ProtectU_DB.Crime.CrimeCode, ProtectU_DB.Crime.AreaCode, ProtectU_DB.Crime.CrimeType, ProtectU_DB.Crime.CrimeDescription, ProtectU_DB.Crime.CrimeDate, ProtectU_DB.Crime.CrimeStatus) VALUES (NULL, '"+areaCode+"', '"+crimeType+"' , '"+crimeDescription+"', '"+crimeDate+"', 'FILLED')";
        dbQuery().executeUpdate(q1);
        
        ResultSet rs;
        
        rs = dbQuery().executeQuery("SELECT MAX(ProtectU_DB.Crime.CrimeCode) AS RecentReport FROM ProtectU_DB.Crime ");
        System.out.println("working");
        int crimeCode = 0;
        while(rs.next()){
            crimeCode = rs.getInt("RecentReport");
        }
        System.out.println("adding");
        String q2 = "INSERT INTO ProtectU_DB.Report (ProtectU_DB.Report.UserID, ProtectU_DB.Report.CrimeCode) VALUES ('"+uc.getUserID()+"', '"+crimeCode+"')";
        dbQuery().executeUpdate(q2);
        
        JOptionPane.showMessageDialog(null, "YOUR REPORT WAS SUCCESSFULLY FILED. \n YOUR REPORT NUMBER IS :" + crimeCode,"REPORT CREATED",JOptionPane.PLAIN_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "THIS REPORT COULD NOT BE SUBMITTED. PLEASE TRY AGAIN.");
    }
}
    
}
