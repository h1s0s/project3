package com.javaex.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

		@RequestMapping("main")
		public String Main() {
			
			return "WEB-INF/view/song/index.jsp";
		}

		@RequestMapping("admin")
		public String joinForm() {
			
			return "WEB-INF/view/song/admin.jsp";
		}
}	
	