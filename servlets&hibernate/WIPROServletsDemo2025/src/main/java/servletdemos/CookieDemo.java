package servletdemos;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet implementation class CookieDemo
 */
@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 /*String name = request.getParameter("name");
	        String roll = request.getParameter("roll");
	        String email = request.getParameter("email");*/
	}
		/*Cookie c1 = new Cookie("c_name", name);//cookiename,cookievalue
        Cookie c2 = new Cookie("c_roll", roll);
        Cookie c3 = new Cookie("c_email", email);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		/*c1.setMaxAge(60 * 60); // 1 hour // 1 hour = 3600 seconds
        c2.setMaxAge(60 * 60);
        c3.setMaxAge(60 * 60);*/
		PrintWriter out = response.getWriter();
        out.println("<h2>Student data stored in cookies.</h2>");
        out.println("<a href='CookieView'>View Student Info</a>");
	}

}
