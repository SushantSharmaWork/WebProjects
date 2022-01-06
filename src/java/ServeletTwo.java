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


@WebServlet(urlPatterns = {"/ServeletTwo"})
public class ServeletTwo extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter p = response.getWriter();
        Cookie[] ck = request.getCookies();
        
        boolean f = false;
        String name = "";
        
        if(ck==null){
        p.println("<h1> You are new here</h1>");
        }
        else{
        for(Cookie c:ck){
        String tname= c.getName();
        //what is getting checked here as name is same for all values i.e user_name
        
        if(tname.equals("user_name")){
        f=true;
        name=c.getValue();
        }
        }
        }
        
        if(f)
        {
        p.println("<h1> Hello "+name+" Welcome back!!");
        }
        else{
        p.println("<h1> Hey! new guy");

        }
    }

}
