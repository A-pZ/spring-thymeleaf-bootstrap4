/**
 *
 */
package com.github.apz.springsample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@GetMapping("")
	public ModelAndView index(ModelAndView mnv) {

		ItemCondition condition = ItemCondition.builder().build();
		List<Item> itemList = itemService.getItemList(condition);

		log.debug("itemList - {}", itemList);
		mnv.addObject(itemList);

		mnv.addObject("message" , "メッセージ");
		mnv.addObject("price", 150);
		// mnv.addObject("direction" , Direction.East);

		mnv.setViewName("index");

		Map<String, Object> map = new HashMap<String, Object>() {{
			put("keya","valuea");
		}};

		mnv.addObject("map", map);

		return mnv;
	}

	@PostMapping("")
	public ModelAndView select(@Valid @ModelAttribute SearchForm form) {
		ModelAndView mnv = new ModelAndView();

		mnv.setViewName("index");
		return mnv;
	}
}
