package com.weixueshang.Test;

import com.weixueshang.datetimeutils.DateUtils;

public class DateUtilsTest {
//	测试
	public static void main(String[] args) {
		DateUtils dateUtils = new DateUtils();
		String utiltemp = DateUtils.getTempDirectory();
		System.out.println(utiltemp);
		String userDirectory = DateUtils.getUserDirectory();
		System.out.println(userDirectory);
	}
}
