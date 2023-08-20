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


@WebServlet("/login")
public class Login extends HttpServlet {
     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 
    	 try {
        HttpSession session=request.getSession();  
        PrintWriter out =response.getWriter() ;
        String s1 = request.getParameter("email");
        String s2 = request.getParameter("password");
        session.setAttribute("myemail", s1);
        
        UserDao d = new UserDaoImpl() ;
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        if(d.selectUser(s1, s2, request, response)) {
        	     response.sendRedirect("views/home.jsp");      
        }else {
           	out.print("Data not found ..............");  
		}
        
        }catch (Exception e) {
			 response.sendRedirect("views/error.jsp"); 
		}
     }
}
