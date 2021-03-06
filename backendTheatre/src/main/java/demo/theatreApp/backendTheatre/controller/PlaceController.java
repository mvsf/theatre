/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.theatreApp.backendTheatre.controller;

import demo.theatreApp.backendTheatre.DAO.SpectacleDAO;
import demo.theatreApp.backendTheatre.classes.Spectacle;
import java.sql.SQLException;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seffarm
 */
@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class PlaceController {
    
        /**
     * Fonction qui permet de récupérer la liste de tous les spectacles
     *
     * @return la liste de tous les spectacles
     * @throws java.sql.SQLException
     */
    @RequestMapping(method = RequestMethod.GET, value = "/placesNonDisponibles")

    public List<Spectacle> getAllSpectacle() throws SQLException, ClassNotFoundException {
        return SpectacleDAO.getAllSpectacle();
    }
    
}
