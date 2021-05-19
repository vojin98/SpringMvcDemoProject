package com.voja.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import com.voja.spring.domain.Organization;

public interface OrganizationDao {

	
	public void setDataSource(DataSource dataSource);
	
		
	
	
	public boolean create(Organization org);
	
		
	
	
	public Organization getOrganization (Integer id);
	
	
	public List<Organization> getAllOrganization();
	public boolean delete(Organization org);
	
	
	public boolean update(Organization org);
	
	public void cleanUp();
	
}
