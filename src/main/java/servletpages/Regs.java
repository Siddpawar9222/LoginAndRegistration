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

@WebServlet("/views/reg")
public class Regs extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          HttpSession session = req.getSession() ;
		try {
            
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			long phone = Long.parseLong(req.getParameter("phone"));
			String gender = req.getParameter("gender");

			UserDao d = new UserDaoImpl();
            Class.forName("com.mysql.cj.jdbc.Driver");

			if (d.createUser(name, email, password, phone, gender, req, resp)) {
				System.out.println("Done");
				session.setAttribute("success", true);
				resp.sendRedirect("../index.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error");
			resp.sendRedirect("error.jsp");
		}

	}

}