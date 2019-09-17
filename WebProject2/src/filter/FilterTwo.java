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
@WebFilter("/FilterTwo")
public class FilterTwo implements Filter {

   
	public void destroy() {

	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter..............");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		if(name.length()<3)
		{
			out.println("Minimum length is 3");
		}
		else
		{
		chain.doFilter(request, response);
		}
		out.println("Filter Response...2");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
