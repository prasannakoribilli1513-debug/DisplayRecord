package com.example.displayrecords;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {

            out.println("<html>");
            out.println("<body>");
            out.println("<h2>Login Successful!</h2>");
            out.println("<p>Welcome, " + username + "</p>");
            out.println("</body>");
            out.println("</html>");

        } else {

            out.println("<html>");
            out.println("<body>");
            out.println("<h2>Login Failed!</h2>");
            out.println("<p>Invalid Username or Password</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}