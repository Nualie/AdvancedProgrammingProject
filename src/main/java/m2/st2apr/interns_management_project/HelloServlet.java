package m2.st2apr.interns_management_project;

import java.io.*;
import java.util.List;

import jakarta.ejb.EJB;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.InternEntity;
import model.InternSB;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    @EJB
    private InternSB internSB;
    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<InternEntity> allInterns = internSB.getInterns();
        for (InternEntity intern : allInterns){
            System.out.println("SHOW LAST NAME : "+ intern.getLastname());
    }


    }
    public void destroy() {

    }
}