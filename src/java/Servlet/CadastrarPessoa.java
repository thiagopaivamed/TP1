package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import DAO.PessoaDAO;
import Models.Pessoa;

/**
 *
 * @author Thiago
 */
@WebServlet(name = "CadastrarPessoa", urlPatterns = {"/CadastrarPessoa"})
@MultipartConfig(maxFileSize = 16177215)
public class CadastrarPessoa extends HttpServlet 
{    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception 
    {
        HttpSession session = request.getSession();
        try 
        {
            String cmd = request.getParameter("cmd");
            Pessoa pessoa;
            PessoaDAO pessoaDAO;
            InputStream inputStream = null;
            
            Part foto = request.getPart("foto");
            
            inputStream = foto.getInputStream();          
            
            if (cmd.equalsIgnoreCase("cadastrar")) 
            {   
                pessoa = new Pessoa(
                        request.getParameter("nome"),
                        request.getParameter("nascimento"), 
                        inputStream,
                        request.getParameter("email"),
                        request.getParameter("senha"));

                pessoaDAO = new PessoaDAO();                              
                pessoaDAO.Cadastrar(pessoa);
                session.setAttribute("pessoa", pessoa);
                response.sendRedirect("./index");
                
            }

        }
        catch (Exception e) 
        {
              e.printStackTrace();
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CadastrarPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
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
