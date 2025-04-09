package com.myorganisation.servlet;

import com.myorganisation.dao.StudentDAO;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CreateTableServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        StudentDAO studentDAO = new StudentDAO();
        System.out.println("before");
        studentDAO.createTable();
        System.out.println("After");
        resp.getWriter().println("Table Created Successfully!");
    }
}
