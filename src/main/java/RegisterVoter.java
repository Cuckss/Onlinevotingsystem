

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;



public class RegisterVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		DbManager db=new DbManager();
		java.sql.Connection con=db.getConnection();
		
		String uName=request.getParameter("uName");
		String number=request.getParameter("pNumber");
		String email=request.getParameter("email");
		String vNumber=request.getParameter("voterNumber");
		String address=request.getParameter("address");
		String dob=request.getParameter("dob");
		
		try {
		PreparedStatement preparedStatement=con.prepareStatement("insert into voters(uName,pNumber,email,voterNumber,address,dob)values('"+uName+"','"+number+"','"+email+"',+'"+vNumber+"','"+address+"','"+dob+"')");
		preparedStatement.executeUpdate();
		response.sendRedirect("adminWelcome.jsp");
		
		} catch(Exception e) {
			e.getStackTrace();
		}
	}

}
