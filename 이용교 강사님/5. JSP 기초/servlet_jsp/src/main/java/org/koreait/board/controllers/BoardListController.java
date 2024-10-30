// @WebServlet Annotation

package org.koreait.board.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {

    // 마찬가지로 Protected -> public 변경 후 사용
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("게시판 목록");

        // body의 형식 무조건!!
        resp.setContentType("text/html; charset=UTF-8");

        // body 출력 stream
        PrintWriter out = resp.getWriter();
        out.write("<h1>게시판 목록</h1>");
    }
}