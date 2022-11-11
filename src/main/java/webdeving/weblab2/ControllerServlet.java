package webdeving.weblab2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Определяет тип запроса, и, в зависимости от того, содержит ли запрос информацию о координатах точки и радиусе,
 * делегирует его обработку одному из компонентов: AreaCheckServlet/Страница JSP.
 * Все запросы внутри приложения должны передаваться этому сервлету (по методу GET или POST в зависимости от варианта
 * задания), остальные сервлеты с веб-страниц напрямую вызываться не должны.
 * */
@WebServlet(name = "controllerServlet", value = "/controller-servlet")
public class ControllerServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");


        request.getRequestDispatcher("./area-check-servlet").forward(request, response);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>redirecting...");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
