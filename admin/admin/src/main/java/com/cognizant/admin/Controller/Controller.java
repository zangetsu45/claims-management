package com.cognizant.admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.admin.Repository.AdminRepository;
import com.cognizant.admin.Repository.ClaimsRepository;
import com.cognizant.admin.Repository.ServiceRepository;
import com.cognizant.admin.Repository.TemplateRepository;
import com.cognizant.admin.model.Admin;
import com.cognizant.admin.model.Claims;
import com.cognizant.admin.model.Service;
import com.cognizant.admin.model.Template;


@RestController
@CrossOrigin(origins = "*")
public class Controller{
	@Autowired
    private ClaimsRepository claimsRepository;
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Autowired
	private TemplateRepository templateRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@GetMapping("/getClaims")
	public List<Claims> getDetails() {
		List<Claims> details = claimsRepository.findAll(); 
		return details;
	}
	
	@PostMapping("/saveService")
	public void addService(@RequestBody Service service)
	{
		serviceRepository.save(service);
	}
	
	@PostMapping("/authorize")
	public void addAdmin(@RequestParam Admin admin) {
		adminRepository.save(admin);
		
	}

	@PostMapping("/saveTemplate")
	public void addTemplate(@RequestBody Template template)
	{	try {
		if(serviceRepository.findById(template.getServiceId()).isPresent()==false)
			throw new Exception("No such service exists");
		templateRepository.save(template);
	}catch(Exception e){
		System.out.println(e);
	}
	}
	
	@GetMapping("/getTemplate")
	public List<Template> showTemplate(){
		List<Template> list = new ArrayList<>();
		list = templateRepository.findAll();
		return list;
		
	}
	
	@DeleteMapping("deleteTemplate/{id}")
	public void deleteTemplate(@PathVariable int id) {
		templateRepository.deleteById(id);
	}
	

}