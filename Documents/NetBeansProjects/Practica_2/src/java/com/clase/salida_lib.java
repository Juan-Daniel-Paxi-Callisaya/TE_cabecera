package com.clase;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salida_lib", urlPatterns = {"/salida_lib"})
public class salida_lib extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String resumen = request.getParameter("resumen");
        String medio = request.getParameter("medio");

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
            out.println("<h2>titulo:     " + titulo + "</h2>");
            out.println("<h2>autor:     " + autor + "</h2>");
            out.println("<h2>resumen:      " + resumen + "</h2>");
            out.println("<h2>medio:      " + medio + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
