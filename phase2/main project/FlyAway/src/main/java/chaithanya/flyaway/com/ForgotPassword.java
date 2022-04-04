package chaithanya.flyaway.com;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.flightbooking.database.ConnectionUtil;
/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
 private static final long serialVersionUID = 1L;
 /**
 * @see HttpServlet#HttpServlet()
 */
 public ForgotPassword() {
 super();
 // TODO Auto-generated constructor stub
 }
/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException {
 // TODO Auto-generated method stub
 String email=request.getParameter("email");
 String password=request.getParameter("password");
 try {
 ConnectionUtil dao=new ConnectionUtil();
 HttpSession session=request.getSession();
 if(dao.changeAdminPassword(email,password)) {
 session.setAttribute("message", "Password Changed Successfully");
 }
 else {
 session.setAttribute("message", "Invalid Details");
 }
 } catch (ClassNotFoundException | SQLException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();
 }
 response.sendRedirect("AdminPage.jsp");
 }
}