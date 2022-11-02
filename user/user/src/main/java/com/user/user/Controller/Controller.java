package com.user.user.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.user.user.Repository.ClaimsRepository;
import com.user.user.model.claims;
import com.user.user.service.service;



@RestController
@CrossOrigin(origins = "*")
public class Controller{

	@Autowired
    private ClaimsRepository claimsRepository;
	
	@Autowired
	private service claimsService;
	
	@PostMapping("/saveClaim")
	public void create(@RequestBody claims claim){
		
		claims save = this.claimsRepository.save(claim);
		System.out.println(save);
	}
	
	@GetMapping("/getClaims/{email}")
	public claims getDetails(@PathVariable String email) {
		claims details = claimsRepository.findByEmail(email).get(); 
		return details;
		
	}
	
	@PutMapping("/updateClaim/{id}")
	public void update(@RequestBody claims claim1,@PathVariable int id){
		claims claim = this.claimsRepository.findById(id).get();
		claim.setFirstName(claim1.getFirstName());
		claim.setMiddleName(claim1.getMiddleName());
		claim.setLastName(claim1.getLastName());
		claim.setAge(claim1.getAge());
		claim.setClaimAMount(claim1.getClaimAMount());
		claimsRepository.save(claim);
		
	}
	
	
}