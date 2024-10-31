// @WebServlet Annotation

package org.koreait.board.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.koreait.board.entities.Board;
import org.koreait.board.service.BoardInfoService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardInfoService infoService = new BoardInfoService();

        List<Board> items = infoService.getList();

        req.setAttribute("items", items);

        // 항상 출력 전에 27~31행 같은 속성값을 먼저 정의할 것
        
        // 치환 = forward
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/board/list.jsp");
        rd.forward(req, resp);
    }

    /*
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
     */
}