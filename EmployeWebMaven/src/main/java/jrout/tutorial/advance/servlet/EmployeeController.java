package jrout.tutorial.advance.servlet;

import java.io.IOException;
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
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(EmployeeController.class);
	
    /**
     * Default constructor. 
     */
    public EmployeeController() {
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
		logger.info("Entering the service method...");
		String type = request.getParameter("type");
		
		IEmployeeDAO dao = new EmployeeDAOImpl();
		logger.debug("DAO has been initialized...");
//		logger.error(message);
//		System.out.println("DAO has been initialized...");
		
		if("allemployee".equals(type)) {
			String gender = request.getParameter("gender");	
			List<Employee> employees = dao.fetchEmployees(gender);
			for(Employee emp : employees) {
				System.out.println(emp.getEmployeeNo() + " " + emp.getFirstName());
			}
			
			request.setAttribute("employees", employees);
			RequestDispatcher rd =  request.getRequestDispatcher("ShowAllEmployeeDetails");
			rd.forward(request, response);
			
		}else {
			int empId = Integer.parseInt(request.getParameter("empId"));
			Employee emp = dao.fetchEmployee(empId);
			System.out.println(emp.getEmployeeNo() + " " + emp.getFirstName());
			request.setAttribute("employee", emp);
//			RequestDispatcher rd =  request.getRequestDispatcher("ShowEmployeeDetails");
			RequestDispatcher rd =  request.getRequestDispatcher("showemployee.jsp");
			rd.forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
