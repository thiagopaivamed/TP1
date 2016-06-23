/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.CategoriaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 'Rodolfo
 */
public class Categoria extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Models.Categoria categoria = null;
            String id = null;
            String action = request.getParameter("action");
            if (action != null) {
                switch (action) {
                    case "post":
                        String descricao = request.getParameter("descricao");
                        id = request.getParameter("id");
                        categoria = new Models.Categoria();
                        categoria.setDescricao(descricao);
                        new CategoriaDAO().saveCategoria(categoria, id);
                        response.sendRedirect("./index");
                    break;
                    case "edit":
                        id = request.getParameter("id");
                        categoria = new CategoriaDAO().getCategoria(id);
                        HttpSession session = request.getSession();
                        session.setAttribute("categoria", categoria);
                        response.sendRedirect("./edit.jsp");
                    break;
                    case "delete":
                        id = request.getParameter("id");
                        new CategoriaDAO().deleteCategoria(id);
                        response.sendRedirect("./index");
                    break;
                }
            } else {
                List categorias = new CategoriaDAO().getCategorias();
                String hurl ="/categoria/index.jsp";
                HttpSession session = request.getSession();
                session.setAttribute("categorias", categorias);
                request.getRequestDispatcher(hurl).forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(Categoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
