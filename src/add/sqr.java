package add;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sqr extends HttpServlet{

	private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException {
			
			int k = Integer.parseInt(req.getParameter("k"));
			k = k * k;
			
			PrintWriter out = res.getWriter();
			out.println("Multiple is : " + k);
		}	
}
