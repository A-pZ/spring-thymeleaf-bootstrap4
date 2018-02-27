/**
 *
 */
package com.github.apz.springsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author A-pZ
 *
 */
@Controller
@RequestMapping("/")
public class SimpleController {

	@GetMapping("")
	public ModelAndView index(ModelAndView mnv) {
		mnv.setViewName("index");

		return mnv;
	}
}
