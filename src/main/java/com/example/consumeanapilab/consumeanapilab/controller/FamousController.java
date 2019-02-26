package com.example.consumeanapilab.consumeanapilab.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.consumeanapilab.consumeanapilab.ApiService;
import com.example.consumeanapilab.consumeanapilab.model.CompleteList;
import com.example.consumeanapilab.consumeanapilab.model.TinyList;

@Controller
public class FamousController {
	@Autowired
	ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		List<TinyList> tiny = apiService.printTinyList();
		
		return new ModelAndView("index", "tiny", tiny);
	}
	@RequestMapping("/completelist")
	public ModelAndView showCompleteList() {
		List<CompleteList> complete = apiService.printCompleteList();
		Collections.sort(complete);
		return new ModelAndView("complete-page", "complete", complete);
	}
}
