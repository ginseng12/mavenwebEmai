package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.mail.EmailException;

import email.EmailUtils;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet(name = "ActionServlet",urlPatterns = "/test")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title= request.getParameter("title");
		//处理业务
		System.out.println(title);
		try {
			//response.getWriter().append("Served at: ").append(request.getContextPath());
			//跳转传参数
			EmailUtils.sendEmailsWithAttachments(title, "test");
			
			request.setAttribute("msg", "张三");
			//页面跳转
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		} catch (EmailException e) {
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
