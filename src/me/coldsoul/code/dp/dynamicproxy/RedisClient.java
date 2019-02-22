package me.coldsoul.code.dp.dynamicproxy;

import java.util.HashMap;
import java.util.Map;

public class RedisClient implements CacheClient {
	private Map<String, String> store = new HashMap<>();// 使用map 模拟

	@Override
	public void putCache(String key, String value) {
		store.put(key, value);
	}

	@Override
	public void removeCache(String key) {
		store.remove(key);
	}

	@Override
	public String getCache(String key) {
		return store.get(key);
	}
}
