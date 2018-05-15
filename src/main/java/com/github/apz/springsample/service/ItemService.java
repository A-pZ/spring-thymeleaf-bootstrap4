package com.github.apz.springsample.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;
import com.github.apz.springsample.repository.ItemRepository;

@Service
//@RequiredArgsConstructor
public class ItemService {

	@Inject
	private ItemRepository itemRepository;

	public List<Item> getItemList(ItemCondition condition) {

		if (condition.getId() < 0) {
			return null;
		}

		return itemRepository.getItemList(condition);
	}
}
