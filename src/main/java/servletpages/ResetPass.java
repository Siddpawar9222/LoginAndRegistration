package servletpages;

import java.io.IOException;
import java.io.PrintWriter;

import com.mysql.cj.Session;

import dao.UserDao;
import dao.UserDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/views/reset")
public class ResetPass extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			HttpSession session = request.getSession();
			String s1 = request.getParameter("newpass");

			int id = Integer.parseInt(request.getParameter("id"));

			UserDao d = new UserDaoImpl();
			Class.forName("com.mysql.cj.jdbc.Driver");

			if (d.resetUserPass(s1, id, request, response)) {
				System.out.println("Done");
				session.setAttribute("success", true);
				response.sendRedirect("../index.jsp");
			}
		} catch (Exception e) {
			response.sendRedirect("error.jsp");
		}
	}
}
