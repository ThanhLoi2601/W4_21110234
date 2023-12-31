/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package murach.email;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import murach.business.User;


/**
 *
 * @author DELL
 */
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String url ="/index.html";
        
        String action = request.getParameter("action");
        if(action == null){
            action ="join";
        }
        
        if(action.equals("join")){
            url ="/index.html";
        }
        else if (action.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String hear = request.getParameter("hear");
            String rece = request.getParameter("checkReceive");
            Boolean bolRec = true;
            if(rece == null)
                bolRec = false;
            String contact = request.getParameter("contact");
            User user = new User(firstName, lastName, email, hear, bolRec, contact);
            //UserDB.insert(user);
            request.setAttribute("user", user);
            url = "/thanks.jsp";
        }
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

}
