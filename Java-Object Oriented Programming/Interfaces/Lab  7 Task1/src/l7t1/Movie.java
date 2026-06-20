/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7t1;

/**
 *
 * @author ATECH
 */
public class Movie {
    private String mpaaRating;
    private int idNumber;
    private String title;

    public Movie(String mpaaRating, int idNumber, String title) {
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
        this.title = title;
    }

    
    public String getMpaaRating() {
        return mpaaRating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getTitle() {
        return title;
    }

    
    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
    public boolean equals(Object obj) {
        if (this == obj) return true;               
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie other = (Movie) obj;
        return this.idNumber == other.idNumber;
    }

    public double calcLateFees(int daysLate) {
        return daysLate * 2.0;
    }

    
    public String toString() {
        return "Movie[ID=" + idNumber + ", Title=" + title + ", MPAA=" + mpaaRating + "]";
    }
}
