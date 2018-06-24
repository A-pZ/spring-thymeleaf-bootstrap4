/**
 *
 */
package com.github.apz.springsample.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author A-pZ
 *
 */
@Controller
@RequestMapping("/checkbox")
@RequiredArgsConstructor
@Log4j2
public class CheckboxController {
	@GetMapping("")
	public ModelAndView get(ModelAndView mnv) {
		mnv.setViewName("checkbox");

		List<Boolean> checks = Arrays.asList(Boolean.TRUE, Boolean.FALSE);

		mnv.addObject("checks", checks);
		return mnv;
	}

	@PostMapping("")
	public ModelAndView post(ModelAndView mnv, @RequestParam(required=false) List<Integer> checks) {
		log.info(checks);

		if (checks == null) {
			checks = new ArrayList<>();
		}

		List<Boolean> outputChecks = outputChecks(checks);

		mnv.setViewName("checkbox");
		mnv.addObject("checks", outputChecks);
		return mnv;
	}

	private List<Boolean> outputChecks(List<Integer> checks) {
		return IntStream.range(0, 2).boxed().map(i -> checks.contains(i)).collect(Collectors.toList());
	}
}
