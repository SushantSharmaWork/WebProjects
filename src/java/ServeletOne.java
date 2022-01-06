/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shubi
 */
@WebServlet(urlPatterns = {"/ServeletOne"})
public class ServeletOne extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("nm");
        out.println("<h1> Hello, "+name+" Welcome to my site</h1>");
        out.println("<h1> Cookie check <a href='ServeletTwo'> >Click me< </a></h1>");
        
        Cookie c = new Cookie("user_name",name);
        response.addCookie(c);
    }
}
