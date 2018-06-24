/**
 *
 */
package com.github.apz.springsample.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author A-pZ
 *
 */
@Getter @Setter @ToString
public class User {
	private int id;
	private String name;
	private List<DayOfWeek> dayOfWeekList;
}
