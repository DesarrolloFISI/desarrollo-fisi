package com.udemy.services;

import java.util.List;

import com.udemy.entity.Document;
import com.udemy.model.DocumentModel;

public interface DocumentService {
	public abstract DocumentModel addDocument(DocumentModel documentModel);
	public abstract List<DocumentModel> listAllDocuments();
	public abstract Document FindDocumentById(int id);
	public abstract void removeDocument(int id);
	public abstract DocumentModel findDocumentByIdModel(int id);
}
