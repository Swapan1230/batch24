package jrout.tutorial.advance.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jrout.tutorial.advance.dao.IEmployeeDAO;
import jrout.tutorial.advance.dao.impl.EmployeeDAOImpl;
import jrout.tutorial.advance.domain.Employee;
import org.apache.log4j.Logger;
/**
 * Servlet implementation class GetEmployeeDetails
 */
@WebServlet("/WrongAccess")
public class WrongAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(EmployeeController.class);
	
    /**
     * Default constructor. 
     */
    public WrongAccess() {
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
//		System.out.println("Entering the service method...");
		logger.info("Entering the service method... WrongAccess");
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Sorry Wrong access");
 		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
