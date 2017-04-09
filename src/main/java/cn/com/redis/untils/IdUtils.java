package cn.com.redis.untils;

import java.util.UUID;

public class IdUtils {
	/**
	 * 获得唯一ID
	 * 
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
