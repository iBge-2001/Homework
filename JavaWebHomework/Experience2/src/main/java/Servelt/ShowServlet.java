package Servelt;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ServletContext servletContext = this.getServletContext();
        String i = (String) servletContext.getAttribute("count");
        resp.getWriter().println("Count TimesServletI页面访问统计CountTimesServlet页面被访问了"+i+"次");

    }
}
