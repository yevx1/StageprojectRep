/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Studententabel;
import DAO.DAOStudententabel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yvex
 */
public class StudentenLoginController extends HttpServlet {

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
            HttpSession session=request.getSession();
        
           String userId = request.getParameter("un");
            String paswoord = request.getParameter("pw");
          Studententabel user = new Studententabel();

            DAOStudententabel dao = new DAOStudententabel();
            
            user = dao.getUsersByUname(userId);
            String uID = user.getUserId();
                String uPaswoord = user.getPaswoord();
            
              if ((uID == null ? userId == null : uID.equals(userId)) && (uPaswoord == null ? paswoord == null : uPaswoord.equals(paswoord))) {
                   
            
            session.setAttribute("userId", userId);
            session.setAttribute("uname", user.getVoornaam());
//            response.sendRedirect("studenten.jsp?userId="+user.getUserId()+"&uname="+user.getVoornaam());
            dispatch.forward(request, response);
                }
              else response.sendRedirect("failure.jsp");
//              
//            users =(ArrayList<Studententabel>) dao.getAllUserss();
//            for (Studententabel user : users) {
//                
//                String uID = user.getUserId();
//                String uPaswoord = user.getPaswoord();
//                if ((uID == null ? userId == null : uID.equals(userId)) && (uPaswoord == null ? paswoord == null : uPaswoord.equals(paswoord))) {
//                   
//            HttpSession session=request.getSession();
//            session.setAttribute("userId", userId);
//            session.setAttribute("uname", user.getVoornaam());
////            response.sendRedirect("studenten.jsp?userId="+user.getUserId()+"&uname="+user.getVoornaam());
//            dispatch.forward(request, response);
//                }
                
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
