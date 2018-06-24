/**
 *
 */
package com.github.apz.springsample.service

import com.github.apz.springsample.repository.ItemRepository

import spock.lang.Specification

/**
 * @author A-pZ
 *
 */
class ItemServiceSpockTest extends Specification {
	ItemService sut

	def setup() {

	}

	def "Mockテスト"() {
		setup:
		def repository = Mock(ItemRepository)

		when:
		def result = repository.getItemList()

		then:
		1 * repository.getItemList() >> [1,2,3]

		result == [1,2,3]
	}
}
