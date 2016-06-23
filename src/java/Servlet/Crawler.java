/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.CategoriaDAO;
import DAO.LocalizacaoDAO;
import DAO.TweetDAO;
import Models.Localizacao;
import Models.Categoria;
import Models.Tweet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import twitter4j.JSONObject;

/**
 *
 * @author 'Rodolfo
 */
public class Crawler extends HttpServlet {

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
        List categorias;
        List localizacoes;
        try {
            String action = request.getParameter("action");
            if (action != null) {
                switch (action) {
                    case "post":
                        String categoriaId = request.getParameter("categoria");
                        String localizacaoId = request.getParameter("localizacao");
                        
                        Categoria categoria = new CategoriaDAO().getCategoria(categoriaId);
                        Localizacao localizacao = new LocalizacaoDAO().getLocalizacao(localizacaoId);
                        Beans.Crawler crawler = new Beans.Crawler();
                        List tweets = crawler.search(categoria, localizacao);
                        
                        Iterator<Tweet> iterator = tweets.iterator();
                        TweetDAO db = new TweetDAO();
                        Tweet tweet = null;
                        while (iterator.hasNext()) {
                            System.out.println("aa");
                            tweet = iterator.next();
                            if (!db.hastTweet(tweet)) {
                                db.saveTweet(tweet, null);
                            }
                        }
                        response.sendRedirect("./index");
                    break;
                    case "graph":
                        String type = request.getParameter("type");
                        if (type != null) {
                            PrintWriter out = response.getWriter();
                            JSONObject jsonObj = null;
                            switch (type) {
                                case "bar":
                                    response.setContentType("application/json");
                                    jsonObj = new TweetDAO().getDataGraphBar();
                                    out.print(jsonObj);
                                break;
                                case "line":
                                    response.setContentType("application/json");
                                    jsonObj = new TweetDAO().getDataGraphLine();
                                    out.print(jsonObj);
                                break;
                            }
                        }
                    break;
                }
            } else {
                categorias = new CategoriaDAO().getCategorias();
                localizacoes = new LocalizacaoDAO().getLocalizacoes();
                String hurl ="/index.jsp";
                HttpSession session = request.getSession();
                session.setAttribute("categorias", categorias);
                session.setAttribute("localizacoes", localizacoes);
                request.getRequestDispatcher(hurl).forward(request, response);
            }
        } catch (Exception ex) {
            Logger.getLogger(Crawler.class.getName()).log(Level.SEVERE, null, ex);
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
