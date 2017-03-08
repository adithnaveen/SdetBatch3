package com.fannie.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File f = new File("smaple.txt");

		// System.out.println(f.createNewFile());
		// System.out.println(f.delete());
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getPath());
		System.out.println(f.getTotalSpace());
		System.out.println(f.canRead());
		System.out.println("Car write "  + f.canWrite());
		System.out.println("is File " +f.isFile());
		System.out.println("is Directory " + f.isDirectory());
	}
}
