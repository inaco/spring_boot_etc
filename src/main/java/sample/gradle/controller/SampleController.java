package sample.gradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello.";
	}

	@RequestMapping("/goodbye")
	public String goodBye() {
		return "/Goodbye.html";
	}
}
