package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserDaoImpl implements UserDao {

	final static String URL = "jdbc:mysql://localhost:3306/jspservletprojects";
	final static String USER = "root";
	final static String PASS = "123456";

	@Override
	public boolean createUser(String name, String email, String password, long phone, String gender,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement st = conn.prepareStatement(
						"insert into logindetails(name,email,password,phone,gender) values(? ,?,? ,?,?)");) {

			st.setString(1, name);
			st.setString(2, email);
			st.setString(3, password);
			st.setLong(4, phone);
			st.setString(5, gender);

			int rowsInserted = st.executeUpdate();

			if (rowsInserted > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
			// Redirect to error page
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}

		return false;
	}

	@Override
	public boolean selectUser(String email, String password, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement st = conn
						.prepareStatement("select * from logindetails where email= ? and password = ?");) {
			st.setString(1, email);
			st.setString(2, password);

			ResultSet set = st.executeQuery();

			System.out.println(set);

			if (set.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");

			// Redirect to error page
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/error.jsp");
			dispatcher.forward(request, response);
		}
		return false;
	}

	@Override
	public boolean verifyUser(String email, Long phone, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
				PreparedStatement st = conn
						.prepareStatement("select * from logindetails where email= ? and phone = ?");) {
			st.setString(1, email);
			st.setLong(2, phone);

			ResultSet set = st.executeQuery();

			System.out.println(set);

			if (set.next()) {
				int id = set.getInt("id");
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");

			// Redirect to error page
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/error.jsp");
			dispatcher.forward(request, response);
		}
		return false;
	}

@Override
public boolean resetUserPass(String password, int id , HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
		PreparedStatement st = conn
				.prepareStatement("update logindetails set password=? where id = ? ");) {
	st.setString(1, password);
	st.setLong(2, id);
	
	int rowAffected = st.executeUpdate();
	System.out.println(rowAffected);
	
	if (rowAffected==1) {
		return true ;
	}
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("error");
	
	// Redirect to error page
	RequestDispatcher dispatcher = request.getRequestDispatcher("views/error.jsp");
	dispatcher.forward(request, response);
}
return false;

}
}
