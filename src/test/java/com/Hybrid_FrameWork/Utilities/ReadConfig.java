package com.Hybrid_FrameWork.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;// Properties is a class in util package

	public ReadConfig() { // COSTRUCTOR

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		}

		catch (Exception e) {

			System.out.println("Exception is" + e.getMessage());

		}
	}

	public String getApplicationUrl() {
		String url = pro.getProperty("url");
		return url;

	}

	public String getUserName() {

		String username = pro.getProperty("username");
		return username;

	}

	public String getPassword() {

		String password = pro.getProperty("password");
		return password;
	}

}
