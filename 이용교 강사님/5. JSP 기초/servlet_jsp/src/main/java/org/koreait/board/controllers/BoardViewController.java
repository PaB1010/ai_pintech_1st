package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board/view")
public class BoardViewController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/board/view.jsp");
        rd.forward(req, resp);

    }


    /*
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");

        // buffer에 추가
        RequestDispatcher rd = req.getRequestDispatcher("/outlines/header.jsp");
        rd.include(req, resp);

        PrintWriter out = resp.getWriter();

        // buffer에 추가
        out.write("<main><h1>메인 영역...</h1></main>");

        // buffer에 추가
        RequestDispatcher rd2 = req.getRequestDispatcher("outlines/footer.jsp");
        rd2.include(req, resp);
    }
     */
}