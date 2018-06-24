package com.github.apz.springsample.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.github.apz.springsample.model.DayOfWeek;

public class DayOfWeekTypeHandler extends BaseTypeHandler<DayOfWeek> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, DayOfWeek parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setInt(i, parameter.getCode());
	}

	@Override
	public DayOfWeek getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return DayOfWeek.getDayOfWeek(rs.getInt(columnName));
	}

	@Override
	public DayOfWeek getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return DayOfWeek.getDayOfWeek(rs.getInt(columnIndex));
	}

	@Override
	public DayOfWeek getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return DayOfWeek.getDayOfWeek(cs.getInt(columnIndex));
	}
}
