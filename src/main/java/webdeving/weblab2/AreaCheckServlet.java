package webdeving.weblab2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Осуществляет проверку попадания точки в область на координатной плоскости и формирует HTML-страницу с результатами
 * проверки. Должен обрабатывать все запросы, содержащие сведения о координатах точки и радиусе области.
 * */
@WebServlet(name = "areaCheckServlet", value = "/area-check-servlet")
public class AreaCheckServlet extends HttpServlet {
    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");



        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>iuuuuuuuuuuuuuuu");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
