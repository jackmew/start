package com.zestiria.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zespri E-mail:wonderfuljack123@gmail.com
 * @version 2015年6月7日 上午2:14:49
 * 
 */

@Controller
@RequestMapping("/")
public class StartController {
	
	@RequestMapping(method = RequestMethod.GET)
    String home() {
//        return "redirect:/content/html/index.html";
		return "redirect:/dist/index.html";
    }

}
