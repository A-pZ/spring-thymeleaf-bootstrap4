package com.github.apz.springsample.model;

import com.github.apz.springsample.typehandler.TrueOrFalse;

import lombok.Data;

@Data
public class Item {
	private int id;

	private String name;

	private TrueOrFalse delFlag;


}
