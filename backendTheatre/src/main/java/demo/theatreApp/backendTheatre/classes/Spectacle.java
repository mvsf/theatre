/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.theatreApp.backendTheatre.classes;

/**
 *
 * @author seffarm
 */
public class Spectacle {
    
    /**
     * identifiant du spectacle
     */
    private final int id;

    /**
     * le titre du spectacle
     */
    private final String titre;

    /**
     *
     * @param id identifiant du spectacle dans la BD
     * @param titre le titre du spectacle
     */
    public Spectacle(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }
}
