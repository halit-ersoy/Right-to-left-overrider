package com.hack.righttoleftoverride;

public class Overrider {

	private static final String RIGHT_TO_LEFT_OVERRIDE = "\u202E";
	
	public static String rtloPreview(String filenamePrefix, String filenameExtension, String displayExtension) {
		if(!displayExtension.startsWith(".")){
			displayExtension = "." + displayExtension;
		}
		return filenamePrefix + new StringBuilder(filenameExtension).reverse().toString() + displayExtension;
	}
	
	public static String rtlo(String filenamePrefix, String filenameExtension, String displayExtension) {
		if(!displayExtension.startsWith(".")){
			displayExtension = "." + displayExtension;
		}
		displayExtension = new StringBuilder(displayExtension).reverse().toString();
		return filenamePrefix + RIGHT_TO_LEFT_OVERRIDE + displayExtension + filenameExtension;
	}
	
	public static String getFilePrefix(String filename){
		String prefix = "";
		int i = filename.lastIndexOf('.');
		if (i > 0) {
		    prefix = filename.substring(0,i);
		}
		return prefix;
	}
	
	public static String getFileExtension(String filename){
		String extension = "";
		int i = filename.lastIndexOf('.');
		if (i > 0) {
		    extension = filename.substring(i+1);
		}
		return extension;
	}

}
