

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class CONTACT
 */
public class CONTACT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CONTACT() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		DbManager db=new DbManager();
		java.sql.Connection con=db.getConnection();
		String uName=request.getParameter("uName");
		String number=request.getParameter("pNumber");
		String email=request.getParameter("email");
		String comment=request.getParameter("comment");
		try {
	        PreparedStatement st=con.prepareStatement("insert into contact(uName,pNumber,email,comment)values('"+uName+"','"+number+"','"+email+"','"+comment+"')");
	        st.executeUpdate();
	        response.sendRedirect("index.jsp");
		}catch(Exception e) {
       e.printStackTrace();			
		}
		
		
		out.println("Working");
		response.sendRedirect("index.jsp");
	}

}
