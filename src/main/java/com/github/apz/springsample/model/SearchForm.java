/**
 *
 */
package com.github.apz.springsample.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

/**
 * @author A-pZ
 *
 */
@Getter @Setter
public class SearchForm {
	@NotNull
    @Size(min=2, max=5)
	private String id;
}
