package com.voja.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.voja.spring.domain.Organization;
import com.voja.spring.service.OrganizationService;

@Controller
public class OrganizationController {
	@Autowired
	private OrganizationService organizationService;
	
	
	@RequestMapping("/location")
	public String addLocation()
	{
		return "location";
		
	}
	
	@RequestMapping("/ListOrgs")
	public String ListOrganizations(Model model)
	{
		List<Organization> orgs= organizationService.getOrgList();
		model.addAttribute("orgList",orgs);
		return "ListOrganizations";
	}

}
