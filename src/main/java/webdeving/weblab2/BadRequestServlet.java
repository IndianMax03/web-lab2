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
@WebServlet(name = "badRequestServlet", value = "/bad-request-servlet")
public class BadRequestServlet extends HttpServlet{

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html lang=\"ru\">");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Error400</title>");
        out.println("<style>");
        out.println("@import url('styles/BadRequest.css');");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1 class=\"first-four\">4</h1>");
        out.println("<div class=\"cog-wheel1\">");
        out.println("<div class=\"cog1\">");
        out.println("<div class=\"top\"></div>");
        out.println("<div class=\"down\"></div>");
        out.println("<div class=\"left-top\"></div>");
        out.println("<div class=\"left-down\"></div>");
        out.println("<div class=\"right-top\"></div>");
        out.println("<div class=\"right-down\"></div>");
        out.println("<div class=\"left\"></div>");
        out.println("<div class=\"right\"></div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class=\"cog-wheel2\">");
        out.println("<div class=\"cog2\">");
        out.println("<div class=\"top\"></div>");
        out.println("<div class=\"down\"></div>");
        out.println("<div class=\"left-top\"></div>");
        out.println("<div class=\"left-down\"></div>");
        out.println("<div class=\"right-top\"></div>");
        out.println("<div class=\"right-down\"></div>");
        out.println("<div class=\"left\"></div>");
        out.println("<div class=\"right\"></div>");
        out.println("</div>");
        out.println("</div>");
        out.println("<p class=\"wrong-para\">");
        out.println("You have to pass X, Y and R params");
        out.println("</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    public void destroy() {
    }

}
