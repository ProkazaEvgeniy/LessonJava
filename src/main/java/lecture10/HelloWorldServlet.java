package lecture10;


import lecture9V1.dao.BooksDao;

import lecture9V1.dao.impl.BooksDaoIpml;
import lecture9V1.general.Factory;
import lecture9V1.table.Books;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


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
        Factory factory = Factory.getInstance();
        BooksDao booksDao = factory.getBooksDao();

        try {
            Books res = booksDao.getBooks(1);
            request.setAttribute("book", res);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("./like.jsp");
        dispatcher.forward(request, response);
        response.sendRedirect("./like.jsp");


    }

    public void destroy()
    {
        // do nothing.
    }
}