package com.sagarstack.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class FileEntity { // file_entity

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String fielName;
	private String fileType;
	
	@Lob
	private byte [] data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFielName() {
		return fielName;
	}

	public void setFielName(String fielName) {
		this.fielName = fielName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public FileEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileEntity(Long id, String fielName, String fileType, byte[] data) {
		super();
		this.id = id;
		this.fielName = fielName;
		this.fileType = fileType;
		this.data = data;
	}
	
	
	
}
