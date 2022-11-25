package webdeving.weblab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Обрабатывает POST запрос (не по варианту)
 * */
@WebServlet(name = "badMethodServlet", value = "/bad-method-servlet")
public class BadMethodServlet extends HttpServlet {

    public void init() {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html lang=\"ru\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">\n");
        out.println("<title>Error405</title>");
        out.println("<style>");
        out.println("@import url('styles/Index.css');");
        out.println("@import url('styles/BadRequest.css');");
        out.println("@import url('styles/BadMethod.css');");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table id=\"layout\">");
        out.println("<tr>");
        out.println("<td>");
        out.println("<figure id=\"getImg\">");
        out.println("<img id=\"graphImg\" src=\"images/OnlyGet.png\" alt=\"Image not found\">");
        out.println("</figure>");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>");
        out.println("<p id=\"capBlock\">Script works only GET request!</p>");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public void destroy() {
    }
}
