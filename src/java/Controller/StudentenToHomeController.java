/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Bedrijven;
import DAL.Stageplaatsen;
import DAL.Studententabel;
import DAO.DAOBedrijven;
import DAO.DAOStageplaatsen;
import DAO.DAOStudententabel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yvex
 */
public class StudentenToHomeController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            String path = "studenten.jsp";
            RequestDispatcher dispatch = request.getRequestDispatcher(path);
            String userId = request.getParameter("userId");
            DAOStudententabel dao = new DAOStudententabel();
            Studententabel student = dao.getUsersByUname(userId);
            ArrayList<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
            Set<String>noDuplicates = new LinkedHashSet<String>();
            DAOStageplaatsen daostageplaatsen = new DAOStageplaatsen();
            bedrijvenlist = (ArrayList<Stageplaatsen>) daostageplaatsen.getAllUserss();
            ArrayList<String> bedrijfsnamen = new ArrayList<>();
            
            for (Stageplaatsen elem : bedrijvenlist) {
               
                bedrijfsnamen.add(elem.getNaam());
            
            }
            
            for (String elem : bedrijfsnamen) {
                noDuplicates.add(elem);
            }
            if (student != null) {
                
                
                String uID = student.getUserId() ;
                
            
                    if ((uID == null ? userId == null : uID.equals(userId))) {
                   
            
                        request.setAttribute("userId", userId);
                        request.setAttribute("uname", student.getVoornaam()); 
                        request.setAttribute("primID",Integer.toString(student.getId()) );
                        request.setAttribute("bedrijvenlist", noDuplicates);
                        dispatch.forward(request, response) ;
                    }
            }         
            
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
