package com.debjit.blog.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.debjit.blog.services.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {

		// file name
		String name = file.getOriginalFilename();
		// abc.png
		
		
		// random name generate for file to avoid same name collision in later upload
		String randomID = UUID.randomUUID().toString();
		String fileNamesString = randomID.concat(name.substring(name.lastIndexOf(".")));
		
		// full path
		String filePath = path + File.separator +fileNamesString;
		
		
		// create folder if not created
		File file2 = new File(path);
		if (!file2.exists()) {
			file2.mkdir();
		}
		
		
		// file copy
		Files.copy(file.getInputStream(), Paths.get(filePath));
		
		return fileNamesString;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String fullPath = path + File.separator + fileName;
		InputStream inputStream = new FileInputStream(fullPath);
		// db logic to return input stream
		return inputStream;
	}

}
