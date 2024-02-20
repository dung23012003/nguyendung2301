package devmaster.edu.vn.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productCreate")
public class ProductCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ProductCreateServlet() {
		super();
	}
	//Hien thi trang them moi san pham
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException , IOException{
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/productCreate.jsp");
		dispatcher.forward(request, response);
	}
	//khi nguoi dung nhan vao nut ghi(submit)
	//Phuong thuc doPost se duoc goi
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		doGet(request,response);
	}
}
