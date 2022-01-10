package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlServlet
 */
@WebServlet(name = "JstlServlet",urlPatterns = "/jstl")
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JstlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String page="/message.jsp";
		if("1".equals(type)) {
			request.setAttribute("flag", true);
			request.setAttribute("name", "zhangsan");
			page="/jstl/flag_jstl.jsp";
		}else if("2".equals(type)) {
			request.setAttribute("age", 8);
			page="/jstl/choose.jsp";
		}else if("3".equals(type)) {
			//读取数据库
			List<DbUser> userList= new ArrayList<DbUser>();
			for (int i = 0; i < 10; i++) {
				userList.add(new DbUser(""+i, "test"+i, "testpwd"+i));
			}
			request.setAttribute("userList", userList);
			page="/jstl/foreach.jsp";
		}
		request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
