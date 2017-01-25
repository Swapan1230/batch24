package jrout.tutorial.advance.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetEmployeeDetails
 */
@WebServlet("/GetEmployeeDetails")
public class GetEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetEmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String driverName = "com.mysql.jdbc.Driver";
		String connectionURL = "jdbc:mysql://localhost:3306/employees";
		String connectionUserName = "root";
		String connectionPassword = "root";

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driverName);
			System.out.println("Driver Loaded....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(connectionURL, connectionUserName, connectionPassword);
			System.out.println("Connection is established...");
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM employees");
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Hello World!</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table>");
			while (rs.next()) {
				System.out.println(rs.getString("first_name") + " \t" + rs.getString("last_name"));

				out.println("<tr>");
				out.println("<td>" + rs.getString("first_name") + "</td>");
				out.println("<td>" + rs.getString("last_name") + "</td>");
				out.println("<td>Germany</td>");
				out.println("</tr>");

			}
			out.println("</table>");

			out.println("</body>");
			out.println("</html>");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
