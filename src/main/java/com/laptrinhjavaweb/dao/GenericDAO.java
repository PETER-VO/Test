package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;

public interface GenericDAO <T> {
	<T> List<T>	query(String sql, RowMapper<T> rowMapper, Object... paramater);
	void update(String sql, Object... parameters);
	Long insert(String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
