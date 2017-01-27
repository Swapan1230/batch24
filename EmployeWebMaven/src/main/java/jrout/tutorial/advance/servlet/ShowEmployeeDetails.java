package jrout.tutorial.advance.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.advance.domain.Employee;

/**
 * Servlet implementation class GetEmployeeDetails
 */
@WebServlet("/ShowEmployeeDetails")
public class ShowEmployeeDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ShowEmployeeDetails() {
        System.out.println("Constructor....");;
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initilizing the Servlet...");
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Destroying the Servlet...");
	}

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = (Employee) request.getAttribute("employee");
		System.out.println("This is my HelloWorld Program...");
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("myname");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>"+emp.getEmployeeNo() +"</h1>");
        out.println("<h1>"+emp.getFirstName() +"</h1>");
        out.println("<h1>"+emp.getLastName() +"</h1>");
        
        out.println("</body>");
        out.println("</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
