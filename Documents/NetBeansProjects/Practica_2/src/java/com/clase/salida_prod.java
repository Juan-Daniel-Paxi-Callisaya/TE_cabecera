
package com.clase;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "salida_prod", urlPatterns = {"/salida_prod"})
public class salida_prod extends HttpServlet {

@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("producto");
        String categoria = request.getParameter("categoria");
        String existencia = request.getParameter("existencia");
        String precio = request.getParameter("precio");
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet salida_ins</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Los datos resividos son:</h1>");
            out.println("<br>");
            out.println("<h2>producto:     " + producto + "</h2>");
            out.println("<h2>categoria:     " + categoria + "</h2>");
            out.println("<h2>existencia:      " + existencia + "</h2>");
            out.println("<h2>precio:      " + precio + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
