package me.coldsoul.code.dp.dynamicproxy;

public interface CacheClient {
	void putCache(String key, String value);

	void removeCache(String key);

	String getCache(String key);
}
