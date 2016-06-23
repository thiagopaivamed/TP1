/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.LocalizacaoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 'Rodolfo
 */
public class Localizacao extends HttpServlet {

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
            Models.Localizacao localizacao = null;
            String id = null;
            String action = request.getParameter("action");
            if (action != null) {
                switch (action) {
                    case "post":
                        String descricao = request.getParameter("descricao");
                        String palavrasChaves = request.getParameter("palavrasChaves");
                        id = request.getParameter("id");
                        localizacao = new Models.Localizacao();
                        localizacao.setDescricao(descricao);
                        localizacao.setPalavrasChaves(palavrasChaves);
                        new LocalizacaoDAO().saveLocalizacao(localizacao, id);
                        response.sendRedirect("./index");
                    break;
                    case "edit":
                        id = request.getParameter("id");
                        localizacao = new LocalizacaoDAO().getLocalizacao(id);
                        HttpSession session = request.getSession();
                        session.setAttribute("localizacao", localizacao);
                        response.sendRedirect("./edit.jsp");
                    break;
                    case "delete":
                        id = request.getParameter("id");
                        new LocalizacaoDAO().deleteLocalizacao(id);
                        response.sendRedirect("./index");
                    break;
                }
            } else {
                List localizacoes = new LocalizacaoDAO().getLocalizacoes();
                String hurl ="/localizacao/index.jsp";
                HttpSession session = request.getSession();
                session.setAttribute("localizacoes", localizacoes);
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
