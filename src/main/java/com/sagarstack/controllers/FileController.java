package com.sagarstack.controllers;

import java.io.IOException;
import java.net.http.HttpHeaders;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.sagarstack.entities.FileEntity;
import com.sagarstack.services.FileService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("api/files")
public class FileController {

	
	@Autowired
	private FileService service;
	
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
	 try {
		 FileEntity savedFile = service.saveFile(file);
		 return ResponseEntity.ok("File uploaded successfully withID: " + savedFile.getId());
	 } catch (IOException e) {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed toupload file");
	 }
	}
	
	 @GetMapping("/download/{id}")
	 public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long id){
		 Optional<FileEntity> fileOptional = service.getFile(id);
		 if (!fileOptional.isPresent()) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	 }
	  FileEntity file = fileOptional.get();
	 ByteArrayResource resource = new
			 ByteArrayResource(file.getData());
			  return ResponseEntity.ok()
			  .header(org.springframework.http.HttpHeaders.CONTENT_DISPOSITION , "attachment;filename=" + file.getFielName())

			 .contentType(org.springframework.http.MediaType.parseMediaType(file.getFileType()))
			  .contentLength(file.getData().length)
			  .body(resource);
	}


}
