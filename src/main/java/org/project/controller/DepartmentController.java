package org.project.controller;

import org.project.beans.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class DepartmentController{
	private static Logger log = LoggerFactory
			.getLogger(DepartmentController.class);

	// /department/get?departmentCode=001001
	@RequestMapping("/get")
	public @ResponseBody
	Department getDepartment(
			@RequestParam("departmentCode") String departmentCode) {
		log.debug("In getDepartment, departmentCode={}", departmentCode);
		Department department = new Department("001001", "审计局");
		return department;
	}

	// /department/show?departmentCode=001001
	@RequestMapping("/show")
	public String showDepartment(
			@RequestParam("departmentCode") String departmentCode, Model model) {
		log.debug("In showDepartment, departmentCode={}", departmentCode);
		Department department = new Department("001001", "审计局");
		model.addAttribute("department", department);
		return "department_view";
	}

	// /department/view/001001
	@RequestMapping("/view/{departmentCode}")
	public String viewDepartment(
			@PathVariable("departmentCode") String departmentCode, Model model) {
		log.debug("In showDepartment, departmentCode={}", departmentCode);
		Department department = new Department("001001", "审计局");
		model.addAttribute("department", department);
		return "department_view";
	}
	
	@RequestMapping(value="/doUpload", method=RequestMethod.POST)
	public String doUploadFile(MultipartFile file){
		
		return "success";
	}
}