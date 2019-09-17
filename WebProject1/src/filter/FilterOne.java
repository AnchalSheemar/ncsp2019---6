package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterOne
 */
@WebFilter("/FilterOne")
public class FilterOne implements Filter {

   
	public void destroy() {

	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter..............");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		if(name.isEmpty())
		{
			out.println("Name cannot be empty");
		}
		else
		{
		chain.doFilter(request, response);
		}
		out.println("Filter Response...1");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
