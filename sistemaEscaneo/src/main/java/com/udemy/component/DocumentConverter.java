package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Document;
import com.udemy.model.DocumentModel;

@Component("documentConverter")
public class DocumentConverter {
	
	public Document convertDocumentModel2Document(DocumentModel documentModel) {
		Document document = new Document();
		document.setId(documentModel.getId());
		document.setCodigoDoc(documentModel.getCodigoDoc());
		document.setTipo(documentModel.getTipo());
		document.setAnaquel(documentModel.getAnaquel());
		document.setColumna(documentModel.getColumna());
		document.setSolicitante(documentModel.getSolicitante());
		document.setProveedor(documentModel.getProveedor());
		document.setTema(documentModel.getTema());
		document.setMonto(documentModel.getMonto());
		document.setFecha(documentModel.getFecha());
		return document;
	}
	
	public DocumentModel convertDocument2DocumentModel(Document document) {
		DocumentModel documentModel = new DocumentModel();
		documentModel.setId(document.getId());
		documentModel.setCodigoDoc(document.getCodigoDoc());
		documentModel.setTipo(document.getTipo());
		documentModel.setAnaquel(document.getAnaquel());
		documentModel.setColumna(document.getColumna());
		documentModel.setSolicitante(document.getSolicitante());
		documentModel.setProveedor(document.getProveedor());
		documentModel.setTema(document.getTema());
		documentModel.setMonto(document.getMonto());
		documentModel.setFecha(document.getFecha());
		return documentModel;
	}
	
}