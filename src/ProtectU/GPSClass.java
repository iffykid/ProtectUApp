/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProtectU;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.MouseInputListener;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Tile;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.TileListener;
import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;


public class GPSClass {

private static double lat = 0;
private static double lon = 0;
private static Connection c;
    
    //GPS Longitude and Latitude Locator
    public GPSClass(){
            ResultSet rs;
            try {
            UserClass uc = new UserClass();
            String q2 = " WHERE AreaCode = " + uc.getAreaCode();
            rs = dbQuery().executeQuery("SELECT Longitude, Latitude FROM Area " + q2);
            
            while(rs.next()){
                lat = rs.getDouble("Latitude");
                lon = rs.getDouble("Longitude");
                rs.next();
            }
            }
            catch (Exception e) {
                System.out.println("GPS not working");
            }
    }
    
    //SQL query function
    public java.sql.Statement dbQuery(){
    ResultSet rs;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProtectU_DB","root","");
        java.sql.Statement st = c.createStatement();
        
        return st;
        
    } catch (Exception e) {
        System.out.println("NO DB CONNECTION MADE");
    }
    
    return null;
    }
    
    //function that returns the latitude
    public double getLatitude(){
        return lat;
    }
    
    //function that returns the longitude
    public double getLongitude(){
        return lon;
    }

    //function that finds the Geoposition of a given area
    public GeoPosition getGeoposition(String area){
        //JXMapViewer mapViewer = new JXMapViewer();
        //mapViewer.setTileFactory(df);
        
        double lon = 0.00;
        double lat = 0.00;
        
        try {
            ResultSet rs;
            String q2 = " WHERE City = '" + area + "'" ;
            rs = dbQuery().executeQuery("SELECT Longitude, Latitude FROM Area " + q2);
            
            int counter = 0;
            while(rs.next()){
            //System.out.println("working");
            //System.out.println("A" + rs.getDouble("Longitude") + "##### " + rs.getDouble("Latitude"));
            lon = rs.getDouble("Longitude");
            lat = rs.getDouble("Latitude");
                System.out.println("LONGITUDE IS: " + lon + "\n LATITUDE IS: " + lat);
            }
            
            GeoPosition geoPosition = new GeoPosition(lat,lon);
            return geoPosition;
        } catch (Exception e) {
            System.out.println("LOCATION NOT FOUND");
        }
        JXMapViewer mapViewer = new JXMapViewer();
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        mapViewer.setTileFactory(tileFactory);
        
        return null;
    }
    
    //function that returns the area code of a given location
    public int areaCodeFinder(String area){
        int areaCode = 0;
        try {
            ResultSet rs;
            
            String a = "SELECT ProtectU_DB.Area.AreaCode FROM ProtectU_DB.Area WHERE City LIKE '"+area.toLowerCase()+"'";
            rs = dbQuery().executeQuery(a);
            
            while(rs.next()){
                areaCode = rs.getInt("AreaCode");
                //System.out.println("AREA CODE IS: " + areaCode);
            }
            return areaCode;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "WE ARE EITHER CURRENTLY NOT \n AVAILABLE IN YOUR AREA OR YOU HAVE \n ENTERED THE INCORRECT CITY");
        }
        return 0;
    }
    
    
    
}
