/**
 *
 */
package com.github.apz.springsample.repository

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import com.github.apz.springsample.model.Note

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author A-pZ
 *
 */
@SpringBootTest
@Unroll
class NoteRepositoryTest extends Specification {
	@Autowired
	NoteRepository repository

	def "getSingleNote: Optional取得_#id"() {
		when:
		Note note = repository.getSingleNote(id)

		then:
		note
		note.id == $id
		note.taskNote == Optional.ofNullable($taskNote)

		where:
		id || $id | $taskNote
		1  || 1   | 'ノート1'
		2  || 2   | null
		3  || 3   | 'ノート3'
	}
}
