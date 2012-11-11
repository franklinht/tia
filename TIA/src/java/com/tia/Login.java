/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jdom2.JDOMException;

/**
 *
 * @author 30959306
 */
public class Login extends HttpServlet {

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
            throws ServletException, IOException, FileNotFoundException, JDOMException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        System.out.print("teste");
        
        ////////////////*********************************************////////////////
        ////////////////*********************************************////////////////
        //Este trecho do código será a simulação ao cadastro de um aluno em um banco de dados
        Aluno frank = new Aluno(30959306, "frank");
        //Este Trecho do código substitui sistemas legado.
        XMLParser.writeNotasXML();
        XMLParser.writeFaltasXML();
        ////////////////*********************************************////////////////
        ////////////////*********************************************////////////////
        
        if(login.equals(Integer.toString(frank.getTia())) && senha.equals(frank.getSenha())){
            response.sendRedirect(request.getContextPath()+ "/menu.jsp?login="+login+"&senha="+senha);
        }
        else{
            response.sendRedirect(request.getContextPath()+ "/erro_autenticacao.jsp");
        }
        
        out.close();
        
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (JDOMException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (JDOMException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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
