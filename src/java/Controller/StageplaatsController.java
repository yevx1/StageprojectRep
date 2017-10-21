/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAL.Stageplaatsen;
import DAO.DAOStageplaatsen;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class StageplaatsController extends HttpServlet {

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
               String path = "list.jsp";
        RequestDispatcher dispatch = request.getRequestDispatcher(path);
//        HttpSession Session = request.getSession();
        
       
            
            /* TODO output your page here. You may use following sample code. */
            
             String naam =  request.getParameter("naam");
             String adres = request.getParameter("adres");
             String postcode = request.getParameter("postcode");             
             String email =  request.getParameter("email");
             String beschrijving =  request.getParameter("beschrijving");
             String bedrijvenID = request.getParameter("primID");
             String userId = request.getParameter("userId");
             Integer idBedrijven = Integer.parseInt(bedrijvenID);
//             Integer IDbedrijven = Integer.parseInt(bedrijvenID);
            
            
            
            ArrayList<Stageplaatsen> bedrijvenlist = new ArrayList<Stageplaatsen>();
            Stageplaatsen user = new Stageplaatsen();
            DAOStageplaatsen dao = new DAOStageplaatsen();
            user.setNaam(naam);
            user.setAdres(adres);
            user.setEmail(email);
            user.setPostcode(postcode);
            user.setBeschrijving(beschrijving);
            user.setBedrijvenId(idBedrijven);
            dao.addUsers(user);
            bedrijvenlist = bedrijvenlist = (ArrayList<Stageplaatsen>) dao.getFKIDUserss(idBedrijven);
            request.setAttribute("bedrijvenlist", bedrijvenlist);
            request.setAttribute("userId", userId);
            System.out.println("lengte = " + bedrijvenlist.size());
//            
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet StageBedrijvenServletController</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h2> Servlet Van Bedrijven</h2>");
//           
//            out.println("</body>");
//            out.println("</html>");
//             HttpSession session=request.getSession();
//            request.setAttribute("bedrijvenID", bedrijvenID);
//            response.sendRedirect("list.jsp");
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
