package com.github.apz.springsample.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.Item;
import com.github.apz.springsample.model.ItemCondition;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ItemRepository {
	private final SqlSession sqlSession;

	public List<Item> getItemList(ItemCondition condition) {
		return sqlSession.selectList("items.selectItems", condition);
	}
}
