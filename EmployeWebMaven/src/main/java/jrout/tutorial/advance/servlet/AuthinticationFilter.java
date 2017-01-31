package jrout.tutorial.advance.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AuthinticationFilter
 */
//@WebFilter(filterName="AuthinticationFilter", urlPatterns={"/*"})
public class AuthinticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthinticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// place your code here
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		HttpServletRequest httpRequest =(HttpServletRequest) request;
		// pass the request along the filter chain
		System.out.println("I am in the filter");
		String address = request.getRemoteAddr();
		String host = request.getRemoteHost();
		System.out.println(" Host "+ host + " Address "+ address);
		if("0:0:0:0:0:0:0:10".equals(host)){
			chain.doFilter(request, response);	
		}else{
			RequestDispatcher rd = httpRequest.getRequestDispatcher("WrongAccess");
			rd.forward(request, response);
//			httpResponse.sendRedirect("WrongAccess");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
