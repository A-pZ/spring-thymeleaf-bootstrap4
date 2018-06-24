/**
 *
 */
package com.github.apz.springsample.model;

import java.util.Optional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author A-pZ
 *
 */
@Getter @Setter @ToString
public class Note {
	private Integer id;
	private Optional<String> taskNote;
}
