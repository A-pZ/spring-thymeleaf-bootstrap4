package com.github.apz.springsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;

@Service
public class ParentService {

	@Autowired
	private ItemService itemService;

	@Transactional
	public List<Item> getItemList(ItemCondition condition) {
		return itemService.getItemList(condition);
	}
}
