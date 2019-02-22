package me.coldsoul.code.dp._util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LOGGER {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static void info(Object... message) {
		String log = sdf.format(new Date());
		for (Object object : message) {
			if (object != null) {
				log += "\t" + object.toString();
			}
		}
		System.out.println(log);
	}
}
