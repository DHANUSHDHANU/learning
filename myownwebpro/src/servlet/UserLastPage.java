package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PurchaseManage;
import model.PurchaseOrder;

/**
 * Servlet implementation class UserLastPage
 */
@WebServlet(name = "userlastpage", urlPatterns = { "/userlastpage" })
public class UserLastPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
      PurchaseManage purchaseManage = new  PurchaseManage();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PurchaseManage purchaseManage = new  PurchaseManage();
		List<PurchaseOrder> po = purchaseManage.retrivePurchase();
		System.out.println("inside 3rd servlet");
		Iterator<PurchaseOrder> itr = po.iterator();
		while(itr.hasNext()){
			PurchaseOrder p1=itr.next();
			System.out.println(p1.getPoNumber());
			System.out.println(p1.getSeller());
		    System.out.println(p1.getDueDate());
		    System.out.println(p1.getStatus());
		    System.out.println(p1.getPriority());
		    System.out.println(p1.getOriginAddress());
		    System.out.println(p1.getDesignationAddress());
		    System.out.println(p1.getTransResp());
		    System.out.println("inside 3rd servlet while");			
			
		}
		request.setAttribute("purchase", po);
		 RequestDispatcher rd=request.getRequestDispatcher("lastpage.jsp");
			rd.forward(request, response); 

	}

}
