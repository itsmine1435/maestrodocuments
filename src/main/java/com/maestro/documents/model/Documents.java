package com.maestro.documents.model;

import java.util.List;

public class Documents {

	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "Documents [fileName=" + fileName + "]";
	}

}
