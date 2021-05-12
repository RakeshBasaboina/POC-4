package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Jobdao;
import com.example.demo.dao.Userdao;
import com.example.demo.model.Job;

@Service
public class ServicesLayer {

	@Autowired
	public Jobdao jdao;
	
	@Autowired
	public Userdao udao;
	
	public User addUser(User user) {
		return udao.save(user);
	}
	
	public Job addJob(Job job) {
		return jdao.save(job);
	}
	public Optional<Job> getJobById(int jobId) {
		return jdao.findById(jobId);
	}
	public List<Job> getJobByType(String name) {
		return jdao.findByJobType(name);
	}
	public List<Job> getJobByAvailability(String jobavl) {
		return jdao.findByAvailability(jobavl);
	}
	public List<Job> getCountryName(String Country) {
		return jdao.findByCountry(Country);
	}
	public List<Job> getLanguageName(String language) {
		return jdao.findByLanguage(language);
	}
	public List<Job> getPayRateAmount(int payRate) {
		return jdao.findByPayRate(payRate);
	}
}
