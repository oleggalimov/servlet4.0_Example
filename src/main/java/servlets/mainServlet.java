package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = {"/test"})
public class mainServlet extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Hello, world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
