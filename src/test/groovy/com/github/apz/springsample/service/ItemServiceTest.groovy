/**
 *
 */
package com.github.apz.springsample.service

import static org.mockito.Matchers.*
import static org.mockito.Mockito.*

import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations

import com.github.apz.springsample.model.Item
import com.github.apz.springsample.model.ItemCondition
import com.github.apz.springsample.repository.ItemRepository

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author A-pZ
 *
 */
@Unroll
class ItemServiceTest extends Specification {
	@InjectMocks
	ItemService sut

	@Mock
	ItemRepository itemRepository

	def setup() {
		MockitoAnnotations.initMocks(this)
	}

	def "getItemList_#test"() {
		when:
		ItemCondition condition = ItemCondition.builder()
			.id(id)
			.name(name)
			.build()

		List<Item> searchResult = Arrays.asList(new Item());

		doReturn(searchResult).when(itemRepository).getItemList(condition)

		def result = sut.getItemList(condition)
		verify(itemRepository, times(time)).getItemList(any())

		then:
		true

		where:
		id | name || time | test
		0  | "a"  || 1    | "idが正常範囲"
		-1 | "a"  || 0    | "idが異常値"

	}
}
