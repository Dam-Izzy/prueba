package com.examenpractico.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenpractico.repository.GenderRepository;
import com.examenpractico.service.GenderService;

@Service
public class GenderServiceImpl implements GenderService {
	
	@Autowired
	GenderRepository genderRepository;
	
	@Override
	public boolean findGenderById(int genderId) {
		
		return genderRepository.existsById(genderId);
	}

}
