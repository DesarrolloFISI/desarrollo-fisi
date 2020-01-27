package com.udemy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.entity.Document;

@Repository("documentRepository")
public interface DocumentRepository extends JpaRepository<Document, Serializable> {
	
	public abstract Document findById(int id);
	public abstract List<Document> findByCodigoDoc(String codigo);

}
