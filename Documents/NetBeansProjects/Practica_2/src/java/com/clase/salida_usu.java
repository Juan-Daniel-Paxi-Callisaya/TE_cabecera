package com.clase;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida_usu", urlPatterns = {"/salida_usu"})
public class salida_usu extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String contra = request.getParameter("contra");
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
            out.println("<h2>Nombre:     " + nombre + "</h2>");
            out.println("<h2>Apellido:     " + apellido + "</h2>");
            out.println("<h2>Correo:      " + correo + "</h2>");
            out.println("<h2>Contraseña:      " + contra + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
