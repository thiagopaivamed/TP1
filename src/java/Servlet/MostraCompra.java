/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
public class MostraCompra extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //Produtos
            HashMap<String, Double> produtos = new HashMap<String, Double>();
            produtos.put("Achocolatado", 1.50);
            produtos.put("Suco", 2.50);
            produtos.put("Vinho", 3.50);
            produtos.put("Arroz", 4.50);
            produtos.put("Atum", 5.50);
            produtos.put("Azeite", 6.50);
            produtos.put("Azeitona", 7.50);
            produtos.put("Batata  palha", 8.50);
            produtos.put("Baunilha", 9.50);
            produtos.put("Biscoito", 10.50);
            
            //Pegar parâmetros
            Integer codigo = Integer.parseInt(request.getParameter("codigo"));
            String data = request.getParameter("data");
            String produto = request.getParameter("produto");
            String dataEntrega = request.getParameter("dataEntrega");
            Integer quantidade = Integer.parseInt(request.getParameter("quantidade"));
            
            //Calcular preço total
            Double preco = produtos.get(produto).doubleValue() * quantidade;
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Formulário de compra enviado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<ul>Dados da compra");
            out.println("<li>Codigo: " + codigo +"</li>");
            out.println("<li>Data: " + data +"</li>");
            out.println("<li>Produto: " + produto +"</li>");
            out.println("<li>Data de Entrega: " + dataEntrega +"</li>");
            out.println("<li>Preço total " + preco +"</li>");
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
