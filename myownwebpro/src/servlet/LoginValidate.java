package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PurchaseManage;
import model.Desti;
import model.Origin;
import model.PurchaseOrder;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n = request.getParameter("username");
		String p = request.getParameter("password");
		if (n.equals("java") && p.equals("1234")) {
			RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		} else {
			out.print("Sorry username or password error");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp?error=Sorry username or password error");
			rd.forward(request, response);
		}
	}
}
