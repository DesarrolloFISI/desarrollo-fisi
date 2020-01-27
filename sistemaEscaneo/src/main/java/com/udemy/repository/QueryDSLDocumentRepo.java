package com.udemy.repository;

import org.springframework.stereotype.Repository;

import com.udemy.entity.QDocument;

@Repository("queryDSLDocumentRepo")
public class QueryDSLDocumentRepo {

	private QDocument qDocument = QDocument.document;
	
}
