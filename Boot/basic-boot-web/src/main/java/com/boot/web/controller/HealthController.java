package com.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HealthController {
	@RequestMapping("/health")
	public String showHealthPage(Model model) {
		model.addAttribute("health", "HEALTHY");

		return "health";
	}
}
