package com.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAO.Hibernate.AnnonceDAO;
import model.Annonce;
import java.sql.Connection;
import java.util.List;
import Connection.DatabaseConnection;


@WebServlet("/add")
public class AnnonceAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/AnnonceAdd.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            // Récupérer le prénom depuis le formulaire
            String title = request.getParameter("title");
            String description = request.getParameter("description");
            String adress = request.getParameter("adress");
            String mail = request.getParameter("mail");

            String message;

            if(title == null || title.isEmpty())
            {
                message = "Il manque l'élément titre dans le formulaire";
            }
            else if(description == null || description.isEmpty())
            {
                message = "Il manque l'élément description dans le formulaire";
            }
            else if (adress == null || adress.isEmpty())
            {
                message = "Il manque l'élément adress dans le formulaire";
            }
            else if(mail == null || mail.isEmpty())
            {
                message = "Il manque l'élément mail dans le formulaire";
            }
            else
            {
                // Connection conn = DatabaseConnection.getInstance();
                AnnonceDAO annonceDAO = new AnnonceDAO();
                System.out.println("Connexion réussi ! ");

                // Insérer une annonce
                Annonce annonce = new Annonce(title, description, adress, mail);
                annonceDAO.create(annonce);

                System.out.println("Annonce ajoutée : " + annonce.getId());

                DatabaseConnection.close();
                message = "L'annonce à été ajoutée avec l'id : "+annonce.getId()+".";
            }

            // Ajouter le message à la requête pour l'envoyer à la JSP
            request.setAttribute("message", message);

            // Rediriger vers nom.jsp
            request.getRequestDispatcher("AnnonceAdd.jsp").forward(request, response);


        } catch (Exception e) {
        e.printStackTrace();
        }

    }
    // Mettre à jour l'annonce
    // annonce.setTitle("Titre modifié");
    // annonceDAO.update(annonce);
    // System.out.println("Annonce mise à jour");

    // Lire une annonce par ID
    // Annonce retrievedAnnonce = annonceDAO.findById(annonce.getId());
    // System.out.println("Annonce trouvée : " + retrievedAnnonce.getTitle());

    // Supprimer l'annonce
    // annonceDAO.delete(annonce.getId());
    // System.out.println("Annonce supprimée");

    // Lire toutes les annonces
    // List<Annonce> annonces = annonceDAO.findAll();
    // System.out.println("Liste des annonces : " + annonces.size());

}




