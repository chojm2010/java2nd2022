package com.mysite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.demo.question.Board;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(Model model) {
		Board board = new Board(1, "타임리프 테스트1", "ㅋㅋㅋ");
		model.addAttribute("board", board);
		return "thymeLeafTest";
	}
}
