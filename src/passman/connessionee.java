/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author nicoa
 */
public class connessionee {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    /**
     *
     * @author nicoa
     */
    public static final String Driver = "org.apache.derby.jdbc.AutoloadedDriver";
    public static final String Jdbc = "jdbc:derby:P;create=true";

    // facciamo un metodo che controlla se la tabella utente per il login esiste già
    public static boolean SeTabUtEsiste() throws ClassNotFoundException, SQLException {
        try {

            Class.forName(Driver);
            Connection c = DriverManager.getConnection(Jdbc);
            ResultSet resultSet = c.getMetaData().getTables(null, null, "UTENTE", null);
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // facciamo un metodo che controlla se la tabella GestorePassword per il login esiste già
    public static boolean SeTabGPEsiste() throws ClassNotFoundException, SQLException {
        try {

            Class.forName(Driver);
            Connection c = DriverManager.getConnection(Jdbc);
            ResultSet resultSet = c.getMetaData().getTables(null, null, "GESTOREPASSWORD", null);
            return resultSet.next();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // facciamo un metodo per creare la tabella Utente se non esiste nel db
    public static void CreaTabUtente() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

            c.createStatement().execute("create table utente(nomeutente varchar(100), password varchar(100))");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    // facciamo un metodo per creare la tabella GestorePassword se non esiste nel db
    public static void CreaTabGP() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

            c.createStatement().execute("create table gestorepassword(id integer, nomeutente varchar(100), password varchar(100))");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    // facciamo un metodo per aggiungere elementi al db
    public static void AggiungiElementiGP(){
        try {
            Class.forName(Driver);
            Connection c = (Connection) DriverManager.getConnection(Jdbc);

           c.prepareStatement("INSERT INTO gestorepassword (id, nomeUt, password) VALUES (?, ?, ?)");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    

}
