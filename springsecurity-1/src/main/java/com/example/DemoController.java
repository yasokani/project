package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
@ResponseBody
	@RequestMapping("/")
	public String demo() {
		return "hi simplilearn users";
	}
@ResponseBody
@RequestMapping("/admin")
public String admin() {
	return "hi admin users";
}

@ResponseBody
@RequestMapping("/user")
public String user() {
	return "hi users";
}


}




