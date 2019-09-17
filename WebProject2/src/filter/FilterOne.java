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
import javax.servlet.http.HttpServlet;


@WebFilter("/FilterOne")
public class FilterOne implements Filter {

  

	  private int hitCount; 

	   public void  init(FilterConfig config) throws ServletException {
	      // Reset hit counter.
	      hitCount = 0;
	   } 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 hitCount++;
		System.out.println("Filter..............");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		out.println("request:"+hitCount+"<br>");
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
	@Override
	public void destroy() {
		
		
	}
	

	
	
		
	}


