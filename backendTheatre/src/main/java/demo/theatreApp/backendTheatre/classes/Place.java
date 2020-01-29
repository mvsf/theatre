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
public class Place {
        /**
     * le numéro de la place
     */
    private final int noPlace;

    /**
     * le rang de la place
     */
    private final int rang;

    /**
     * la position de la place dans le rang
     */
    private final int colonne;
    
    /**
     * la categorie de la place
     */
    private final char categorie;

    /**
     * 
     * @param noPlace le numéro de la place
     * @param rang   le rang 
     * @param colonne la colonne
     * @param categorie la catégorie
     */
    public Place(int noPlace, int rang, int colonne, char categorie) {
        this.noPlace = noPlace;
        this.rang = rang;
        this.colonne = colonne;
        this.categorie = categorie;
    }

    public int getNoPlace() {
        return noPlace;
    }

    public int getRang() {
        return rang;
    }

    public int getColonne() {
        return colonne;
    }

    public char getCategorie() {
        return categorie;
    }
}
