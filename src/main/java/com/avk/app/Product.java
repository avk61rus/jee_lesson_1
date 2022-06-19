package com.avk.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Product", urlPatterns = "/prod")
public class Product extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Product.class);

    // GET http://localhost:8080/jee_lesson_1/prod
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

     int cost =0;
     String title = "Product";

        for (int id = 1; id < 11; id++) {
            title = "apricot" + id; cost = id*10;

            resp.getWriter().printf("<h1>" + "id " + id + ", " + "    title    " + title + ",  " + "cost " + " "
                    + cost +"</h1>");
            resp.getWriter().printf("</body></html>");
        }
    }
}





