package com.voja.spring.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.voja.spring.domain.Organization;

public class OrganizationRowMapper implements RowMapper<Organization> {

	public Organization mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
Organization org = new Organization();
org.setId(rs.getInt("id"));
org.setName(rs.getString("name"));
org.setYear(rs.getInt("year"));
org.setEmployeeCount(rs.getInt("employee_count"));
org.setSlogan(rs.getString("slogan"));

return org;

}

}
