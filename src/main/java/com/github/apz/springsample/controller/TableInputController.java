/**
 *
 */
package com.github.apz.springsample.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;
import com.github.apz.springsample.service.ItemService;
import com.github.apz.springsample.service.ParentService;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author A-pZ
 *
 */
@Controller
@RequestMapping("/table")
@RequiredArgsConstructor
@Log4j2
public class TableInputController {

	private final ItemService itemService;

	private final ParentService parentService;

	@GetMapping("")
	public ModelAndView index(ModelAndView mnv) {

		ItemCondition condition = ItemCondition.builder().build();
		List<Item> itemList = parentService.getItemList(condition);

		log.info("itemList - {}", itemList);
		mnv.addObject(itemList);
		mnv.setViewName("tableinput");
		return mnv;
	}

	@PostMapping("")
	public ModelAndView select(@ModelAttribute InputModel forms) {
		ModelAndView mnv = new ModelAndView();

		log.info("forms - {}", forms);

		ItemCondition condition = ItemCondition.builder().build();
		List<Item> itemList = parentService.getItemList(condition);

		log.info("itemList - {}", itemList);
		mnv.addObject(itemList);
		mnv.setViewName("tableinput");
		return mnv;
	}

	@Data
	public static class InputModel {
		List<String> id;
		List<String> name;
	}

}
