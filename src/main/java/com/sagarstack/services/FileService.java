package com.sagarstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sagarstack.entities.FileEntity;
import com.sagarstack.repositories.FileRepository;

import java.io.IOException;
import java.util.Optional;


@Service
public class FileService {
	
 @Autowired
 private FileRepository fileRepository;
 
 public FileEntity saveFile(MultipartFile file) throws IOException {
	 FileEntity fileEntity = new FileEntity();
	 fileEntity.setFielName(file.getOriginalFilename());
	 fileEntity.setFileType(file.getContentType());
	 fileEntity.setData(file.getBytes());
	 return fileRepository.save(fileEntity);
 }
 
 public Optional<FileEntity> getFile(Long id) {
	 return fileRepository.findById(id);
 }
}
