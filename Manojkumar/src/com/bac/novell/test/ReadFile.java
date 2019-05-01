package com.bac.novell.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ReadFile {

	private List<File> lstFile = null;
	private String pathName = null;

	public ReadFile(String pathName) {
		this.pathName = pathName;
	}

	public void sortLastDate() {

		if (lstFile == null) {
			lstFile = (List<File>) new LstFile().getFileFromSystem(pathName);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:MM:SS:SSS");

		Collections.sort(lstFile, new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {

				/*if (o1.lastModified() < o2.lastModified()){
					return -1;
				}else if ((o1.lastModified() > o2.lastModified())){
					return +1;
				}*/
				return sdf.format(o2.lastModified()).compareTo(sdf.format(o1.lastModified()));
				//return 0;
			}
		});

		
		for (File lst : lstFile){
			System.out.println("File Name:" +lst.getName() +"Last Date:" + sdf.format(new Date(lst.lastModified())));
		}
	}
}
