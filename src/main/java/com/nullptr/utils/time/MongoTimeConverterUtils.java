package com.nullptr.utils.time;

import java.util.Calendar;
import java.util.Date;

/**
 * MongoDB时间类型转换器
 *
 * @author nullptr
 * @version 1.0 2020-4-21
 * @since 1.0 2020-4-21
 *
 * @see java.util.Calendar
 */
public class MongoTimeConverterUtils {
	public MongoTimeConverterUtils() {
	}

	/**
	 * 获取Mongo时区的日期
	 *
	 * @param date 本地时区的日期
	 * @return Mongo时区的日期
	 *
	 * @since 1.0
	 */
	public static Date getMongoTime(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		calendar.set(Calendar.HOUR_OF_DAY, hour - 8);
		return calendar.getTime();
	}
}
