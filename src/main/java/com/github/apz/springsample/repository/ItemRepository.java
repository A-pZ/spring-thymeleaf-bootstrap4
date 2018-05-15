package com.github.apz.springsample.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
	private final SqlSessionTemplate sqlSession;

	public List<Item> getItemList(ItemCondition condition) {
		List<Item> result = sqlSession.selectList("items.selectItems", condition);
		return result;
	}
}
