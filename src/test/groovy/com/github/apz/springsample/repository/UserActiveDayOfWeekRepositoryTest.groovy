/**
 *
 */
package com.github.apz.springsample.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import spock.lang.Specification

/**
 * @author A-pZ
 *
 */
@SpringBootTest
class UserActiveDayOfWeekRepositoryTest extends Specification {

	@Autowired
	UserActiveDayOfWeekRepository sut

	def "ユーザー1_曜日取得"() {
		setup:
		def resultList = sut.selectUserActiveDayOfWeek(1)

		expect:
		resultList
		resultList.size() == 5
		resultList[0].code == 1
		resultList[1].code == 2
		resultList[2].code == 3
		resultList[3].code == 4
		resultList[4].code == 5
	}

	def "ユーザー2_曜日取得"() {
		setup:
		def resultList = sut.selectUserActiveDayOfWeek(2)

		expect:
		resultList
		resultList.size() == 4
		resultList[0].code == 0
		resultList[1].code == 5
		resultList[2].code == 6
		resultList[3].code == 7
	}

	def "ユーザー3_曜日取得"() {
		setup:
		def resultList = sut.selectUserActiveDayOfWeek(3)

		expect:
		resultList
		resultList.size() == 1
		resultList[0].code == 6
	}

	def "ユーザー4_曜日取得"() {
		setup:
		def resultList = sut.selectUserActiveDayOfWeek(4)

		expect:
		resultList.isEmpty()
	}

	def "ユーザー１情報＋曜日一覧"() {
		setup:
		def user = sut.selectUserAndActiveDayOfWeek(1)

		expect:
		user
		user.id == 1
		user.name == 'ユーザー1'
		user.dayOfWeekList
		user.dayOfWeekList.size() == 5
		user.dayOfWeekList[0].code == 1
		user.dayOfWeekList[1].code == 2
		user.dayOfWeekList[2].code == 3
		user.dayOfWeekList[3].code == 4
		user.dayOfWeekList[4].code == 5
	}
}