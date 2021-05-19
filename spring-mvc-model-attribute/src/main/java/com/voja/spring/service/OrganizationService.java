package com.voja.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voja.spring.dao.OrganizationDao;
import com.voja.spring.domain.Organization;

@Service
public class OrganizationService {
	
	
	@Autowired
	private OrganizationDao organizationDao;
	
	public List<Organization> getOrgList()
	{
		List<Organization> orgList = organizationDao.getAllOrganization();
		return orgList;
		
		
	}

}
