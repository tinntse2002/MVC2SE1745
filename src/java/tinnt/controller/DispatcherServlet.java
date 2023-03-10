/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinnt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tin
 */
@WebServlet(name = "DispatcherServlet", urlPatterns = {"/DispatcherServlet"})
public class DispatcherServlet extends HttpServlet {
    private final String LOGIN_PAGE = "login.html";
    private final String LOGIN_CONTROLLER = "LoginServlet";
    private final String SEARCH_CONTROLLER = "SearchLastNameServlet";
    private final String DELETE_RECORD_CONTROLLER = "DeleteRecordServlet";
    private final String UPDATE_PASS_ROLE_CONTROLLER = "UpdatePassRoleServlet";
    private final String START_CONTROLLER = "StartTimeServlet";
    private final String NULL_SERVLET = "NullServlet";
    private final String ADD_ITEM_TO_CART_CONTROLLER = "AddItemToCartServlet";
    private final String VIEW_CART_CONTROLLER = "viewCart.jsp";
    private final String REMOVE_ITEMS_FROM_CART_CONTROLLER = "RemoveItemsFromCartServlet";
    private final String CREATE_NEW_ACCOUNT_CONTROLLER = "CreateNewAccountServlet";
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
        String url = LOGIN_PAGE;
        //1. Which button did user click?
        String button = request.getParameter("btAction");
        try {
            if(button == null) {
                //fw to login page
                url = NULL_SERVLET;
                
            } else if (button.equals("Login")) {
                url = LOGIN_CONTROLLER;
            } else if (button.equals("Search")) {
                url = SEARCH_CONTROLLER;
            } else if (button.equals("delete")) {
                url = DELETE_RECORD_CONTROLLER;
            } else if (button.equals("Update")) {
                url = UPDATE_PASS_ROLE_CONTROLLER;
            } else if(button.equals("Add Book to Your Card")) {
                url = ADD_ITEM_TO_CART_CONTROLLER;
            } else if (button.equals("View Your Card")) {
                url = VIEW_CART_CONTROLLER;
            } else if (button.equals("Add More")) {
                url = ADD_ITEM_TO_CART_CONTROLLER;
            } else if (button.equals("Remove")) {
                url = REMOVE_ITEMS_FROM_CART_CONTROLLER;
            } else if (button.equals("Create New Account")) {
                url = CREATE_NEW_ACCOUNT_CONTROLLER;
            }
        } finally {
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
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
