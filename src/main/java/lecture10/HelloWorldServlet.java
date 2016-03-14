package lecture10;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorldServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException
    {
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        int temp = Integer.parseInt(request.getParameter("temp"));
        String name = request.getParameter("name");
        System.out.println("We are in servlet");
        request.setAttribute("name", name);
        request.setAttribute("value", temp);
        RequestDispatcher dispatcher = request.getRequestDispatcher("./like.jsp");
        dispatcher.forward(request, response);
//        response.sendRedirect("./like.jsp");
    }

    public void destroy()
    {
        // do nothing.
    }
}