package com.example.ex21._4context;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet(name = "ServletContext", value = "/ServletContext")
public class Context extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        int counter = 0;
        if (servletContext.getAttribute("counter") != null){
            counter = (int) servletContext.getAttribute("counter");
            System.out.println(counter);
        }

        servletContext.setAttribute("counter", counter + 1);

        PrintWriter out = response.getWriter();
        out.println(counter);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
