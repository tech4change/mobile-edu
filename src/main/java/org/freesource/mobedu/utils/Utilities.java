/**
 * 
 */
package org.freesource.mobedu.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * All methods here are for general utility purpose All methods in this class
 * have to be public static and final
 */
public class Utilities implements Constants{
	private static String classMsg = "";

	public static final String getStdClass(int cl) {
		String value = "";
		switch (cl) {
		case 10:
			value = TENTH_CLASS;
			classMsg = "Registered for 10th Std successfully.<br />";
			break;
		default:
			value = "";
			classMsg = "Invalid standard";
		}
		return value;
	}

	public static final String getStdClass(String cl) {
		String value = "";
		if (cl.equals(TENTH_CLASS)) {
			value = TENTH_CLASS;
			classMsg = "Registered for 10th Std successfully.<br />";
		} else {
			value = "";
			classMsg = "Invalid standard. ";
		}
		return value;
	}

	public static final String getStdReplyMessage() {
		return classMsg;
	}

	public static final String getCurrentTimestamp() {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		String d = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").format(c
				.getTime());
		return d;
	}

}
