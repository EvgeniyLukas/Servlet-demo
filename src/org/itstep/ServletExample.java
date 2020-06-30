package org.itstep;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet")
public class ServletExample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String name = request.getParameter("name");
        String last_name = request.getParameter("last_name");

//        PrintWriter out = response.getWriter();
//        out.println("title: " + title + "<br>");
//        out.println("name: " + name + "<br>");
//        out.println("last_name: " + last_name + "<br>");

//        request.setAttribute("title", title);
//        request.setAttribute("name", name);
//        request.setAttribute("last_name", last_name);
//        request.getRequestDispatcher("developer.jsp").forward(request, response);


        Resume resume = new Resume();
        Developer developer = new Developer();

        developer.setFirstName(name);
        developer.setLastName(last_name);
        resume.setDeveloper(developer);
        resume.setTitle(title);

        request.setAttribute("resume", resume);
        request.getRequestDispatcher("developer.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;");
        out.println("<h1>Home</h1>");

    }
}
