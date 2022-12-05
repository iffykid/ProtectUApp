/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProtectU;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

public class CrimeClass {
    
    //SQl query function
    public java.sql.Statement dbQuery(){
    ResultSet rs;
    try {
        Connection c;
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtectU_DB","root","");
        java.sql.Statement st = c.createStatement();
        
        return st;
        
    } catch (Exception e) {
        System.out.println("NO DB CONNECTION MADE");
    }
    
    return null;
    }
    
    //function that counts the number of reports the user has filed
    public int userReports(){
        int reportsFiled = 0;
        
        ResultSet rs;
        try {
            UserClass uc = new UserClass();
            String q2 = " WHERE UserID = " + uc.getUserID();
            System.out.println(q2);
            rs = dbQuery().executeQuery("SELECT COUNT(UserID) FROM Report " + q2);
            
            while(rs.next()){
                reportsFiled = rs.getInt("Count(UserID)");
                rs.next();
            }
            
            return reportsFiled;
            }
            catch (Exception e) {
                System.out.println("CRIME REPORTS NOT WORKING");
            }
        
        return reportsFiled;
    }
    
    //function that returns details about the loaction the user is traveling to/from
    public String safeRouteSuggestions(String area, boolean AorB){
        double safetyLevel = 0;
        try {
            GPSClass gps = new GPSClass();
            int areaCode = gps.areaCodeFinder(area);
            String q = "SELECT ProtectU_DB.Area.SafetyLevel FROM ProtectU_DB.Area WHERE ProtectU_DB.Area.AreaCode = " + areaCode;
            ResultSet rs;
            
            rs = dbQuery().executeQuery(q);
            System.out.println("SAFETY LEVEL");
            while(rs.next()){
                safetyLevel = rs.getDouble("SafetyLevel");
                System.out.println("safetyLevel " + safetyLevel);
            }
            
            ResultSet rs2;
            
            String q2 = "SELECT ProtectU_DB.Crime.CrimeType FROM ProtectU_DB.Crime WHERE ProtectU_DB.Crime.AreaCode = "+areaCode+" GROUP BY ProtectU_DB.Crime.CrimeType ORDER BY COUNT(ProtectU_DB.Crime.CrimeType) DESC LIMIT 0,2";
            rs2 = dbQuery().executeQuery(q2);
            
            String commonCrimes = "";
            
            System.out.println("CRIME TYPE");
            while(rs2.next()){
                commonCrimes = commonCrimes + rs2.getString("CrimeType") +" , ";
                System.out.println("common crimes " + commonCrimes);
            }
            
            String recTravelTime = "";
            
            if(safetyLevel <= 1.5){
                recTravelTime = "TRAVEL ANYTIME OF DAY";
            }
            else if(safetyLevel > 1.5 && safetyLevel <= 2.5){
                recTravelTime = "DO NOT TRAVEL BETWEEN THE HOURS OF 3 AM AND 5 AM";
            }
            else if(safetyLevel > 2.5 && safetyLevel <= 3.8){
                recTravelTime = "DO NOT TRAVEL BETWEEN THE HOURS OF \n 11 PM AND 7 AM ALONE";
            }
            else if(safetyLevel > 3.8 && safetyLevel <= 4.5){
                recTravelTime = "DO NOT TRAVEL AT NIGHT. \n AVOID DARK ROADS AND SKETCH AREAS";
            }
            else if(safetyLevel > 4.5){
                recTravelTime = "THIS AREA IS NOT RECCOMENDED FOR TRAVELLING";
            }
            
            
            
            String warning = "";
            if(AorB == true){
                warning = "WHEN LEAVING " + area.toUpperCase() +" \n"+ recTravelTime + "\n THE MOST COMMON CRIMES ARE: \n" + commonCrimes;
            }else if(AorB == false){
                warning = "WHEN ENTERING " + area.toUpperCase() +" \n"+ recTravelTime + "\n THE MOST COMMON CRIMES ARE: \n" + commonCrimes;
            }
            
            return warning;
            
            
        } catch (Exception e) {
            System.out.println("SUGGESTED TRAVELLING IS NOT WORKING");
        }

        return "";
    }
    
    
    
    
}
