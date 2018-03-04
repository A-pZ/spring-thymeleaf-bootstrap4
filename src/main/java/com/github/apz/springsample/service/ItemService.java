package com.github.apz.springsample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;
import com.github.apz.springsample.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemService {
	private final ItemRepository itemRepository;

	public List<Item> getItemList(ItemCondition condition) {
		return itemRepository.getItemList(condition);
	}
}
