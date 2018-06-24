/**
 *
 */
package com.github.apz.springsample.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.github.apz.springsample.model.Note;

import lombok.RequiredArgsConstructor;

/**
 * @author A-pZ
 *
 */
@Repository
@RequiredArgsConstructor
public class NoteRepository {
	private final SqlSessionTemplate sqlSessionTemplate;

	public Note getSingleNote(Integer id) {
		return sqlSessionTemplate.selectOne("items.getSingleNote", id);
	}
}
