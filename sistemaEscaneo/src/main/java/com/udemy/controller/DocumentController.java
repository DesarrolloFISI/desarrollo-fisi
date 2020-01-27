package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.constant.ViewConstant;
import com.udemy.model.DocumentModel;
import com.udemy.services.DocumentService;

@Controller
@RequestMapping("/documents")
public class DocumentController {
	
	private static final Log LOG = LogFactory.getLog(DocumentController.class);
	
	@Autowired
	@Qualifier("documentServiceImpl")
	private DocumentService documentService;

	@GetMapping("/cancel")
	private String cancel() {
		return "redirect:/documents/showdocuments";
	}
	
	@GetMapping("/documentform")
	private String redirectDocumentForm(@RequestParam(name="id", required=false) int id, Model model) {
		DocumentModel document = new DocumentModel();
		if(id != 0) {
			document = documentService.findDocumentByIdModel(id);
		}
		model.addAttribute("documentModel", document);
		return ViewConstant.DOCUMENT_FORM;
	}
	
	
	@PostMapping("/adddocument")
	private String addDocument(@ModelAttribute(name="documentModel") DocumentModel documentModel, Model model) {
		LOG.info("METHOD: addDocument() --- PARAMS: " + documentModel.toString());
		
		if(null != documentService.addDocument(documentModel)) {
			model.addAttribute("result",1);
		}else {
			model.addAttribute("result",0);
		}
		return "redirect:/documents/showdocuments";
	}
	
	@GetMapping("/showdocuments")
	public ModelAndView showDocuments() {
		ModelAndView mav = new ModelAndView(ViewConstant.DOCUMENTS);
		mav.addObject("documents",documentService.listAllDocuments());
		return mav;
	}
	
	@GetMapping("/removedocument")
	public ModelAndView removeDocument(@RequestParam(name="id", required=true) int id) {
		documentService.removeDocument(id);
		return showDocuments();
	}
}
