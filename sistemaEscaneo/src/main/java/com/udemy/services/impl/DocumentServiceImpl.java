package com.udemy.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.component.DocumentConverter;
import com.udemy.entity.Document;
import com.udemy.model.DocumentModel;
import com.udemy.repository.DocumentRepository;
import com.udemy.services.DocumentService;

@Service("documentServiceImpl")
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	@Qualifier("documentRepository")
	private DocumentRepository documentRepository;
	
	@Autowired
	@Qualifier("documentConverter")
	private DocumentConverter documentConverter;

	@Override
	public DocumentModel addDocument(DocumentModel documentModel) {
		Document document = documentRepository.save(documentConverter.convertDocumentModel2Document(documentModel));
		return documentConverter.convertDocument2DocumentModel(document);
	}

	@Override
	public List<DocumentModel> listAllDocuments() {
		List<Document> documents = documentRepository.findAll();
		List<DocumentModel> documentsModel = new ArrayList<DocumentModel>();
		for(Document document : documents) {
			documentsModel.add(documentConverter.convertDocument2DocumentModel(document));
		}
		return documentsModel;
	}

	@Override
	public Document FindDocumentById(int id) {
		return documentRepository.findById(id);
	}

	@Override
	public void removeDocument(int id) {
		Document document = FindDocumentById(id);
		
		if(null != document) {
			documentRepository.delete(FindDocumentById(id));
		}
		
	}

	@Override
	public DocumentModel findDocumentByIdModel(int id) {
		return documentConverter.convertDocument2DocumentModel(FindDocumentById(id));
	}
	
	public List<DocumentModel> listDocumentByCodigo(String codigo) {
		List<Document> documents = documentRepository.findByCodigoDoc(codigo);
		List<DocumentModel> documentsModel = new ArrayList<DocumentModel>();
		for(Document document : documents) {
			documentsModel.add(documentConverter.convertDocument2DocumentModel(document));
		}
		return documentsModel;
	}
	
/*	public List<DocumentModel> elegirBusqueda(int valor) {
		switch (valor) {
		case 1: List<Document> documents = documentRepository.findAll();
		case 2:
		case 3:
		}
	
		
	}*/
	
	

}
