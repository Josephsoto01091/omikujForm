package com.joseph.OmikujiForm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

public class formController {
	@RequestMapping("/")
	public String Index() {
		return "Index.jsp";
	}
	
	@RequestMapping("/show")
	public String show() {
		return "Show.jsp";
	}
	
	@PostMapping(value="/omikuji")
	public String formInformation(
		@RequestParam(value="quantity")Integer quantity,
		@RequestParam(value="city")String city,
		@RequestParam(value="name")String name,
		@RequestParam(value="hobby")String hobby,
		@RequestParam(value="livingThing")String livingThing,
		@RequestParam(value="comment")String comment,
		HttpSession session
			) {
		session.setAttribute("quantity", quantity);
		session.setAttribute("city",city);
		session.setAttribute("name",name);
		session.setAttribute("hobby",hobby);
		session.setAttribute("livingThing",livingThing);
		session.setAttribute("comment",comment);
		return "redirect:/show";
	}
	
	
}