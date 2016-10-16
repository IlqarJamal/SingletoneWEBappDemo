/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import singletone.SingleObject;

/**
 *
 * @author user
 */
public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String login = request.getParameter("login");
        SingleObject object = SingleObject.getInstance();
        object.showMessage(request.getSession().getId() + " " + request.getContextPath() + " " + request.getMethod());
        response.getWriter().write(request.getSession().getId() + " " + request.getContextPath() + " " + request.getMethod());
    } 

}
