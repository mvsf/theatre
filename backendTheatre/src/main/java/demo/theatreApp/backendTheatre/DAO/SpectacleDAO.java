/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.theatreApp.backendTheatre.DAO;

import demo.theatreApp.backendTheatre.classes.Spectacle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seffarm
 */
public class SpectacleDAO {
    private static String DATABASE = "jdbc:sqlite:/home/seffarm/Bureau/demoTheatreApp/sql/DemoTheatre.db";
    private static final String ALL_SPECT_QUERY = "SELECT * FROM lesspectacles";

    /**
     * Retourne une liste de tous les spectacles présent dans la base, avec pour
     * chaque spectacle une information minimale (identifiant, titre).
     *
     * @return La liste des Spectacles avec uniquement leur titre et numéro
     * @throws SQLException si un problème avec la BD.
     * @throws java.lang.ClassNotFoundException
     */
    public static List<Spectacle> getAllSpectacle() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        try (Connection conn = DriverManager.getConnection(DATABASE);
                Statement stmt = conn.createStatement()) {
            List<Spectacle> res = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(ALL_SPECT_QUERY);
            while (rs.next()) {
                res.add(new Spectacle(rs.getInt("idSpectacle"), rs.getString("titre")));
            }
            return res;
        }
    }
}
