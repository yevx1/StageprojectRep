/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Bedrijven;
import DAL.Stageplaatsen;
import DAO.DAOStageplaatsen;
import beansStateFul.BedrijvenBLocal;
import beansStateFul.BedrijvenBLocalLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author yvex

*/

@WebServlet(name = "CompanyListController", urlPatterns = {"/CompanyList"})
public class CompanyListController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @EJB
//    BedrijvenBLocalLocal bedrijfB;
//    UserBean user;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String path = "list.jsp";
            RequestDispatcher dispatch = request.getRequestDispatcher(path);
//            try {  
//                InitialContext ic = new InitialContext();
//                bedrijfB = (BedrijvenBLocal) ic.lookup("java:local/Stagebedrijven7/BedrijvenBLocal");
//            } catch (NamingException ex) {
//                System.out.println("nope");
//            }
            
//            Bedrijven example = bedrijfB.getBedrijf();
//            String naamExample = example.getNaam();
            
            String un = request.getParameter("un");
            String userId = request.getParameter("userId");
            String primID = request.getParameter("primID");
            
            
            
            
            
             List<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
             DAOStageplaatsen dao = new DAOStageplaatsen();
             Integer idPrim = Integer.parseInt(primID);
             bedrijvenlist = (ArrayList<Stageplaatsen>) dao.getFKIDUserss(idPrim);
             

             request.setAttribute("bedrijvenlist", bedrijvenlist);
             request.setAttribute("userId", userId);
        
        
           
              //allerlaatste actie !!!
             dispatch.forward(request, response);            
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
