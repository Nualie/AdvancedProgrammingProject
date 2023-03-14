package servlet;

import java.io.*;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.InternsEntity;
import model.InternSB;

@WebServlet(name = "helloServlet", urlPatterns = {"/display", "/hello-servlet", "/index"})
public class HelloServlet extends HttpServlet {
    private String message = "placeholder";
    @EJB
    private InternSB internSB;
    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        List<InternsEntity> allInterns = internSB.getInterns();
        request.setAttribute("internList", allInterns);
        System.out.print(message);
    }

    public void destroy() {

    }
}

