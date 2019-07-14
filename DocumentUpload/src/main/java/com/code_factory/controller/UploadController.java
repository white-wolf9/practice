package com.code_factory.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.code_factory.dto.UploadDTO;
import com.code_factory.entities.Person;

@RestController
public class UploadController {

	@PersistenceContext
	EntityManager entitymanager;
	
	@Transactional
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String login(@RequestBody MultipartFile file ) {
		InputStream inputStream = null;
		if (file != null) {
            try {
				inputStream = file.getInputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		byte[] array_sample = null; 
		try {
			inputStream.read(array_sample);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Person person = new Person();
		person.setName("Saurav");
		person.setPicture(array_sample);
		entitymanager.merge(person);
		return "Alright";//userServ.performLogin(uploadDTO);
	}
}
