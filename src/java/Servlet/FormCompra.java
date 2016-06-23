/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
public class FormCompra extends HttpServlet {

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
            
            //Gera o código aleatório da compra
            Random rn = new Random();
            Integer codigo = rn.nextInt(1000000);
            
            //Pega a data de hoje para a compra
            Date data = new java.util.Date();        
            String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data); 
            
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
            
            //Formulário
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cadastro de compra</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Cadastro de compra</h1>");
            out.println("<form action = \"./MostraCompra\" method=\"post\">");
            out.println("       <input type=\"hidden\" name=\"codigo\" value=\"" + codigo +"\"/>");
            out.println("        <input type=\"hidden\" name=\"data\" value=\"" + dataFormatada + "\"/>");
            out.println("    <p>");
            out.println("    Produto: ");
            out.println("        <select name=\"produto\">");
            out.println("                   <option value = \"\"> Selecione </option>");
            //Loop para pegar os produtos
            for (HashMap.Entry<String, Double> entry : produtos.entrySet()) {
                out.println("               <option value = \""+ entry.getKey() +"\"> "+ entry.getKey() +" </option>");
            }
            out.println("        </select>");
            out.println("    </p>");
            out.println("    <p>Data de entrega: <input type=\"text\" name=\"dataEntrega\" /></p>");
            out.println("    <p>Quantidade: <input type=\"text\" name=\"quantidade\" /></p>");
            out.println("    <input type=\"submit\" value=\"Enviar\" />");
            out.println("</form>");
            
            /*for (HashMap.Entry<String, Double> entry : produtos.entrySet()) {
                out.println(entry.getKey() + "/" + entry.getValue());
            }*/
            

            
         
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
