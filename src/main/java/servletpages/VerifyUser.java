package servletpages;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import dao.UserDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/views/verify")
public class VerifyUser extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 try {
			
    		HttpSession session=request.getSession();  
 	    PrintWriter out =response.getWriter() ;
        String email = request.getParameter("email");
        Long phone =  Long.parseLong( request.getParameter("phone"));
        session.setAttribute("myemail1", email);
        UserDao d = new UserDaoImpl();
        Class.forName("com.mysql.cj.jdbc.Driver");
        if(d.verifyUser(email, phone, request, response)) {
        	 response.sendRedirect("reset.jsp");
        	}
        
    	 } catch (Exception e) {
    		 response.sendRedirect("error.jsp");
 		}
    }
    	 
}
