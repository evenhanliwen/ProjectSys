package org.project.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/pages/main/template")
public class TemplateController{
	@RequestMapping(value="/doUpload", method=RequestMethod.POST)
	public String doUploadFile(MultipartFile file){
		try {
			if(file.getInputStream() != null){
				System.out.println("file.getInputStream()!= null");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
}