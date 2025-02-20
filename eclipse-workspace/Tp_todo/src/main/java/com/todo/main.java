package com.todo;

import DAO.Hibernate.AnnonceDAO;

public class main {
    public static void main(String[] args) {
        AnnonceDAO a = new AnnonceDAO();


        System.out.printf("" + a.list());
    }
}
