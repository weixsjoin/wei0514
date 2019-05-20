package com.weixueshang.datetimeutils;

import java.io.File;
import java.util.Date;

public class DateUtils {

	public static Date getDateByInitMonth(Date src){
		
			return src;
		}
//	返回操作系统临时目录
	public static String getTempDirectory(){
		String utiltemp = System.getProperties().getProperty("java.io.tem");
		return utiltemp;
	}
//	返回操作系统用户目录
	public static String getUserDirectory(){
		String userhome = System.getProperties().getProperty("user.home");
		return userhome;
		
	}

}
