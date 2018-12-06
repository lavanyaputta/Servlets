import java.io.*;
import java.util.Enumeration;
import javax.servlet.*; 
import javax.servlet.http.*;

public class ServletConfigSample extends HttpServlet
{ 
	  
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
			 throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ServletConfig sConfig = getServletConfig();

		String Employee1 = sConfig.getInitParameter("Employee1");
		String Employee2 = sConfig.getInitParameter("Employee2");
		String Employee3 = sConfig.getInitParameter("Employee3");

		out.print("Employee1 : " + Employee1 + "<br/>");
		out.print("Employee2 : " + Employee2 + "<br/>");
		out.print("Employee3 : " + Employee3 + "<br/>");
		out.print("<hr/>");
		
		
		///////////////////////////////////////

		Enumeration<String> params = sConfig.getInitParameterNames();

		while( params.hasMoreElements() ) 
		{			 		
			out.print(params.nextElement() +  "<br/>");
		}

	}

}