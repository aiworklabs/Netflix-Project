package com.yourcompany;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class MovieServlet extends HttpServlet {
    private static final String API_KEY = "6cf29bb331e1f1a41c28df39f439965e";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String apiUrl = "https://api.themoviedb.org/3/movie/popular?api_key=" + API_KEY;

        // Make an HTTP request to TMDb API
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Handle the response...
        // (You'll need to parse the JSON response and generate HTML output)

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><body>");
        out.println("<h1>Movie Data</h1>");
        // Display movie data here
        out.println("</body></html>");
    }
}
