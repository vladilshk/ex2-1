package com.example.ex21._2beerApp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "SelectBeerServlet", value = "/SelectBeerServlet")
public class SelectBeerServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String taste = request.getParameter("taste");
        String country = request.getParameter("country");
        String alcoholic = request.getParameter("alcoholic");

        if (alcoholic == null){
            alcoholic = "alc";
        }

        Beer beer = new Beer(taste, country, alcoholic);
        String resultBeer = beer.chooseBeer();

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>"  + "Your beer is: " + resultBeer + "</h1>");
        out.println("<a href=\"select.html\">Choose again</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}