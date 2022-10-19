package com.example.ex21._1Time;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Date date = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "The current time is: " + time.format(date) + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}