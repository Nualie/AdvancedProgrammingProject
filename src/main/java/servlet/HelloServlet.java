package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.InternEntity;
import model.InternSB;

@WebServlet("/display")
public class HelloServlet extends HttpServlet {
    private String message = "placeholder";
    @EJB
    private InternSB internSB;
    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<InternEntity> allInterns = internSB.getInterns();
        request.setAttribute("internList", allInterns);
        request.getRequestDispatcher("/display.jsp").forward(request,response);
    }

    public void destroy() {

    }
}

