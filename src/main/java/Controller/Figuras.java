package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Figuras
 */
@WebServlet("/Figuras")
public class Figuras extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Figuras() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		TODO Auto-generated method stub
//		doGet(request, response);

		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		int n3 = Integer.parseInt(request.getParameter("n3"));

		if (n1 <= 0 && n2 <= 0 && n3 <= 0) {
			response.getWriter().println("  Digite valores validos");


		} else if (n2 <= 0 && n3 <= 0 && n1 > 0 || n3 <= 0 && n1 <= 0 && n2 > 0 || n2 <= 0 && n1 <= 0 && n3 > 0) {
			response.getWriter().println("  Voce contruiu uma reta");

		} else if (n1 > 0 && n2 > 0 && n3 <= 0 || n3 > 0 && n1 > 0 && n2 <= 0 || n3 > 0 && n2 > 0 && n1 <= 0) {
			if (n1 == n2 && n2 == n3 && n1 == n2) {
				response.getWriter().println("  Voce construiu um quadrado");

			} else {
				response.getWriter().println("  Voce construiu um retangulo");
			}
		}

		else {
			if (n1 != n2 && n2 != n3 && n3 != n1) {
				response.getWriter().println("  Voce construiu um triangulo escaleno");
				
			} else if (n1 == n2 && n2 == n3 && n3 == n1) {
				response.getWriter().println("  Voce construiu um triangulo equilatero ");
				
			} else {
				response.getWriter().println("  Voce construiu um triangulo escaleno");
			}

		}

	}// end doPost

}// end class
