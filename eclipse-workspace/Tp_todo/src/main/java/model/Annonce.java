package model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "annonce")
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String adress;
    private String mail;
    private Timestamp date;

    public Annonce(int id, String title, String description, String adress, String mail, Timestamp date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.adress = adress;
        this.mail = mail;
        this.date = date;
    }

    public Annonce(String title, String description, String adress, String mail) {
        this(0, title, description, adress, mail, new Timestamp(System.currentTimeMillis()));
    }

    public Annonce() {

    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getAdress() { return adress; }
    public String getMail() { return mail; }
    public Timestamp getDate() { return date; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setAdress(String adress) { this.adress = adress; }
    public void setMail(String mail) { this.mail = mail; }
    public void setDate(Timestamp date) { this.date = date; }
}
