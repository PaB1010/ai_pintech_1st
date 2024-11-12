package org.koreait.board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    // Annotation의 정보를 바탕으로 찾아 id 라는 변수에 대입해줌
    @GetMapping(path={"/list", "/list/{bid}"})
    // bid 값이 없는 경우를 대비해 false @PathVariable("bid")에서 변경
    public String list(@PathVariable(name = "bid", required = false) String id) {

        System.out.printf("listBid = %s%n", id);
        return "board/list";
    }

    @GetMapping("/write/{bid}")
    public String write(@PathVariable("bid") String bid) {

        System.out.printf("writeBid = %s%n", bid);
        return "board/write";
    }

    @PostMapping("/write")
    public String writePs() {

        return "board/write";
    }
}