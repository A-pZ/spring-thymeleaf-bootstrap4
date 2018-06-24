/**
 *
 */
package com.github.apz.springsample.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 曜日＋特殊な日付を扱う列挙型。0:日曜、1:火曜…、6:土曜、7:祝日
 *
 */
@Getter @AllArgsConstructor
public enum DayOfWeek {

	SUNDAY(0, "日曜"),
	MONDAY(1, "月曜"),
	TUESDAY(2, "火曜"),
	WEDNESDAY(3, "水曜"),
	THURSDAY(4, "木曜"),
	FRIDAY(5, "金曜"),
	SATURDAY(6, "土曜"),
	HOLIDAY(7, "祝日"),
	NO_DEFINITION(-1, "未定義")
	;

	private int code;
	private String label;

	/**
	 * 曜日のコード値に対する列挙子を返す。該当する曜日がなければ未定義を返す。
	 * @param input 曜日コード
	 * @return 曜日の列挙子
	 */
	public static DayOfWeek getDayOfWeek(int input) {
		return Arrays.stream(values()).filter(elem -> input == elem.getCode()).findFirst().orElse(NO_DEFINITION);
	}
}
