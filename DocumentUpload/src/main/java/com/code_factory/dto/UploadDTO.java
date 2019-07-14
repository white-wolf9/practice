package com.code_factory.dto;

import org.springframework.web.multipart.MultipartFile;

public class UploadDTO {

	private MultipartFile picture;
	
	
	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}


	public MultipartFile getPicture() {
		return picture;
	}
	
	
	
}
