/**
 *
 */
package com.github.apz.springsample.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.DayOfWeek;
import com.github.apz.springsample.model.User;

import lombok.RequiredArgsConstructor;

/**
 * @author A-pZ
 *
 */
@Repository
@RequiredArgsConstructor
public class UserActiveDayOfWeekRepository {

	private final SqlSessionTemplate sqlSessionTemplate;

	public List<DayOfWeek> selectUserActiveDayOfWeek(int id) {
		return sqlSessionTemplate.selectList("items.selectUserActiveDayOfWeek", id);
	}

	public User selectUserAndActiveDayOfWeek(int id) {
		return sqlSessionTemplate.selectOne("items.selectUserAndActiveDayOfWeek", id);
	}
}
