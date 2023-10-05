package web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import metier.CalculPuissance;

import java.io.IOException;

@WebServlet(name = "css", urlPatterns = {"/controle", "*.do", "*.php"})
public class ServletPuissance extends HttpServlet {
    CalculPuissance p;

    public void init() {
        p = new CalculPuissance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("x", new Puissance());
        request.getRequestDispatcher("VuePuissance.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double x = p.calcul_p(a, b);
        Puissance pui = new Puissance();
        pui.setA(a);
        pui.setB(b);
        pui.setP(x);
        request.setAttribute("model", pui);
        request.getRequestDispatcher("VuePuissance.jsp").forward(request, response);
    }}