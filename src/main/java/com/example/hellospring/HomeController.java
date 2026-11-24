package com.example.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// 웹브라우저에서 http://localhost/home
	// /home 과 스프링 Controller home 메소드와
	// 연결
	@GetMapping("/home")
	// 웹브라우저(/home)요청 -> 스프링 컨트롤러가 /home 주소와
	// 서버의 home()를 연결등록 -> home()함수가 실행되면
	// 타이리프가 등록한 template/home.html 문서가 
	// 결과를 만들어 리턴
	public String home() {
		return "home";
	}
}
