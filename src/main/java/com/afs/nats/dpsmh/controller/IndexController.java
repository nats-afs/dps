package com.afs.nats.dpsmh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping({ "/", "/home", "/homepage", "index" })
	public String home() {
		return "index";
	}
}
