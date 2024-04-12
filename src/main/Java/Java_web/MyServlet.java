package Java_web;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet {
    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Здесь можно реализовать обработку GET-запроса
        // например, получить параметры запроса и отправить ответ клиенту
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>MyServlet Response</title></head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        StringBuilder requestBody = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestBody.append(line);
        }

        String[] parts = requestBody.toString().split("=");
        if (parts.length == 2 && "answer".equals(parts[0])) {
            try {
                int num = Integer.parseInt(parts[1].trim());
                String answer = (num == 10) ? "Yes" : "No";
                response.setContentType("text/plain");
                PrintWriter out = response.getWriter();
                out.println("Received POST request with body: " + requestBody.toString());
                out.println("Answer: " + answer);
            } catch (NumberFormatException e) {
                // Handle parsing error
                e.printStackTrace(); // For debugging
            }
        } else {
            // Invalid request format
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid request format");
        }
    }


}
