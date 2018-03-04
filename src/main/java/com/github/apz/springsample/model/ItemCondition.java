package com.github.apz.springsample.model;

import com.github.apz.springsample.typehandler.TrueOrFalse;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ItemCondition {

	private int id;

	private String name;

	private TrueOrFalse delFlag;

}
