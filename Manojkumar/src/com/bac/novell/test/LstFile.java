package com.bac.novell.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LstFile implements ReadFileFromSystem {

	List<File> lstFiles = new ArrayList<File>();

	@Override
	public List<File> getFileFromSystem(String path) {
		File filePath = new File(path);

		File[] lstFile = filePath.listFiles();
		if (lstFile != null) {
			for (File lst : lstFile) {
				if (lst.isFile()) {
					lstFiles.add(lst);
				} else if (lst.isDirectory()) {
					System.out.println("Dir:" + lst.getName());
					getFileFromSystem(lst.getAbsolutePath());
				} else if (lst.mkdir()) {
					System.out.println("mkDir:" + lst.getName());
					getFileFromSystem(lst.getAbsolutePath());
				}
			}
		}
		return lstFiles;
	}
}
