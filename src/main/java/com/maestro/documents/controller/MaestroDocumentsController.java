package com.maestro.documents.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maestro.documents.model.Documents;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MaestroDocumentsController {

	private static Logger log = LoggerFactory.getLogger(MaestroDocumentsController.class);

	@GetMapping("/getDocuments")
	public List<Documents> getDocuments() {
		log.info("Fetching documents");

		List<Documents> docList = new ArrayList<Documents>();

		Documents doc1 = new Documents();
		doc1.setFileName("Security document.pdf");
		Documents doc2 = new Documents();
		doc2.setFileName("Hazardous materials.pdf");
		Documents doc3 = new Documents();
		doc3.setFileName("Some other document.pdf");
		Documents doc4 = new Documents();
		doc4.setFileName("Picture.png");

		docList.add(doc1);
		docList.add(doc2);
		docList.add(doc3);
		docList.add(doc4);

		return docList;

	}
}
