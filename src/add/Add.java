package add;


import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public void doGet(HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
			int a = Integer.parseInt(req.getParameter("num1"));
			int b = Integer.parseInt(req.getParameter("num2"));
			
			int k = a+b;
			PrintWriter out = res.getWriter();
			out.println("Addition is : "+k);
			
//			RequestDispatcher rd = req.getRequestDispatcher("sq");
//			rd.forward(req, res);
//			
			res.sendRedirect("sqr1?k="+k);
		}
	
}
