/**
 *
 */
package com.github.apz.springsample.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;
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

		mnv.setViewName("index");

		return mnv;
	}
}
