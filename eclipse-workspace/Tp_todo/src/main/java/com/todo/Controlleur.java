package com.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class Controlleur extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer le prénom depuis le formulaire
        String prenom = request.getParameter("prenom");

        // Ajouter le prénom à la requête pour l'envoyer à la JSP
        request.setAttribute("prenom", prenom);

        // Rediriger vers nom.jsp
        request.getRequestDispatcher("nom.jsp").forward(request, response);
    }
}
