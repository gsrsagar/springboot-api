package com.sagarstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sagarstack.entities.FileEntity;

public interface FileRepository  extends JpaRepository<FileEntity, Long> {

}
