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
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
/**
 *
 * @author shaun
 */
public class UserClass {
    
private static String username;
private static String surname;
private static String email;
private static int userID;
private static String password;
private static String cellphoneNumber;
private static String emergencyCellphoneNumber;
private static String gender;
private static int areaCode;
private static int age;



public UserClass(){
    //
}
    
    //connection to the database
    public java.sql.Statement dbQuery(){

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
    
    //takes in the username and password 
    public UserClass(String userN, String passW){
    ResultSet rs; 
    try {
            String q1 = "";
            if(userN.contains("@")){
            q1 = "WHERE Email LIKE '" + userN + "' AND Password = '" + passW + "'";
            }else{
            q1 = "WHERE Name LIKE '" + userN + "' AND Password = '" + passW + "'";
            }
            
            rs = dbQuery().executeQuery("SELECT * FROM User " + q1);
            //System.out.println("table");
            while(rs.next()){
            //System.out.println("Area is " + rs.getString("Province"));
            //System.out.println(rs.getString("Latitude"));
            userID = rs.getInt("UserID");
            username = rs.getString("Name");
            surname = rs.getString("Surname") ;
            //System.out.println("name what what " + username);
            password = rs.getString("Password");
            areaCode = rs.getInt("AreaCode");
            cellphoneNumber = rs.getString("Cellphone");
            emergencyCellphoneNumber = rs.getString("EmergencyContact");
            age = rs.getInt("Age");
            gender = rs.getString("Gender");
            email = rs.getString("Email");
            //userfound.put(username, password);
            
            rs.next();
            }
            
            
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "COULD NOT CONNECT TO DB");
    }
}
    
    //returns the name of the user
    public static String getUsername() {
        return username;
    }
    
    //returns the surname of the user
    public static String getSurname(){
        return surname;
    }
    
    //returns the email of the user
    public static String getEmail(){
        return email;
    }
    
    //returns the cellphone number of the user
    public static String getEmergencyCellphoneNumber() {
        return emergencyCellphoneNumber;
    }
    
    //returns the gender of the user
    public static String getGender() {
        return gender;
    }
    
    //returns the age of the user
    public static int getAge() {
        return age;
    }
    
    //returns the areacode of the user
    public static int getAreaCode(){
        return areaCode;
    }
    
    //returns the users ID
    public static int getUserID(){
        return userID;
    }
    
    //function that checks if the users username matches the users password
    //returns true if they match and false if they dont
    public boolean Authenticate(String user, String passW){ 
        if((user.equals(getEmail()) && passW.equals(password)) || (user.equals(getUsername()) && passW.equals(password))){
            return true;
        }
    return false;
    }
    
    //function that creates and saves the users detials in the database
    public void newUser(String name, String surname, String cellphone,String email, int AreaCode, String EmergencyNumber, int age, String gender, String password){
        ResultSet rs;
        try {
            String q1 = "INSERT INTO ProtectU_DB.`User` (ProtectU_DB.User.UserID, ProtectU_DB.User.`Name`, ProtectU_DB.User.Surname, ProtectU_DB.User.Cellphone, ProtectU_DB.User.Email , ProtectU_DB.User.AreaCode, ProtectU_DB.User.EmergencyContact, ProtectU_DB.User.Age, ProtectU_DB.User.Gender, ProtectU_DB.User.Password) VALUES(NULL, '"+name+"','"+surname+"','"+cellphone+"','"+email+"', '"+AreaCode+"', '"+EmergencyNumber+"', '"+age+"', '"+gender+"', '"+password+"')";
            //String q2 = " VALUES ('"+ name + "', '"+ surname +"' )";
            dbQuery().executeUpdate(q1);
            JOptionPane.showMessageDialog(null, "Welcome to the ProtectU Family " + name , "SUCCESSFUL", JOptionPane.PLAIN_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "COULD NOT INSERT");
    }
        
    }
    
    
}
