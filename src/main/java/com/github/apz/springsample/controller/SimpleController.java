/**
 *
 */
package com.github.apz.springsample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;
import com.github.apz.springsample.model.SearchForm;
import com.github.apz.springsample.service.ItemService;
import com.github.apz.springsample.service.ParentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

/**
 * @author A-pZ
 *
 */
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
@Log4j2
public class SimpleController {

	private final ItemService itemService;

	private final ParentService parentService;

	@GetMapping("")
	public ModelAndView index(ModelAndView mnv) {

		ItemCondition condition = ItemCondition.builder().build();
		List<Item> itemList = parentService.getItemList(condition);

		log.debug("itemList - {}", itemList);
		mnv.addObject(itemList);

		mnv.addObject("message" , "メッセージ");
		mnv.addObject("price", 150);
		// mnv.addObject("direction" , Direction.East);

		mnv.setViewName("index");
		return mnv;
	}

	@PostMapping("")
	public ModelAndView select(@Valid @ModelAttribute SearchForm form) {
		ModelAndView mnv = new ModelAndView();

		mnv.setViewName("index");
		return mnv;
	}
}
